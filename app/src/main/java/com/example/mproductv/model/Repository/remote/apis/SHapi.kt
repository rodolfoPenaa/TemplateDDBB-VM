package com.example.mproductv.model.Repository.remote.apis

import com.example.mproductv.model.SHero
import retrofit2.Call
import retrofit2.http.GET

interface SHapi {
    @GET("all.json")
    fun getAllheroes(): Call<List<SHero>>
}