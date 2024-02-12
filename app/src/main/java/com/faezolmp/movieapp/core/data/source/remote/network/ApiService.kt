package com.faezolmp.movieapp.core.data.source.remote.network

import com.faezolmp.movieapp.core.data.source.remote.response.ResponseListMovie
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    suspend fun getListMovie(
        @Query("api_key") key: String = "4f7b0119ac61dd2c22d078781a717c4d"
    ): ResponseListMovie
}