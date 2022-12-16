package com.example.marvelchampionstracker.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marvelchampionstracker.ui.home.HomeScreen

@Composable
fun CustomNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = Destinations.HOME.name
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Destinations.HOME.name) {
            HomeScreen()
        }
    }
}