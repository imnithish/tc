package com.imn.tummoc.data.model

@kotlinx.serialization.Serializable
data class Route(
    val busRouteDetails: BusRouteDetails?,
    val destinationLat: Double?,
    val destinationLong: Double?,
    val destinationTime: List<String?>?,
    val destinationTitle: String?,
    val distance: Double?,
    val duration: String?,
    val fare: Double?,
    val medium: String?,
    val routeName: String?,
    val sourceLat: Double?,
    val sourceLong: Double?,
    val sourceTime: List<String?>?,
    val sourceTitle: String?,
    val trails: List<Trail?>?
)