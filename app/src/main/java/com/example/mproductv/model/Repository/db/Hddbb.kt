package com.example.mproductv.model.Repository.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mproductv.model.SHero


@Database(entities = [SHero::class], version = 60212, exportSchema = false)
abstract class Hddbb: RoomDatabase() {

    abstract fun dataBase(): SHDao

    companion object {
        @Volatile
        // private var INSTANCE: Hddbb? = null

        private var basedato: Hddbb?= null

        fun getDDBBB(context: Context): Hddbb {
            if (basedato == null) synchronized(this) {
                basedato = Room.databaseBuilder(context.applicationContext,
                    Hddbb::class.java,"here_a_table").build()
            }
        return basedato!!
        }
    }
}
        /*fun instanceDDBB(context: Context): Hddbb {
            val tempInstance = INSTANCE
            if(tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,
                Hddbb::class.java,"DataCratch").build()
                INSTANCE=instance
                return instance
            }
        }*/

