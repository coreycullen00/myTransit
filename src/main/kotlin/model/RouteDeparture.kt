package model

import com.google.gson.annotations.SerializedName

data class RouteDeparture(
    @SerializedName("global_route_id") val globalRouteId: String,
    @SerializedName("itineraries") val itineraries: List<Itinerary>,
    @SerializedName("mode_name") val modeName: String,
    @SerializedName("real_time_route_id") val realTimeRouteId: String,
    @SerializedName("route_color") val routeColor: String,
    @SerializedName("route_long_name") val routeLongName: String,
    @SerializedName("route_network_id") val routeNetworkId: String,
    @SerializedName("route_network_name") val routeNetworkName: String,
    @SerializedName("route_short_name") val routeShortName: String,
    @SerializedName("route_text_color") val routeTextColor: String,
    @SerializedName("route_type") val routeType: Int,
    @SerializedName("sorting_key") val sortingKey: String,
    @SerializedName("tts_long_name") val ttsLongName: String,
    @SerializedName("tts_short_name") val ttsShortName: String
)

data class RouteDepartures(
    @SerializedName("route_departures") val routeDepartures: List<RouteDeparture>
)