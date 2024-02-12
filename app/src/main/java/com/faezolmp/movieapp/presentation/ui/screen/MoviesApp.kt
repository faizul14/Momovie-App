package com.faezolmp.movieapp.presentation.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.faezolmp.movieapp.presentation.ui.component.BottomBar
import com.faezolmp.movieapp.presentation.ui.navigation.Screen
import com.faezolmp.movieapp.presentation.ui.screen.home.HomeScreen
import com.faezolmp.movieapp.presentation.ui.screen.movies.ScreenMovies
import com.faezolmp.movieapp.presentation.ui.screen.profile.ProfileScreen
import com.faezolmp.movieapp.presentation.ui.screen.tv.TvScreen
import com.faezolmp.movieapp.presentation.ui.theme.MovieAppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoviesApp(
    modifier: Modifier = Modifier,
    navcontroller: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {
            BottomBar(
                navcontroller = navcontroller
            )
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navcontroller,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(innerPadding)
        ){
            composable(Screen.Home.route){
                HomeScreen()
            }
            composable(Screen.Movie.route){
                ScreenMovies()
            }
            composable(Screen.Tv.route){
                TvScreen()
            }
            composable(Screen.Profile.route){
                ProfileScreen()
            }

        }
    }
}

@Preview
@Composable
fun MoviesAppPreview() {
    MovieAppTheme {
        MoviesApp()
    }
}

