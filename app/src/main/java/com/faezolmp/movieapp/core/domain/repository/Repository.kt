package com.faezolmp.movieapp.core.domain.repository

import com.faezolmp.movieapp.core.data.Resource
import com.faezolmp.movieapp.core.domain.model.ModelExample
import com.faezolmp.movieapp.core.domain.model.ModelListMovies
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun functionExample(): ModelExample
    fun getListMovies(): Flow<Resource<List<ModelListMovies>>>
}