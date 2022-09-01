package com.imn.tummoc.data.model

@kotlinx.serialization.Serializable
data class DummyResponse(
    val list: List<DummyResponseItem?>
)