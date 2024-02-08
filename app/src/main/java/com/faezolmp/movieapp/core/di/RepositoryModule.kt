package com.faezolmp.movieapp.core.di

import com.faezolmp.movieapp.core.data.ImplementasiRepository
import com.faezolmp.movieapp.core.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(repository: ImplementasiRepository): Repository
}