package com.faezolmp.movieapp.core.data.source.remote

import com.faezolmp.movieapp.core.data.source.remote.network.ApiResponse
import com.faezolmp.movieapp.core.data.source.remote.network.ApiService
import com.faezolmp.movieapp.core.data.source.remote.response.ResultsItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSource @Inject constructor(private val apiService: ApiService) {
    fun getListMovie(): Flow<ApiResponse<List<ResultsItem>>> {
        return flow {
            try {
                val response = apiService.getListMovie()
                val item = response.results
                if (item !== null && item.isNotEmpty()) {
                    emit(ApiResponse.Success(item))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.message.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }
}