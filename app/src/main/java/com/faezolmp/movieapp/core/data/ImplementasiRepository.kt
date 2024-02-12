package com.faezolmp.movieapp.core.data

import com.faezolmp.movieapp.core.data.source.remote.RemoteDataSource
import com.faezolmp.movieapp.core.data.source.remote.network.ApiResponse
import com.faezolmp.movieapp.core.domain.model.ModelExample
import com.faezolmp.movieapp.core.domain.model.ModelListMovies
import com.faezolmp.movieapp.core.domain.repository.Repository
import com.faezolmp.movieapp.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class ImplementasiRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
): Repository {
    override fun functionExample(): ModelExample {
        return DataMapper.ExampleMapper("retrun value")
    }

    override fun getListMovies(): Flow<Resource<List<ModelListMovies>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val dataResponse = remoteDataSource.getListMovie().first()
                when(dataResponse){
                    is ApiResponse.Success -> {
                        val data = DataMapper.mapperListMoviesDataToDomain(dataResponse.data)
                        val dataResult = flowOf(Resource.Success(data))
                        emitAll(dataResult)
                    }
                    is ApiResponse.Error -> {
                        emit(Resource.Error(dataResponse.errorMessage.toString()))
                    }
                    is ApiResponse.Empty -> {
                        emit(Resource.Loading())
                    }
                }
            }catch (e: Exception){
                emit(Resource.Error(e.message.toString()))
            }
        }
    }
}