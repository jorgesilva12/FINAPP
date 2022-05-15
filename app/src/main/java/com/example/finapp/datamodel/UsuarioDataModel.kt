package com.example.finapp.datamodel

class UsuarioDataModel {

    public val TABELA = "usuario"

    public val ID = "ID"
    public val NOME = "nome"
    public val EMAIL = "email"
    public val SENHA = "senha"
    public val ATIVO = "ativo"

    public var queryCriarTabela = ""

    public fun criarTabela() : String {
        this.queryCriarTabela += "CREATE TABLE " + TABELA + " ("
        this.queryCriarTabela += this.ID + " integer primary key autoincrement, "
        this.queryCriarTabela += this.NOME + " text, "
        this.queryCriarTabela += this.EMAIL + " text, "
        this.queryCriarTabela += this.SENHA + " text "
        this.queryCriarTabela += this.SENHA + " boolean "
        this.queryCriarTabela += ")"


        return queryCriarTabela;
    }
}