package service

import model.RouteDepartures
import model.Stops
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface TransitApiService {

    @GET("/v3/public/nearby_stops")
    fun getStopsNearLocation(
        @Header("apiKey") apiKey: String,
        @Query("lon") longitude: Double,
        @Query("lat") latitude: Double
    ): Call<Stops>

    @GET("/v3/public/nearby_stops")
    fun getStopsNearLocation(
        @Header("apiKey") apiKey: String,
        @Query("lon") longitude: Double,
        @Query("lat") latitude: Double,
        @Query("max_distance") distance: Int
    ): Call<Stops>

    @GET("/v3/public/stop_departures")
    fun getStopDepartures(
        @Header("apiKey") apiKey: String,
        @Query("global_stop_id") globalStopId: String
    ): Call<RouteDepartures>
}