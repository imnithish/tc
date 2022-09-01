package com.imn.tummoc.data.model

@kotlinx.serialization.Serializable
data class DummyResponseItem(
    val routeTitle: String?,
    val routes: List<Route?>?,
    val totalDistance: Double?,
    val totalDuration: String?,
    val totalFare: Double?
)