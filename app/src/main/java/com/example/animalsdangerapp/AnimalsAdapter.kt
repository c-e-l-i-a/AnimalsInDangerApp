package com.example.animalsdangerapp

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.size

class AnimalsAdapter(var items: List<Animals>) : RecyclerView.Adapter<AnimalsAdapter.AnimalsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        // xml in view object transformation
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_recycler, parent, false)
        return AnimalsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
        val animal = items[position]
        holder.bind(animal)

    }

    override fun getItemCount(): Int {
        return items.size
    }


    class AnimalsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imgItems: ImageView
        var titleItems: TextView
        var textItems: TextView

        init {
            imgItems = itemView.findViewById(R.id.imgItems)
            titleItems = itemView.findViewById(R.id.titleItems)
            textItems = itemView.findViewById(R.id.textItems)
        }

        fun bind(animal: Animals){
            titleItems.text = animal.title
            textItems.text = animal.text
            imgItems.setImageResource(animal.image)
        }
    }
}


