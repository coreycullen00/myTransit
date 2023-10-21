import retrofit2.Call
import retrofit2.awaitResponse
import service.RetrofitInstance

suspend fun main(args: Array<String>) {
    val api = RetrofitInstance.api
    val stopsCall = api.getStopsNearLocation(
        apiKey = "20d312a1990692c8e0743aa9cc7323423b5d203bfc38068133c84894dc6a2961",
        latitude = 53.38009068344959,
        longitude = -6.400089345747053,
        distance = 500
    )

    val stops = stopsCall.makeRequest()
    stops?.stops?.sortedBy { it.distance }
    println(stops.toString())
}

private suspend fun <T> Call<T>.makeRequest(): T? {
    val response = this.awaitResponse()
    if (response.isSuccessful) {
        return response.body()
    }
    return null
}
