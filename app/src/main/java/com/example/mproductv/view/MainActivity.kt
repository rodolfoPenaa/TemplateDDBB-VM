package com.example.mproductv.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mproductv.R
import com.example.mproductv.model.SHero
import com.example.mproductv.viewM.ViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_shero_list.*


class MainActivity : AppCompatActivity()/*, SheroesADP.ICLICKSheroesADP */ {

    private lateinit var heroesFragment: TestFragment

    //private lateinit var superherosFragment: HeroDetailsFragment
    //private var lisTEST: List<SHero> = ArrayList<SHero>()

    // private lateinit var fragmentHEROs: TestFragment // TO COMPANION OBJECT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //supportFragmentManager.beginTransaction().add(R.id.framelayout_fragment, TestFragment.newInstance).commit() USE TO JAVA INFLATE FRAGMENT

/*
        shAdapter = SheroesADP(lisTEST, this) //PARAMETROS DEL CONSTRUCTOR DE LA CLASS ADAPTER
        rViewSH.adapter = shAdapter
        rViewSH.layoutManager = LinearLayoutManager(this)
        mViewModel.her0.observe(this, Observer {
            Log.d("HERO FROM CLICK", it.name)
        })
*/


    }
}