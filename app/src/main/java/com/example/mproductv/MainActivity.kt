package com.example.mproductv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mproductv.viewM.ViewModel


class MainActivity : AppCompatActivity() {

    lateinit var mViewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    mViewModel=ViewModelProvider(this).get(ViewModel::class.java)
    mViewModel.dDDbb().observe(this, Observer {
        Log.d("vwmodel",it.toString())
    })

    }
}

