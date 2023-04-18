package com.learntodayfromai.recyclerview.adapter

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.learntodayfromai.recyclerview.R
import com.learntodayfromai.recyclerview.model.Affirmation

class itemAdapter(
    private val context:Context,
    private val dataset:List<Affirmation>):RecyclerView.Adapter<itemAdapter.itemViewHolder>() {

    class itemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textview: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return itemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size


    override fun onBindViewHolder(holder: itemAdapter.itemViewHolder, position: Int) {
        val item = dataset.get(position)
        holder.textview.setText(context.resources.getString(item.StringResourceId))
        holder.imageView.setImageDrawable(context.resources.getDrawable(item.ImageResourceId))
    }
}