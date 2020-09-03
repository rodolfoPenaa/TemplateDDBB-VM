package com.example.mproductv.viewM

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.mproductv.R
import com.example.mproductv.model.SHero
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    private lateinit var mViewModel: ViewModel
    private lateinit var shAdapter: SheroesADP

    private var lisTEST: List<SHero> = ArrayList<SHero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewModel=ViewModelProvider(this).get(ViewModel::class.java)
        mViewModel.datafromServer()
        shAdapter= SheroesADP(lisTEST)
        mViewModel.getDatar00m().observe(this, Observer {
            Log.d("FROM DDBB main", it.toString())

            shAdapter.updateDATA(lisTEST)

        })
        rViewSH.adapter = shAdapter





    }
}


        //shAdapter.let {
//               var SHimage = lisTEST[1].images.sm}
