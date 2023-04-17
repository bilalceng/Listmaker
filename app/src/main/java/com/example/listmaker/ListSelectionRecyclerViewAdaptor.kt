package com.example.listmaker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listmaker.databinding.ListSelectionViewHolderBinding

val listTitles = arrayOf("bilal", "bedia", "rabia","bilal", "bedia", "rabia","bilal", "bedia", "rabia","bilal", "bedia", "rabia", "bilal", "bedia", "rabia","bilal", "bedia", "rabia","bilal", "bedia", "rabia","bilal", "bedia", "rabia" )

class ListSelectionRecyclerViewAdaptor: RecyclerView.Adapter<ListSelectionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val binding = ListSelectionViewHolderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListSelectionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.binding.itenNumber.text = (position + 1).toString()
        holder.binding.itemString.text = listTitles[position]
    }

    override fun getItemCount(): Int {
        return listTitles.size
    }
}
