import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.RuntimeJsonMappingException
import com.zenika.pipedrive.decoder.ZenJacksonDecoder
import com.zenika.pipedrive.model.GetDealResponse200
import com.zenika.pipedrive.model.GetOrganizationResponse200
import feign.Response
import feign.Util
import java.io.BufferedReader
import java.io.IOException
import java.lang.reflect.Type
import kotlin.reflect.KFunction2

class CustomFieldsDecoder constructor() : ZenJacksonDecoder() {


    // ajouter un constructeur qui prend en prametre une hashmap
    var config: Map<String, (String, Any, JsonNode) -> Any> = mapOf()


    override fun decode(response: Response?, type: Type?): Any? {

        if (response?.status() == 404 || response?.status() == 204)
            return Util.emptyValueOf(type)
        if (response?.body() == null)
            return null

        var reader = response?.body()?.asReader(response.charset())

        if (!reader?.markSupported()!!) {
            reader = BufferedReader(reader, 1)
        }

        reader.mark(1);
        if (reader.read() == -1) {
            return null
        }
        reader.reset()

        val result = super.decode(response, type)

        val jsonNode: JsonNode = mapper.readTree(reader)

        config = createConfig()
        var tmpResult = result
        config.forEach { item ->
            val fn = item.value
            val key = item.key
            tmpResult = fn(key, tmpResult, jsonNode)
        }
        return tmpResult
    }

    private fun getCustomFields(
        jsonNode: JsonNode,
        customFieldKey: String
    ): HashMap<String, String> {
        val typeReference: TypeReference<HashMap<String, Any>> = object : TypeReference<HashMap<String, Any>>() {}

        val mapCustomerField = mapper.convertValue(
            jsonNode["data"][customFieldKey],
            typeReference
        )

        return mapCustomerField as HashMap<String, String>
    }

    private fun createConfig(): Map<String, (String, Any, JsonNode) -> Any> {

        val setAccountManager: (String, Any, JsonNode) -> Any =
            { key: String, objectResponse: Any, jsonNode: JsonNode ->
                if (objectResponse is GetDealResponse200) {
                    objectResponse.data?.accountManager = getCustomFields(jsonNode, key)
                }
                objectResponse
            }

        val setCommercialTraining: (String, Any, JsonNode) -> Any =
            { key: String, objectResponse: Any, jsonNode: JsonNode ->
                if (objectResponse is GetDealResponse200) {
                    objectResponse.data?.commercialTraining = getCustomFields(jsonNode, key)
                }
                objectResponse
            }

        val setPortfolio: (String, Any, JsonNode) -> Any = { key: String, objectResponse: Any, jsonNode: JsonNode ->
            if (objectResponse is GetDealResponse200) {
                objectResponse.data?.portfolio = getCustomFields(jsonNode, key)
            }
            objectResponse
        }

        val config: Map<String, (String, Any, JsonNode) -> Any> = mapOf(
            "e3605a045b0a8f245ba8f39aa040984fa136a6fb" to setAccountManager,
   //         "65ce8ba3355440b46602fd510c9d0eaedd441be7" to setCommercialTraining,
    //        "39fa372d6bd7a72582610dc42f63ece2a5386522" to setPortfolio,
        )

        return config

    }
}
