package com.faezolmp.movieapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.faezolmp.movieapp.core.domain.usecase.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {
    val getListMovies = useCase.getListMovies().asLiveData()
}