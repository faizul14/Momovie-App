package com.faezolmp.movieapp.core.domain.usecase

import com.faezolmp.movieapp.core.domain.model.ModelExample
import com.faezolmp.movieapp.core.domain.repository.Repository
import javax.inject.Inject

class ImplementationUseCase @Inject constructor(private val repository: Repository): UseCase {
    override fun functionExample(): ModelExample {
        return repository.functionExample()
    }
}