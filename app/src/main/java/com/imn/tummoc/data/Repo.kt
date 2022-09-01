package com.imn.tummoc.data

import android.content.Context
import android.util.Log
import com.imn.tummoc.data.model.DummyResponse
import com.imn.tummoc.data.model.DummyResponseItem
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.InputStream
import javax.inject.Inject

const val tag = "TUMMOC_DEBUG"

class Repo @Inject constructor(
    @ApplicationContext val context: Context
) {
    val dummyResponse by lazy {
        try {
            val inputStream: InputStream = context.assets.open("response.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            val s = String(buffer, Charsets.UTF_8)
            val format = Json { ignoreUnknownKeys = true }
            return@lazy format.decodeFromString<List<DummyResponseItem>>(s)
        } catch (e: Exception) {
            Log.e(tag, "dummyResponse e: $e")
            return@lazy null
        }
    }

}