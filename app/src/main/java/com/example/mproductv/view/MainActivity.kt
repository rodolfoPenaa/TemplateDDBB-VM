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


class MainActivity : AppCompatActivity()/*, SheroesADP.ICLICKSheroesADP*/ {

    private lateinit var mViewModel: ViewModel
    private lateinit var shAdapter: SheroesADP
    private lateinit var superherosFragment: HeroDetailsFragment
    private var lisTEST: List<SHero> = ArrayList<SHero>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewModel = ViewModelProvider(this).get(ViewModel::class.java)
        mViewModel.datafromServer()

        shAdapter = SheroesADP(lisTEST/*, this*/) //PARAMETROS DEL CONSTRUCTOR DE LA CLASS ADAPTER
        rViewSH.adapter = shAdapter
        rViewSH.layoutManager = LinearLayoutManager(this)

        mViewModel.getDatar00m().observe(this, Observer {
            shAdapter.updateDATA(it)
        })
//        mViewModel.her0.observe(this, Observer {
//            Log.d("HERO FROM CLICK", it.name)
//        })
    }

//    override fun heroFromAdapter(id: Int) {
//        mViewModel.getaHero(id)
//        supportFragmentManager.beginTransaction().replace(R.id.to_fragment, HeroDetailsFragment.newInstance())
//            .commit()
//    }
}