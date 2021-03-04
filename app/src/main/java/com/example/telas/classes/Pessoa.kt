package com.example.telas.classes

import java.io.Serializable

class Pessoa : Serializable {
    var nome: String
    var ano: Int
    constructor(nome: String = "", ano: Int = 0){
        this.nome = nome
        this.ano = ano
    }
    fun idade(): Int{
        return 2021 - this.ano
    }
}