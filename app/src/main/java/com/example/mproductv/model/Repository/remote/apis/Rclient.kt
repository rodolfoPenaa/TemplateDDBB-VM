package com.example.mproductv.model.Repository.remote.apis

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Rclient {
    companion object{
        private const val BASE_URL = "https://akabab.github.io/superhero-api/api/"
        fun retrofitInstance(): SHapi {
            val retrofit = Retrofit.Builder().
                    baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).
                    build()
        return retrofit.create(SHapi::class.java)
        }
    }
}