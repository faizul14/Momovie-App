package com.faezolmp.movieapp.core.domain.usecase

import com.faezolmp.movieapp.core.data.Resource
import com.faezolmp.movieapp.core.domain.model.ModelExample
import com.faezolmp.movieapp.core.domain.model.ModelListMovies
import kotlinx.coroutines.flow.Flow

interface UseCase {
    fun functionExample(): ModelExample
    fun getListMovies(): Flow<Resource<List<ModelListMovies>>>

}