package com.faezolmp.movieapp.core.domain.usecase

import com.faezolmp.movieapp.core.data.Resource
import com.faezolmp.movieapp.core.domain.model.ModelExample
import com.faezolmp.movieapp.core.domain.model.ModelListMovies
import com.faezolmp.movieapp.core.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ImplementationUseCase @Inject constructor(private val repository: Repository): UseCase {
    override fun functionExample(): ModelExample {
        return repository.functionExample()
    }

    override fun getListMovies(): Flow<Resource<List<ModelListMovies>>> {
        return repository.getListMovies()
    }
}