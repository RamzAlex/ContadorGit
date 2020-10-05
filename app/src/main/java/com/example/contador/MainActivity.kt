package com.example.contador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    BtnIncrementar.setOnClickListener {
        contador++
        TvContador.text="$contador"
        //hola
        //hola2
    }
    BtnDecrementar.setOnClickListener {
        contador--
        TvContador.text="$contador"
    }
        Reiniciar.setOnClickListener {
            contador=0
            TvContador.text="$contador"
        }
        button.setOnClickListener {
            val intent = Intent(this,  SegundaActivity::class.java)
            startActivity(intent)

        }
    }
}
