package com.mst.cortes.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mst.cortes.views.AddView
import com.mst.cortes.views.HomeView

@Composable
fun NavManager(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home")
    {
        composable("Home") { HomeView()  }
        composable("Add") { AddView()  }
    }

}