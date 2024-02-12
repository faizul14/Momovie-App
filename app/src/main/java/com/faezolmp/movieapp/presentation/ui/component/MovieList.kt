package com.faezolmp.movieapp.presentation.ui.component

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.faezolmp.movieapp.presentation.ui.theme.MovieAppTheme

@Composable
fun MovieListItem(
    title: String, posterPath: String, modifier: Modifier
) {
    Box(
        modifier = modifier
            .width(250.dp)
            .height(300.dp)

    ) {
        AsyncImage(
            model = "http://image.tmdb.org/t/p/w500/qhb1qOilapbapxWQn9jtRCMwXJF.jpg",
            contentDescription = "photoMovie",
            contentScale = ContentScale.Crop,
//            modifier = modifier.fillMaxSize()
        )
        Log.d("TRACKER", "http://image.tmdb.org/t/p/w500${posterPath}")
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxSize()
        ) {
            Text(
                text = title, modifier = modifier
            )
        }
    }
}

@Preview
@Composable
fun MovieListItemPreview() {
    MovieAppTheme {
        MovieListItem(
            title = "Lipsum", posterPath = "http://imageExample.com", modifier = Modifier
        )
    }
}