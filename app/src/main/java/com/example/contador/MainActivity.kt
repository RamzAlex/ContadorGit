package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    BtnIncrementar.setOnClickListener {
        contador++
        TvContador.text="$contador"
    }
    BtnDecrementar.setOnClickListener {
        contador--
        TvContador.text="$contador"
    }
        Reiniciar.setOnClickListener {
            contador=0
            TvContador.text="$contador"
        }
    }
}