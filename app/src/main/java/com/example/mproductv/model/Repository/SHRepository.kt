package com.example.mproductv.model.Repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.mproductv.model.Repository.db.Hddbb
import com.example.mproductv.model.Repository.db.SHDao
import com.example.mproductv.model.remote.SHero
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SHRepository (context: Context, private val shDAO: SHDao) {
            private val shDDBB: Hddbb = Hddbb.iDDBB(context)
            private val listO: LiveData<List<SHero>> = shDDBB.sHdao().getDDBBsHeroes()


    fun observedDATA(): LiveData<List<SHero>>{
        return observedDATA()
    }

    fun fetchDATAs(){
        Rclient.retrofitInstance().getAllheroes().enqueue(object : Callback<List<SHero>> {
            override fun onResponse(
                call: Call<List<SHero>>,
                response: Response<List<SHero>>
            ) {
                CoroutineScope(Dispatchers.IO).launch {             //To DDBB from call of API//
                    response.body()?.let { shDDBB.sHdao().insertHeroes(it) }
                    Log.d("apiresponse", response.body().toString())
                }
            }
            override fun onFailure(call: Call<List<SHero>>, t: Throwable) {
                //Toast.makeText(, "Network error: $t", Toast.LENGTH_LONG).show()

                Log.e("API", "ERROR $t")
            }

        })
    }

    fun insertDATA(shHeros: List<SHero>){
        shDAO.insertHeroes(shHeros)
    }
}