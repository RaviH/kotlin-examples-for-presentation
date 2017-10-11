package arete.example.kotlin.O1clazz

class SomeService(val nnsClient: NNSClient) {

    fun getSeriesId(seriesId: String): String {
        return nnsClient.getSeries(seriesId)
    }

    // Demo of expression syntax
    fun expressionSyntax(seriesId: String): String =
            nnsClient.getSeries(seriesId)
}

class NNSClient {
    fun getSeries(seriesId: String) : String {
        return "This is the best String ever"
    }
}