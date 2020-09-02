package com.example.mproductv.model.Repository.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mproductv.model.remote.SHero

@Dao
interface SHDao {

    @Insert
        fun insertHeroes(sHeroes: List<SHero>){    //Suspended

    } //Lv

    @Query ("SELECT * FROM hereatable ORDER BY id ASC")
       fun getDDBBsHeroes(): LiveData<List<SHero>>

    @Query ("SELECT * FROM hereatable WHERE id")
       fun getSelected():LiveData<SHero>

    @Delete fun fullClean(){
    }
}


