package com.example.mproductv.model.Repository.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mproductv.model.SHero

@Dao
interface SHDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHeroes(sHeroes: List<SHero>)

    @Query ("SELECT * FROM here_a_table ORDER BY id ASC")
       fun getDDBBsHeroes(): LiveData<List<SHero>>

    @Query ("SELECT * FROM here_a_table WHERE id")
       fun getSelected():LiveData<SHero>

    @Delete fun fullClean(){
    }
}


