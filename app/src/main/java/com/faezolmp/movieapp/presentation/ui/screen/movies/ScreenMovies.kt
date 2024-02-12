package com.faezolmp.movieapp.presentation.ui.screen.movies

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.faezolmp.movieapp.core.data.Resource
import com.faezolmp.movieapp.core.domain.model.ModelListMovies
import com.faezolmp.movieapp.presentation.ui.component.MovieListItem


@Composable
fun ScreenMovies(
    modifier: Modifier = Modifier,
    viewModel: MoviesViewModel = hiltViewModel()
) {
    viewModel.uiState.collectAsState(initial = Resource.Loading()).value.let { uiState ->
        when (uiState) {
            is Resource.Loading -> {
                viewModel.getListMovies()
            }

            is Resource.Success -> {
                uiState.data?.let {
                    MoviesContent(
                        moviesList = it
                    )
                }
            }

            is Resource.Error -> {}
        }

    }
}

@Composable
fun MoviesContent(
    modifier: Modifier = Modifier,
    moviesList: List<ModelListMovies>
) {
    LazyColumn {
        items(moviesList) {
//            Text(text = it.title.toString())
            MovieListItem(
                title = it.title.toString(),
                posterPath = it.posterPath.toString(),
                modifier = modifier
            )
        }
    }
}