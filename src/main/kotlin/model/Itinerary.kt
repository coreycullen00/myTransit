package model

import com.google.gson.annotations.SerializedName

data class Itinerary(
    @SerializedName("branch_code") val branchCode: String,
    @SerializedName("direction_headsign") val directionHeadsign: String,
    @SerializedName("direction_id") val directionId: Int,
    @SerializedName("headsign") val headsign: String,
    @SerializedName("merged_headsign") val mergedHeadsign: String,
    @SerializedName("schedule_items") val scheduleItems: List<ScheduleItem>
)