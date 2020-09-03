package com.example.mproductv.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mproductv.R
import com.example.mproductv.model.SHero
import com.example.mproductv.viewM.HeroDetailsViewModel
import kotlinx.android.synthetic.main.activity_main.*

class HeroDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = HeroDetailsFragment()
    }

    private lateinit var viewModel: HeroDetailsViewModel
    private lateinit var adapterFragment: SheroesADP
    private var listFragment: List<SHero> = ArrayList<SHero>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.hero_details_fragment, container, false)


        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HeroDetailsViewModel::class.java)

        //adapterFragment = SheroesADP(listFragment,)
//        rViewSH.adapter = adapterFragment
        rViewSH.layoutManager= LinearLayoutManager(context)
       //adapterFragment.updateDATA(listFragment)
    }

}