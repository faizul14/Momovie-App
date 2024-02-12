package com.faezolmp.movieapp.presentation.ui.screen.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.faezolmp.movieapp.core.data.Resource
import com.faezolmp.movieapp.core.domain.model.ModelListMovies
import com.faezolmp.movieapp.core.domain.usecase.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(private val useCase: UseCase) : ViewModel() {
    private val _uiState: MutableStateFlow<Resource<List<ModelListMovies>>> =
        MutableStateFlow(Resource.Loading())
    val uiState: StateFlow<Resource<List<ModelListMovies>>>
        get() = _uiState

    fun getListMovies() {
        viewModelScope.launch {
            useCase.getListMovies()
                .catch {
                    _uiState.value = Resource.Error(it.message.toString())
                }
                .collect {
                    _uiState.value = it
                }
        }
    }
}