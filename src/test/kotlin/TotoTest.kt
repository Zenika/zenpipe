import com.zenika.pipedrive.api.DealsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.pipedrive.model.GetDealResponse200
import com.zenika.zenpipe.interfaceadapters.presenters.CustomFieldsDecoder
import feign.Logger
import feign.jackson.JacksonEncoder
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TotoTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun display() {
    }

    @Test
    fun getDealAccountManagerById(){

        val apiClient = ApiClient("api_key","0c954df5e04eb173e3f1dad6b5dbbf61e4a0d03b")
            .feignBuilder
            .decoder(CustomFieldsDecoder())
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://zenika-sandbox.pipedrive.com/v1/")
        val dealApi = apiClient.getDeal(592)
        println(dealApi.data?.accountManager)

    }

    @Test
    fun setCustomFieldsDeal(){
        val apiClient = ApiClient()
            .feignBuilder
            .encoder(JacksonEncoder())
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "")

       // val dealApi = apiClient.updateDeal()
    }

   @Test
   fun getOrganizationAccountManagerById(){
    TODO("get costumer field from Organization ")
   }
    private fun fn (objectResponse: Any, mapCustomFiled :  HashMap<String, Any>){
        if (objectResponse is GetDealResponse200) {
            objectResponse.data?.accountManager = mapCustomFiled as HashMap<String, String>
        }
    }
}
