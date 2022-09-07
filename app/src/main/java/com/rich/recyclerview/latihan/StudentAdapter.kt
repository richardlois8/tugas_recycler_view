package com.rich.recyclerview.latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rich.recyclerview.R
import de.hdodenhof.circleimageview.CircleImageView

class StudentAdapter(private val listStudent : ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.viewHolder>() {
    class viewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val tvNama = itemView.findViewById<TextView>(R.id.tvNama)
        val tvNim = itemView.findViewById<TextView>(R.id.tvNim)
        val imgStud = itemView.findViewById<CircleImageView>(R.id.imgStudent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_item,parent,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.tvNama.text = listStudent[position].nama
        holder.tvNim.text = listStudent[position].nim
        holder.imgStud.setImageResource(listStudent[position].imgStudent)
    }

    override fun getItemCount(): Int = listStudent.size


}