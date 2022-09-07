package com.rich.recyclerview.tugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rich.recyclerview.R

class ProvinsiAdapter(private val listProvinsi : ArrayList<Provinsi>) : RecyclerView.Adapter<ProvinsiAdapter.viewHolder>() {
    class viewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imgProvinsi = itemView.findViewById<ImageView>(R.id.ivProvinsi)
        val tvProvinsi = itemView.findViewById<TextView>(R.id.tvProvinsi)
        val tvIbuKota = itemView.findViewById<TextView>(R.id.tvIbuKota)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.provinsi_item, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val provinsi = listProvinsi[position]
        holder.imgProvinsi.setImageResource(provinsi.gambarRumah)
        holder.tvProvinsi.text = provinsi.namaProvinsi
        holder.tvIbuKota.text = provinsi.ibukota
    }

    override fun getItemCount(): Int = listProvinsi.size


}