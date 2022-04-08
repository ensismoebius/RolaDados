package org.andre.roladados

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtMensagem: TextView = findViewById<TextView>(R.id.txtMensagem)
        txtMensagem.text = "Valor aleatorio"

        val botaoJogar: Button = findViewById<Button>(R.id.btnJogar)

        botaoJogar.setOnClickListener {
            muda()
        }
    }

    private fun muda() {
        val bb: TextView = findViewById<TextView>(R.id.txtMensagem)
        var numeroAleatorio: Int = Random.nextInt(6) + 1
        bb.text = "Valor $numeroAleatorio"

        var imagem = when(numeroAleatorio){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        val meuDado : ImageView = findViewById(R.id.imgDado)
        meuDado.setImageResource(imagem)
    }

}






