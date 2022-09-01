package com.imn.tummoc.ui.screen1

import androidx.lifecycle.ViewModel
import com.imn.tummoc.data.Repo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen1ViewModel @Inject constructor(
    private val repo: Repo
) : ViewModel() {


    fun getDummyResponse() = repo.dummyResponse
}