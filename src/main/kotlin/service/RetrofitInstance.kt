package service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: TransitApiService by lazy {
        Retrofit.Builder().baseUrl("https://external.transitapp.com") // Base URL of the API
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TransitApiService::class.java)
    }
}