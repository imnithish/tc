package com.imn.tummoc.data.model


@kotlinx.serialization.Serializable
data class Trail(
    val distance: Double?,
    val fareStage: String?,
    val latitude: Double?,
    val longitude: Double?,
    val name: String?,
    val seq: Int?,
)