package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.view_raw.view.*

class RecyclerViewAdapter (val context: Context, val texts:ArrayList<String>): RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>(){
    class ItemViewHolder (ItemView: View): RecyclerView.ViewHolder(ItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
            R.layout.view_raw, parent,false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val singltext=texts[position]
        holder.itemView.apply {
            showz.text=singltext
        }
    }

    override fun getItemCount()= texts.size


}