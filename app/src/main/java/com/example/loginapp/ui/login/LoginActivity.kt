package com.example.loginapp.ui.login

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.MainActivity
import com.example.loginapp.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)



    login.setOnClickListener{
        username.text
        password.text

        if(username.text.toString() == "freeman@gmail.com" && password.text.toString() == "freeman123"){
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }else{
            val dlgAlert: AlertDialog.Builder = AlertDialog.Builder(this)

            dlgAlert.setMessage("wrong password or username")
            dlgAlert.create().show()
        }
             }
    }


}


