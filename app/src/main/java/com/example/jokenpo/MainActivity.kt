package com.example.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var jogo = Jogo()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun novoJogo(view: View) {
        jogo = Jogo()
        val resultTextView4 = findViewById<TextView>(R.id.textView4)
        resultTextView4.text = "${jogo.pontosJogador} : ${jogo.pontosComputador}"
    }


    fun jogar(view: View) {
        println(view.tag)
        var escolhaUsuario = view.tag.toString()
        var escolhaComputador = arrayOf("pedra", "papel", "tesoura").random()

        val resultTextView = findViewById<TextView>(R.id.textView2)
        resultTextView.text = "Sua escolha: $escolhaUsuario"

        val resultTextView2 = findViewById<TextView>(R.id.textView3)
        resultTextView2.text = "Escolha CPU: $escolhaComputador"

        var resultado = when(escolhaUsuario) {
            "pedra" -> when(escolhaComputador) {
                "pedra" -> "Empate"
                "papel" -> "Derrota"
                "tesoura" -> "Vitória"
                else -> "Erro"
            }
            "papel" -> when(escolhaComputador) {
                "pedra" -> "Vitória"
                "papel" -> "Empate"
                "tesoura" -> "Derrota"
                else -> "Erro"
            }
            "tesoura" -> when(escolhaComputador) {
                "pedra" -> "Derrota"
                "papel" -> "Vitória"
                "tesoura" -> "Empate"
                else -> "Erro"
            }
            else -> "Erro"
        }

        jogo.pontuar(resultado)

        val resultTextView4 = findViewById<TextView>(R.id.textView4)
        resultTextView4.text = "${jogo.pontosJogador} : ${jogo.pontosComputador}"

    }


}