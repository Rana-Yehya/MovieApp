package com.example.movieapp.navigation
import java.lang.IllegalArgumentException
enum class MovieScreens {

    HomeScreen,
    DetailsScreen;

    // To call a function without the need to instantiate the class
    // Like statis keyword

    companion object{
        fun fromRoute(route: String?):MovieScreens
        =when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route ${route} does not exist")

        }


    }
}