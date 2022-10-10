package com.example.basicrecycleview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonRecycleAdapter (val context: Context, val persons: List<Person>):
RecyclerView.Adapter<PersonRecycleAdapter.Viewholder>() {

    val layoutInflater = LayoutInflater.from(context )



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)
        Log.d("!!!", "onCreateViewHolder")

        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        Log.d("!!!", "onBindViewHolder $position")

        val person = persons[position]
        holder.nameTextView.text = person.name
        holder.ageTextView.text = person.age.toString()

    }

    override fun getItemCount(): Int = persons.size

    inner class Viewholder (itemView: View): RecyclerView.ViewHolder(itemView) {


        var nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        var ageTextView = itemView.findViewById<TextView>(R.id.ageTextView)

    }

}