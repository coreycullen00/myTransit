package model

import com.google.gson.annotations.SerializedName

data class Stop(
    @SerializedName("distance") val distance: Int,
    @SerializedName("global_stop_id") val globalStopId: String,
    @SerializedName("location_type") val locationType: Int,
    @SerializedName("parent_station_global_stop_id") val parentStationGlobalStopId: String,
    @SerializedName("route_type") val routeType: Int,
    @SerializedName("stop_lat") val latitude: Double,
    @SerializedName("stop_lon") val longitude: Double,
    @SerializedName("stop_name") val name: String,
    @SerializedName("stop_code") val code: String,
    @SerializedName("rt_stop_id") val id: String,
    @SerializedName("wheelchair_boarding") val wheelchairBoarding: Int
)

data class Stops(
    @SerializedName("stops") val stops: List<Stop>
)