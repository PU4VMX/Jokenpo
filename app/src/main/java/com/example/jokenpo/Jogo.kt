package com.example.jokenpo

class Jogo {
    fun pontuar(resultado: String) {
        when(resultado) {
            "Vitória" -> pontosJogador++
            "Derrota" -> pontosComputador++
        }
    }

    var pontosJogador: Int = 0
    var pontosComputador: Int = 0
}