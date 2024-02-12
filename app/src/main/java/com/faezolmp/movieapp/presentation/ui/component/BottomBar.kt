package com.faezolmp.movieapp.presentation.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.faezolmp.movieapp.R
import com.faezolmp.movieapp.presentation.ui.navigation.NavigationItem
import com.faezolmp.movieapp.presentation.ui.navigation.Screen
import com.faezolmp.movieapp.presentation.ui.theme.MovieAppTheme

@Composable
fun BottomBar(
    modifier: Modifier = Modifier, navcontroller: NavHostController
) {
    val navBackStackEntry by navcontroller.currentBackStackEntryAsState()
    val currentRout = navBackStackEntry?.destination?.route

    NavigationBar(
        modifier = modifier
    ) {
        val navigationItems = listOf(
            NavigationItem(
                tittle = stringResource(R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                tittle = stringResource(R.string.menu_movie),
                icon = Icons.Default.PlayArrow,
                screen = Screen.Movie
            ),
            NavigationItem(
                tittle = stringResource(R.string.menu_tv),
                icon = Icons.Default.ThumbUp,
                screen = Screen.Tv
            ),
            NavigationItem(
                tittle = stringResource(R.string.menu_profile),
                icon = Icons.Default.AccountCircle,
                screen = Screen.Profile
            ),
        )

        navigationItems.map {
            NavigationBarItem(onClick = {
                navcontroller.navigate(it.screen.route) {
                    popUpTo(navcontroller.graph.findStartDestination().id) {
                        saveState = true
                    }
                    restoreState = true
                    launchSingleTop = true
                }
            }, selected = currentRout == it.screen.route, icon = {
                Icon(
                    imageVector = it.icon, contentDescription = it.tittle
                )
            }, label = {
                Text(
                    text = it.tittle
                )
            })
        }
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    MovieAppTheme {
//        BottomBar()
    }
}