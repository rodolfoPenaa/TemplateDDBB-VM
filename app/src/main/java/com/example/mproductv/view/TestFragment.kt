package com.example.mproductv.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mproductv.R
import com.example.mproductv.model.SHero
import kotlinx.android.synthetic.main.activity_main.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "id"
private const val ARG_PARAM2 = "images"
private const val ARG_PARAM3 = "name"
private const val ARG_PARAM4 = "appearance"

/**
 * A simple [Fragment] subclass.
 * Use the [TestFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TestFragment : Fragment(){

    private var idSelected: Int? = null
    private var urlSelected: String? = null
    private var nameSelected: String? = null
    private var raceSelected: String?= null
    private var listTOfragment: List<SHero> = ArrayList<SHero>()

    private lateinit var vModel: ViewModel
    private lateinit var fAdapter: SheroesADP

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            idSelected = it.getInt(ARG_PARAM1)
            urlSelected  = it.getString(ARG_PARAM2)
            nameSelected = it.getString(ARG_PARAM3)
            raceSelected = it.getString(ARG_PARAM4)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view: View= inflater.inflate(R.layout.item_shero_list,
            container, false)
        fAdapter = SheroesADP(listTOfragment)
        rViewSH.adapter = fAdapter
        rViewSH.layoutManager = LinearLayoutManager(activity)
        return view
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TestFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(idFragment: Int,
                        urlFragment: String,
                        nameFragment: String,
                        raceFragment: String?) =
            TestFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, idFragment)
                    putString(ARG_PARAM2, urlFragment)
                    putString(ARG_PARAM3,nameFragment)
                    putString(ARG_PARAM4, raceFragment)
                }
            }
    }
}