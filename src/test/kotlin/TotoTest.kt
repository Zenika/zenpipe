import com.zenika.pipedrive.api.DealsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.pipedrive.model.UpdateDealRequest
import com.zenika.zenpipe.decoder.CustomFieldsDecoder
import com.zenika.zenpipe.decoder.CustomerFieldsEncoder
import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.decoder.DealUpdateDecoderConfig
import com.zenika.zenpipe.entities.*
import feign.Logger
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TotoTest {

    val dealcustomFieldAccountManagerKey: String = "e3605a045b0a8f245ba8f39aa040984fa136a6fb"
    val dealCustomFieldACommercialTrainingKey: String = "65ce8ba3355440b46602fd510c9d0eaedd441be7"
    val dealCustomFieldPortfolioKey: String = "39fa372d6bd7a72582610dc42f63ece2a5386522"

    val orgCustomFieldAccountManagerKey: String = "27bcf77de242b798829f7b3321072bc3336bfa01"
    val orgCustomFieldACommercialTrainingKey: String = "2a888345f9f0fc53d3dab9cc4c6ad85850091259"
    val orgCustomFieldPortfolioKey: String = "e28b36cf2a9468b4ba7798257a3c1c236adf88bd"


    @BeforeEach
    fun setUp() {
       /* val apiClient = ApiClient()
            .feignBuilder
            .decoder(CustomFieldsDecoder(
                DealDecoderConfig(dealcustomFieldAccountManagerKey, dealCustomFieldACommercialTrainingKey, dealCustomFieldPortfolioKey)
            ))
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://418a8e76-2c72-4024-ac52-1a2b40c148ea.mock.pstmn.io/")
        val dealApi = apiClient.getDeal(1)*/
    }

    @AfterEach
    fun tearDown() {


    }

    @Test
    fun display() {
    }

    @Test
    fun getDealAccountManagerById(){

        val apiClient = ApiClient()
            .feignBuilder
            .decoder(
                CustomFieldsDecoder(
                    DealDecoderConfig(dealcustomFieldAccountManagerKey, dealCustomFieldACommercialTrainingKey, dealCustomFieldPortfolioKey)
            )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://462f9edf-ea4f-4cfe-85cc-7e878d68fe40.mock.pstmn.io")

            println(apiClient.getDeal(1).data?.accountManager)



    }

    @Test
    fun setCustomFieldsDeal(){

        val dealsApi = ApiClient()
            .feignBuilder
            .encoder(CustomerFieldsEncoder(mapOf("AM" to 3)))
            .decoder(
                CustomFieldsDecoder(
                    DealUpdateDecoderConfig(dealcustomFieldAccountManagerKey, dealCustomFieldACommercialTrainingKey, dealCustomFieldPortfolioKey)
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://462f9edf-ea4f-4cfe-85cc-7e878d68fe40.mock.pstmn.io")

        val dealResponse = dealsApi.updateDeal(1, UpdateDealRequest()).data


        val organizationId = OrganizationId(dealResponse?.orgId?.value!!)

        val portfolio = dealResponse!!.portfolio?.let { Portfolio(dealCustomFieldPortfolioKey, null, it as HashMap<String, Any>) }

        val accountManager = dealResponse!!.accountManager?.let {
            AccountManagerTraining(dealcustomFieldAccountManagerKey,
                null, it as HashMap<String, Any>)
        }

        val commercialTraining = dealResponse!!.commercialTraining?.let {
            CommercialTraining(dealCustomFieldACommercialTrainingKey,null, it as HashMap<String, Any>)
        }

        val pipelineId = PipelineId(dealResponse!!.pipelineId)

        println(dealResponse.accountManager)

    }

   @Test
   fun getOrganizationAccountManagerById(){
    TODO("get costumer field from Organization ")
   }

}
