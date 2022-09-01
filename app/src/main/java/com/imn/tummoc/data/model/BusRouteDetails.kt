package com.imn.tummoc.data.model

@kotlinx.serialization.Serializable
data class BusRouteDetails(
    val routeDescription: String?,
    val routeName: String?,
    val routeNumber: String?
)