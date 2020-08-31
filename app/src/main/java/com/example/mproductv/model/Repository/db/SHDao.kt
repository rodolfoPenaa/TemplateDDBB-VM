package com.example.mproductv.model.Repository.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mproductv.model.SHero

@Dao
interface SHDao {
@Insert fun insertHeroes(list: List<SHero>)    //Lv

@Query ("SELECT * FROM hereatable ORDER BY id ASC")
       fun getDDBBsHeroes(): LiveData<List<SHero>>

@Delete fun fullClean(){
    }
}


