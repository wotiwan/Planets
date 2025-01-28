package com.example.planets

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tv = itemView.findViewById<TextView>(R.id.color)

    init {
        itemView.setOnClickListener {
            val color = tv.tag as Int
            Toast.makeText(itemView.context, "Color code: ${tv.text}", Toast.LENGTH_SHORT).show()
        }
    }

    fun bindTo(color: Int) {
        tv.setBackgroundColor(color)
        tv.text = itemView.context.getString(R.string.template, color)
        tv.tag = color
    }
}