package model

import com.google.gson.annotations.SerializedName

data class ScheduleItem(
    @SerializedName("departure_time") val departureTime: Int,
    @SerializedName("is_cancelled") val isCancelled: Boolean,
    @SerializedName("is_real_time") val isRealTime: Boolean,
    @SerializedName("rt_trip_id") val rtTripId: String,
    @SerializedName("scheduled_departure_time") val scheduledDepartureTime: Int,
    @SerializedName("trip_search_key") val tripSearchKkey: String,
    @SerializedName("wheelchair_accessible") val wheelchairAccessible: Int
)
