package com.faezolmp.movieapp.core.utils

import com.faezolmp.movieapp.core.domain.model.ModelExample

object DataMapper {
    fun ExampleMapper(data: String): ModelExample{
        return ModelExample(
            dataExample = data
        )
    }
}