package com.example.mproductv.model.Repository.remote

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.mproductv.model.Repository.db.Hddbb
import com.example.mproductv.model.Repository.remote.apis.Rclient
import com.example.mproductv.model.SHero
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

data class SHRepository (val context: Context) {

    private val instanceDDBB: Hddbb = Hddbb.getDDBBB(context)
    private val list0: LiveData<List<SHero>> = instanceDDBB.dataBase().getDDBBsHeroes()

    fun fetchDATAs(){
        Rclient.retrofitInstance().getAllheroes().enqueue(object : Callback<List<SHero>> {
            override fun onResponse(
                call: Call<List<SHero>>,
                response: Response<List<SHero>>
            ) {
                //Log.d("RESTponse", response.body().toString())
                CoroutineScope(Dispatchers.IO).launch {          // To DDBB from call of API//
                    response.body()?.let { instanceDDBB.dataBase().insertHeroes(it) }
                 //   Log.d("apiresponse", response.body().toString())
                }
            }
            override fun onFailure(call: Call<List<SHero>>, t: Throwable) {
                //Toast.makeText(, "Network error: $t", Toast.LENGTH_LONG).show()

                Log.e("API", "ERROR $t")
            }

        })
    }

    fun passtoVM(): LiveData<List<SHero>>{
        return list0
    }

}