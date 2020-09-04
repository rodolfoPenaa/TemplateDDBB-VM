package com.example.mproductv.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mproductv.R
import com.example.mproductv.model.SHero
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_test.*
import kotlinx.android.synthetic.main.fragment_test.view.*


private const val ARG_PARAM1 = "id"
/*private const val ARG_PARAM2 = "images"
private const val ARG_PARAM3 = "name"
private const val ARG_PARAM4 = "appearance"*/

class TestFragment : Fragment()/*, SheroesADP.ICLICKSheroesADP */{

    private var listfragment: List<SHero> = ArrayList<SHero>()

    private lateinit var mViewModel: com.example.mproductv.viewM.ViewModel
    private lateinit var fAdapter: SheroesADP

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewModel = ViewModelProvider(this).get(com.example.mproductv.viewM.ViewModel::class.java)
        mViewModel.datafromServer()
        fAdapter= SheroesADP(listfragment)
    }
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
        ): View? {
            val view: View = inflater.inflate(R.layout.fragment_test, container, false)
            view.rViewSH.adapter = fAdapter
            view.rViewSH.layoutManager= LinearLayoutManager(activity)



            mViewModel.getDatar00m().observe(viewLifecycleOwner, Observer {
                fAdapter.updateDATA(it)
                Log.d("INFLATE", it.toString())

            })
            return view
        }

    /*override fun heroFromAdapter(id: Int) {

    }*/
}
