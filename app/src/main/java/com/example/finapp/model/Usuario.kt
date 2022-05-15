package com.example.finapp.model

class Usuario {

    private var nome: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
    private var email: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
    private var senha: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(nome : String,email : String, senha : String){
        this.nome = nome
        this.email = email
        this.senha = senha
    }


}