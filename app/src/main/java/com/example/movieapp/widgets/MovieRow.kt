package com.example.movieapp.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.movieapp.data.*
import com.example.movieapp.data.*


@Preview
@Composable
fun MovieRow(movie: Movie = GetMovies()[0], onItemClick: (String) ->Unit = {}){
    val expand = remember{
        mutableStateOf(false)
    }
    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
        //.height(150.dp)
        .clickable { onItemClick(movie.id) },
        elevation = 4.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {
            Surface(modifier = Modifier
                .padding(8.dp)
                .size(100.dp),
                elevation = 4.dp,
                shape = RectangleShape
            ) {
                Image(painter = rememberAsyncImagePainter(
                    ImageRequest.Builder(LocalContext.current).data(data = movie.images[0])
                        .apply(block = fun ImageRequest.Builder.() {
                            crossfade(true)
                            transformations(CircleCropTransformation())
                        }).build()
                ),
                    contentDescription = "Poster"
                )

            }

            
            Column(verticalArrangement = Arrangement.Top,
                        //horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(5.dp)) {
                Text(text = movie.title ,  style = MaterialTheme.typography.h5)
                Text(text = movie.actors , style = MaterialTheme.typography.caption)
                Text(text = "Released: ${movie.year}", style = MaterialTheme.typography.caption)

                AnimatedVisibility(visible = expand.value) {
                    Column {
                        Text( buildAnnotatedString {
                            withStyle( style = SpanStyle(fontSize = 13.sp,
                                fontWeight = FontWeight.Bold)){
                                append("Plot: " )
                            }
                            withStyle( style = SpanStyle( color = Color.DarkGray, fontSize = 13.sp)
                            ){
                                append(movie.plot)
                            }
                        }, modifier = Modifier.padding(5.dp))
                        Divider(modifier = Modifier.padding(3.dp))
                        Text(text = "Actors: ${movie.actors}", style = MaterialTheme.typography.caption)
                        Text(text = "Country: ${movie.country}", style = MaterialTheme.typography.caption)
                        Text(text = "Rated: ${movie.rated}", style = MaterialTheme.typography.caption)
                    }
                }

                Icon(imageVector = if(expand.value) Icons.Filled.KeyboardArrowUp
                                                else Icons.Filled.KeyboardArrowDown,
                        contentDescription = "Arrow",
                        modifier = Modifier
                            .size(25.dp)
                            .clickable { expand.value = !expand.value },
                        tint = Color.DarkGray)
            }
        }
    }

}