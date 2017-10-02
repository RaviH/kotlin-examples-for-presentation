package arete.example.kotlin.`01clazz`

class SomeService(val nnsClient: NNSClient) {

    fun youDoYou(seriesId: String): String {
        return nnsClient.getSeries(seriesId)
    }
}

class NNSClient {
    fun getSeries(seriesId: String) : String {
        return "This is the best String ever"
    }
}