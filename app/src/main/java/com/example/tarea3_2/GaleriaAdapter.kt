package com.example.tarea3_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tarea3_2.databinding.ItemImagenBinding

class GaleriaAdapter(private val imagenes: List<Imagen>, private val imagenPulsada: ImagenPulsada) : RecyclerView.Adapter<GaleriaAdapter.ViewHolder>() {
    class ViewHolder(private val binding : ItemImagenBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(imagen: Imagen) {
            Glide
                .with(binding.root.context)
                .load(imagen.imagen)
                .into(binding.imagen)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemImagenBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }
    override fun getItemCount(): Int = imagenes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(imagenes[position])
        holder.itemView.setOnClickListener{
            imagenPulsada.ImagenPulsada(imagenes[position])
        }
    }
}