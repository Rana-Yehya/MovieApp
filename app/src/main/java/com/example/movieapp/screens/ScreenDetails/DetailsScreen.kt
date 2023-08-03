package com.example.movieapp.screens.ScreenDetails

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.movieapp.data.GetMovies
import com.example.movieapp.data.*
import com.example.movieapp.widgets.MovieRow


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailsScreen(navController: NavController, movieid: String?){
    var movieslist = GetMovies().filter {movie->
                movie.id == movieid
    }
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Blue.copy(alpha = 0.5f),
                elevation = 4.dp
            ) {
                Row(horizontalArrangement = Arrangement.Center) {
                    Icon(imageVector = Icons.Default.ArrowBack, 
                        contentDescription = "Go Back",
                        modifier = Modifier.clickable {  navController.popBackStack() })
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "Movies")
                }
            }
        },
    ) {
        Surface(modifier = Modifier.fillMaxSize()) {
            //Text(text = movieslist[0].Title)
            MovieRow(movieslist[0])
            Divider(modifier = Modifier.padding(5.dp))
            LazyRow(){
                items(movieslist[0].images){ image ->
                    Card(modifier = Modifier
                        .padding(5.dp)
                        .size(250.dp),
                        elevation = 5.dp) {
                        Image(painter = rememberImagePainter(data = image),
                                    contentDescription = "Images")
                    }

                }
            }
        }


    }


}