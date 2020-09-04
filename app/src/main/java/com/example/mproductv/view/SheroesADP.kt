package com.example.mproductv.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mproductv.R
import com.example.mproductv.model.SHero
import kotlinx.android.synthetic.main.item_shero_list.view.*

data class SheroesADP(var mDATAset: List<SHero> /*var clickListener: ICLICKSheroesADP)*/)
    :RecyclerView.Adapter<SheroesADP.SheroesHolder>() {

 fun updateDATA(listHeroes:List<SHero>){
    mDATAset=listHeroes
    notifyDataSetChanged()
}

inner class SheroesHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    // val idTextV= itemView.findViewById<TextView>(R.id.idN) {OLD}
    val idTextV= itemView.idN
    val nameTextV= itemView.names
    val appearencia= itemView.apodos
    val pngPhoto= itemView.SHimage

    /*init {
        itemView.setOnClickListener {
            clickListener.heroFromAdapter(mDATAset.get(adapterPosition).id)
        }
    }*/
}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SheroesHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_shero_list, parent,false)
        return SheroesHolder(view)
    }

    override fun onBindViewHolder(holder: SheroesHolder, position: Int) {
        var hero= mDATAset[position]
        holder.idTextV.text= hero.id.toString()
        holder.nameTextV.text= hero.name
        holder.appearencia.text= hero.appearance?.race
        Glide.with(holder.itemView.context).load(mDATAset[position].images.sm).circleCrop().into(holder.pngPhoto)
        //Picasso.get().load(mDATAset[position].images.sm).resize(100,100).into(holder.pngPhoto)
        //clickListener.heroFromAdapter(mDATAset.get(position).id)

    }
    override fun getItemCount(): Int {
        return mDATAset.size
    }
    interface ICLICKSheroesADP{
        fun heroFromAdapter (id:Int)
    }
}

