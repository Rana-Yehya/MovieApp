package com.example.movieapp.screens.ScreenHome

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.data.GetMovies
import com.example.movieapp.data.Movie
import com.example.movieapp.navigation.MovieScreens
import com.example.movieapp.widgets.MovieRow

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar(  backgroundColor = Color.Blue.copy(alpha = 0.5f),
            elevation = 4.dp) {
            Text(text = "Movies", modifier = Modifier.padding(horizontal = 20.dp))
        }


    },) {
        MainContent(navController = navController)
    }


}

@Composable
fun MainContent(navController: NavController,
    movies:List<Movie> = GetMovies()
){
    Surface(color = MaterialTheme.colors.background) {
        Column(){
            LazyColumn(){
                items(items = movies){
                    MovieRow(movie = it) {movie ->
                        navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movie")
                    }
                }
            }
        }
    }
}

