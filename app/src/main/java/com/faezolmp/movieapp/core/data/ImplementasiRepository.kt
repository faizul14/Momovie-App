package com.faezolmp.movieapp.core.data

import com.faezolmp.movieapp.core.domain.model.ModelExample
import com.faezolmp.movieapp.core.domain.repository.Repository
import com.faezolmp.movieapp.core.utils.DataMapper

class ImplementasiRepository(): Repository {
    override fun functionExample(): ModelExample {
        return DataMapper.ExampleMapper("retrun value")
    }
}