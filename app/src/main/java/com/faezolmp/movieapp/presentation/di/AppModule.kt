package com.faezolmp.movieapp.presentation.di

import com.faezolmp.movieapp.core.domain.usecase.ImplementationUseCase
import com.faezolmp.movieapp.core.domain.usecase.UseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class AppModule {
    @Binds
    @ViewModelScoped
    abstract fun provideUseCase(useCase: ImplementationUseCase): UseCase
}