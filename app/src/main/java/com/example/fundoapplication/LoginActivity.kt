package com.example.fundoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var loginButton: Button
    lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton = findViewById(R.id.login_buttonLogin)
        signUpButton = findViewById(R.id.login_buttonSignUp)

        loginButton.setOnClickListener {
            userLogin()
        }

        signUpButton.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Button Click", Toast.LENGTH_LONG).show()
            supportFragmentManager.beginTransaction().add(R.id.login_container, RegistrationFragment()).commit()
        }

    }

    private fun userLogin() {
        TODO("Not yet implemented")
    }

//    override fun onClick(view: View?) {
//        when(view?.id) {
//            R.id.login_buttonSignUp -> {
//                Toast.makeText(this, "Button Click", Toast.LENGTH_LONG).show()
//                supportFragmentManager.beginTransaction().replace(R.id.login_container, RegistrationFragment()).addToBackStack(null).commit()
//            }
//
//            R.id.login_buttonLogin -> userLogin()
//
//            else -> null
//        }
//    }


}