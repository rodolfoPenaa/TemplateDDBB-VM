package com.example.mproductv.viewM

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.mproductv.model.Repository.SHRepository
import com.example.mproductv.model.Repository.db.Hddbb
import com.example.mproductv.model.Repository.db.SHDao
import com.example.mproductv.model.remote.SHero

class ViewModel(application: Application): AndroidViewModel(application) {
    lateinit var rDATA: SHRepository
    lateinit var shDAO: SHDao
    init {
        shDAO= Hddbb.iDDBB(application).sHdao()
        rDATA= SHRepository(application,shDAO)
    }
    fun dDDbb (): LiveData<List<SHero>>{
        return rDATA.observedDATA()
    }

}