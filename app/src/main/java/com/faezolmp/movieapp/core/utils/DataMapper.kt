package com.faezolmp.movieapp.core.utils

import com.faezolmp.movieapp.core.data.source.remote.response.ResultsItem
import com.faezolmp.movieapp.core.domain.model.ModelExample
import com.faezolmp.movieapp.core.domain.model.ModelListMovies

object DataMapper {
    fun ExampleMapper(data: String): ModelExample {
        return ModelExample(
            dataExample = data
        )
    }

    fun mapperListMoviesDataToDomain(input: List<ResultsItem>): List<ModelListMovies> {
        val dataResult = ArrayList<ModelListMovies>()
        input.map {
            val data = ModelListMovies(
                overview = it.overview,
                originalLanguage = it.originalLanguage,
                originalTitle = it.originalTitle,
                video = it.video,
                title = it.title,
                genreIds = it.genreIds,
                posterPath = it.posterPath,
                backdropPath = it.backdropPath,
                releaseDate = it.releaseDate,
                popularity = it.popularity.toString(),
                voteAverage = it.voteAverage.toString(),
                id = it.id,
                adult = it.adult,
                voteCount = it.voteCount
            )
            dataResult.add(data)
        }
        return dataResult
    }
}