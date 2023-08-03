package com.example.movieapp.screen_Home

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.navigation.MovieScreens
import com.example.movieapp.screens.ScreenDetails.DetailsScreen
import com.example.movieapp.screens.ScreenHome.HomeScreen

@Composable
fun MovieNavigation(){

    val navController = rememberNavController()
    NavHost(navController = navController,
                    startDestination = MovieScreens.HomeScreen.name
    ){
        composable(MovieScreens.HomeScreen.name){

            HomeScreen(navController = navController)
        }
        // www.google.com/sign_in/{id=26}
        composable(MovieScreens.DetailsScreen.name+"/{movie}",
                        arguments = listOf(navArgument(name = "movie") {type = NavType.StringType})
        ){ NavBackStackEntry ->

            DetailsScreen(navController = navController,
                                NavBackStackEntry.arguments?.getString("movie"))
        }
    }
}