package com.example.mproductv.viewM

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mproductv.model.Repository.remote.SHRepository
import com.example.mproductv.model.Repository.db.Hddbb
import com.example.mproductv.model.Repository.db.SHDao
import com.example.mproductv.model.SHero

class ViewModel(application: Application): AndroidViewModel(application) {
    /*
    lateinit var rDATA: SHRepository
    lateinit var shDAO: SHDao

    init {
        shDAO= Hddbb.getDDBBB(application).dataBase()
        rDATA= SHRepository(application)
    }*/
    private val forRepository = SHRepository(application)

    private val list1: LiveData<List<SHero>> = forRepository.passtoVM()

    lateinit var her0: LiveData<SHero>

    fun datafromServer(){
        return forRepository.fetchDATAs()
    }
    fun getDatar00m(): LiveData<List<SHero>>{
        return list1
    }
    fun getaHero(id:Int){
        her0 = forRepository.passtoFragment(id)
    }
}