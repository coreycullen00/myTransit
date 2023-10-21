package service

import model.Stops
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface TransitApiService {

    @GET("/v3/public/nearby_stops")
    fun getStopsNearLocation(
        @Header("apiKey") apiKey: String,
        @Query(value = "lon") longitude: Double,
        @Query(value = "lat") latitude: Double
    ): Call<Stops>

    @GET("/v3/public/nearby_stops")
    fun getStopsNearLocation(
        @Header("apiKey") apiKey: String,
        @Query(value = "lon") longitude: Double,
        @Query(value = "lat") latitude: Double,
        @Query(value = "max_distance") distance: Int
    ): Call<Stops>
}