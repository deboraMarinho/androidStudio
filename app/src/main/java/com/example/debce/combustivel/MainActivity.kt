package com.example.debce.combustivel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   fun calcular (v: View){
       val valorMaximo = txtGasolina.text.toString().toDouble() * 0.7

       if(txtAlcool.text.toString().toDouble() <= valorMaximo)

           txtResposta.text = ("Abasteça Alcool.\nValor maximo Alcool R$ " +
                   String.format(Locale.US, "%.2f", valorMaximo))
       else
           txtResposta.text = ("Abasteça Gasolina.\nValor maximo Alcool R$ " +
                   String.format(Locale.US, "%.2f", valorMaximo))

   }
}
