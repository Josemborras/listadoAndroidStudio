package com.example.listado

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.listado.databinding.HolderBinding

class Adaptador(val listado: ArrayList<String>): Adapter<Adaptador.HolderView>() {

    inner class HolderView(val binding: HolderBinding) : ViewHolder(binding.root)

    // Esta funcion dibuja cada celda
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderView {
        val contexto = parent.context
        // se puede usar directamente parent.context
        val inflater = LayoutInflater.from(contexto)
        val binding = HolderBinding.inflate(inflater,parent,false)
        val objectHolderView = HolderView(binding)
        return objectHolderView
    }

    // Esta funcion devuelve el tamaño del listado
    override fun getItemCount(): Int {
        return listado.size
    }

    // Esta funcion pone los datos en cada celda
    override fun onBindViewHolder(holder: HolderView, position: Int) {
        val nombre = listado[position]
        holder.binding.textView.text = nombre
    }

}