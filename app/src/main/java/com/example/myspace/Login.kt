package com.example.myspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.system.exitProcess

class Login : AppCompatActivity() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login = findViewById(R.id.button) as Button
        val btn_exit = findViewById(R.id.btn_exit) as Button
        val btn_enreg = findViewById(R.id.btn_enreg) as Button
        val btn_mdp= findViewById(R.id.btn_mdp) as Button

        btn_enreg.setOnClickListener {
            Toast.makeText(this, "S'enregistrer", Toast.LENGTH_SHORT).show()
        }

        btn_mdp.setOnClickListener {
            Toast.makeText(this, "Mot de passe oublié?", Toast.LENGTH_SHORT).show()
        }

        btn_exit.setOnClickListener {
            moveTaskToBack(true);
            exitProcess(-1)
        }

        btn_login.setOnClickListener {
        editText = findViewById(R.id.txtEmail)
        val value: String = editText.text.toString()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("value", value)
        startActivity(intent)
        }
    }
}