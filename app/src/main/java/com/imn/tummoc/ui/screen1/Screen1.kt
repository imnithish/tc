package com.imn.tummoc.ui.screen1

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.imn.tummoc.ui.screen1.components.SearchTopBar

@Composable
fun Screen1(screen1ViewModel: Screen1ViewModel = hiltViewModel()) {

   Scaffold(topBar = {
       SearchTopBar(modifier = Modifier.padding(16.dp))
   }) {

   }
}