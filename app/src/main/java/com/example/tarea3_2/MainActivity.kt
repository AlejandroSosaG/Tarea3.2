package com.example.tarea3_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea3_2.databinding.GaleriaBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val galeria = GaleriaBinding.inflate(layoutInflater)
        setContentView(galeria.root)
        galeria.Imagenes.adapter = GaleriaAdapter(listOf(
            Imagen("https://loremflickr.com/320/240?random=1"),
            Imagen("https://loremflickr.com/320/240?random=2"),
            Imagen("https://loremflickr.com/320/240?random=3"),
            Imagen("https://loremflickr.com/320/240?random=4"),
            Imagen("https://loremflickr.com/320/240?random=5"),
            Imagen("https://loremflickr.com/320/240?random=6"),
            Imagen("https://loremflickr.com/320/240?random=7"),
            Imagen("https://loremflickr.com/320/240?random=8"),
            Imagen("https://loremflickr.com/320/240?random=9"),
            Imagen("https://loremflickr.com/320/240?random=10"),
            Imagen("https://loremflickr.com/320/240?random=11"),
            Imagen("https://loremflickr.com/320/240?random=12"),
            Imagen("https://loremflickr.com/320/240?random=13"),
            Imagen("https://loremflickr.com/320/240?random=14"),
            Imagen("https://loremflickr.com/320/240?random=15"),
            Imagen("https://loremflickr.com/320/240?random=16"),
            Imagen("https://loremflickr.com/320/240?random=17"),
            Imagen("https://loremflickr.com/320/240?random=18"),
            ), object : ImagenPulsada{
            override fun ImagenPulsada(imagen: Imagen) {
                val intent = Intent(this@MainActivity, ImagenCompleta::class.java)
                intent.putExtra("url", imagen.imagen)
                startActivity(intent)
            }
            })
    }
}