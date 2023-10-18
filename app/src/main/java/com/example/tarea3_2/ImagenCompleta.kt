package com.example.tarea3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.tarea3_2.databinding.ImagenBinding

class ImagenCompleta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ImagenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url = intent.getStringExtra("url")
        Glide.with(this)
            .load(url)
            .into(binding.imagen)
        binding.imagen.setOnClickListener { finish() }
    }
}