import com.zenika.pipedrive.api.DealsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.zenpipe.interfaceadapters.presenters.CustomFieldsDecoder
import com.zenika.zenpipe.interfaceadapters.presenters.DealDecoderConfig
import com.zenika.zenpipe.interfaceadapters.presenters.OrganizationDecoderConfig
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

        val apiClient = ApiClient()
            .feignBuilder
            .decoder(CustomFieldsDecoder(
                    DealDecoderConfig(dealcustomFieldAccountManagerKey, dealCustomFieldACommercialTrainingKey, dealCustomFieldPortfolioKey)
            ))
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, "https://418a8e76-2c72-4024-ac52-1a2b40c148ea.mock.pstmn.io/")
        val dealApi = apiClient.getDeal(1)
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

}
