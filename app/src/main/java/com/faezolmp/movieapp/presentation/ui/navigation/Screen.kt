package com.faezolmp.movieapp.presentation.ui.navigation

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Movie: Screen("movie")
    object Tv: Screen("tv")
    object Profile: Screen("profile")
}