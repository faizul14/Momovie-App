package com.faezolmp.movieapp.presentation.ui.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.faezolmp.movieapp.presentation.ui.theme.MovieAppTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ){
        Text(text = "Home")
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    MovieAppTheme {
        HomeScreen()
    }
}