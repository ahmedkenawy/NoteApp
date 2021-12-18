package com.a7medkenawy.noteapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.a7medkenawy.noteapp.R
import com.a7medkenawy.noteapp.model.Data
import kotlinx.android.synthetic.main.fragment_add.view.*

class DataAdapter : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    var list = emptyList<Data>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.custom_view, parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        var data=list[position]

        holder.itemView.ed_date_add.setText(data.date)
        holder.itemView.ed_title_add.setText(data.title)
        holder.itemView.ed_description_add.setText(data.description)

    }

    override fun getItemCount(): Int {
        return list.size
    }


    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

}