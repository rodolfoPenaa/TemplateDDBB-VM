package com.example.mproductv.viewM

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mproductv.R
import com.example.mproductv.model.SHero
import kotlinx.android.synthetic.main.item_shero_list.view.*

data class SheroesADP(var mDATAset: List<SHero>):RecyclerView.Adapter<SheroesADP.SheroesHolder>() {

 fun updateDATA(listHeroes:List<SHero>){
    mDATAset=listHeroes
    notifyDataSetChanged()
     Log.d("ADAPTER", listHeroes.toString())
}

class SheroesHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val idTextV= itemView.idN
    val nameTextV= itemView.names
    val apodoTextV= itemView.apodos
    val pngPhoto= itemView.SHimage
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SheroesHolder {
        val view: View= LayoutInflater.from(parent.context).inflate(R.layout.item_shero_list, parent,false)
        return SheroesHolder(view)
    }
    override fun onBindViewHolder(holder: SheroesHolder, position: Int) {
        var hero= mDATAset[position]
        holder.idTextV.text= hero.id.toString()
        holder.nameTextV.text= hero.name
        holder.apodoTextV.text= hero.slug
        Glide.with(holder.itemView.context).load(mDATAset[position].images.sm.toString()).into(holder.pngPhoto)

    }
    override fun getItemCount(): Int {
        return mDATAset.size
    }

}

//interface ISheroesADP{
  //  fun heroFromAdapter (id:Int)}