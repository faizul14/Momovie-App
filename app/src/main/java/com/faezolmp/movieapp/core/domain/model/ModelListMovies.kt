package com.faezolmp.movieapp.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelListMovies(
    val overview: String? = null,

    val originalLanguage: String? = null,

    val originalTitle: String? = null,

    val video: Boolean? = null,

    val title: String? = null,

    val genreIds: List<Int?>? = null,

    val posterPath: String? = null,

    val backdropPath: String? = null,

    val releaseDate: String? = null,

    val popularity: String? = null,

    val voteAverage: String? = null,

    val id: Int? = null,

    val adult: Boolean? = null,

    val voteCount: Int? = null
) : Parcelable
