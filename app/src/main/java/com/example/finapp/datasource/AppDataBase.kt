package com.example.finapp.datasource

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.example.finapp.datamodel.UsuarioDataModel


class AppDataBase(context : Context) : SQLiteOpenHelper(context,DB_NAME,null,DB_VERSION) {
    companion object {
        private val DB_NAME = "FINAPP.sqlite"
        private val DB_VERSION = 1
    }


    override fun onCreate(db: SQLiteDatabase) {
        var usariodatamodel : UsuarioDataModel = UsuarioDataModel()

        db.execSQL(usariodatamodel.criarTabela())
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

//    fun insert(tabela : String, dadosObj : ContentValues) : Boolean {
//        var valid = true
//        try {
//
//        }catch ( Exeception){
//            Log.d("FINAPPBANCO","INSERT",e.get)
//        }
//    }
}