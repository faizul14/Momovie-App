package com.faezolmp.movieapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.faezolmp.movieapp.presentation.ui.screen.MoviesApp
import com.faezolmp.movieapp.presentation.ui.theme.MovieAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    MoviesApp()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MovieApp(
//    modifier: Modifier = Modifier,
//    viewModel: MainViewModel = viewModel()
//) {
//    Scaffold (
//        modifier = modifier
//    ){ innerPadding ->
//        Column(
//            modifier = modifier.padding(innerPadding)
//        ) {
////            ScreenMoviesApp()
//        }
//    }
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieAppTheme {
//        Greeting("Android")
    }
}