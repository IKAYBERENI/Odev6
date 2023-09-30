package com.example.odev6etsyproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecylerViewUrunAdapter constructor(
    private val getActivity: MainActivity,
    private val urunList : List<Urun>) :
    RecyclerView.Adapter<RecylerViewUrunAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_urun_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvUrunTitle.text = urunList[position].title
        holder.ivUrunImg.setImageResource(urunList[position].image)
        holder.cardView.setOnClickListener {
            Toast.makeText(getActivity, urunList[position].title, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return urunList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvUrunTitle : TextView = itemView.findViewById(R.id.tvUrunTitle)
        val ivUrunImg : ImageView = itemView.findViewById(R.id.ivUrunImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)

    }

}