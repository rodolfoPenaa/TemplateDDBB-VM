package com.example.mproductv.model.Repository.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mproductv.model.SHero


@Database(entities = [SHero::class], version = 1, exportSchema = false)
abstract class Hddbb: RoomDatabase() {
    abstract fun sHdao(): SHDao
    companion object{
        @Volatile
        private var INSTANCE: Hddbb?= null
        fun iDDBB(context: Context): Hddbb {
            val tempInstance = INSTANCE
            if(tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,
                Hddbb::class.java,"DataCratch").build()
                return instance
            }
            return INSTANCE!!
        }
    }

}
