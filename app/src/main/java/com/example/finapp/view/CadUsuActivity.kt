package com.example.finapp.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.finapp.R
import com.example.finapp.model.Usuario

class CadUsuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadusuario)

        var btnCadUsu : Button = findViewById(R.id.bntCadUsu)

        var etCadUNome : EditText = findViewById(R.id.etCadUNome)
        var etCadUEmail : EditText = findViewById(R.id.etCadUEmail)
        var etCadUSenha : EditText = findViewById(R.id.etCadUSenha)
        var etCadUCSenha : EditText = findViewById(R.id.etCadUCSenha)


        btnCadUsu.setOnClickListener {

            if (validCadUsu(etCadUNome, etCadUEmail, etCadUSenha, etCadUCSenha)) {

                var usuario : Usuario = Usuario(etCadUNome.text.toString(),etCadUEmail.text.toString(),etCadUSenha.text.toString())

                if (gravaUsuario(usuario)){
                    Toast.makeText(this@CadUsuActivity,"Usuario cadastrado com Sucesso",Toast.LENGTH_LONG).show()
                }
                finish()
            }
        }
    }

    private fun validCadUsu(etCadUNome: EditText, etCadUEmail: EditText, etCadUSenha: EditText, etCadUCSenha: EditText): Boolean {
        var valid: Boolean = true

        if (etCadUNome.text.isEmpty()) {
            valid = false
            Toast.makeText(this@CadUsuActivity,"Nome não pode ser vazio",Toast.LENGTH_LONG).show()
        } else if (etCadUEmail.text.isEmpty()) {
            valid = false
            Toast.makeText(this@CadUsuActivity,"Email não pode ser vazio",Toast.LENGTH_LONG).show()
        } else if (etCadUSenha.text.isEmpty()) {
            valid = false
            Toast.makeText(this@CadUsuActivity,"Senha não pode ser vazio",Toast.LENGTH_LONG).show()
        } else if (etCadUCSenha.text.isEmpty()) {
            valid = false
            Toast.makeText(this@CadUsuActivity,"Confirmação da senha não pode ser vazio",Toast.LENGTH_LONG).show()
        } else if (!etCadUSenha.text.toString().equals(etCadUCSenha.text.toString())) {
            valid = false
            Toast.makeText(this@CadUsuActivity,"As senhas são diferentes",Toast.LENGTH_LONG).show()
        }else{
            valid = true
        }

        return valid

    }

    private fun gravaUsuario(usuario: Usuario) : Boolean    {
        var valid : Boolean = true
        //valid = usuarioControl.incluir()
        return valid
    }
}