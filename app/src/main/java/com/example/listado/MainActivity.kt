package com.example.listado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listado.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val array = ArrayList<String>()

        array.add("Sandra")
        array.add("Marcos")
        array.add("Julian")
        array.add("Maria")
        array.add("Sandra")
        array.add("Marcos")
        array.add("Julian")
        array.add("Maria")
        array.add("Sandra")
        array.add("Marcos")
        array.add("Julian")
        array.add("Maria")
        array.add("Sandra")
        array.add("Marcos")
        array.add("Julian")
        array.add("Maria")

        val layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, true)
        val adaptador = Adaptador(array)

        binding.reciclerView.layoutManager = layoutManager
        binding.reciclerView.adapter = adaptador


    }
}