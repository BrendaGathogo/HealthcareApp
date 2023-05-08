package com.example.hospitalmanagementsytem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.hospitalmanagementsytem.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var login:Button
    lateinit var register:TextView
    lateinit var auth:FirebaseAuth
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        email=findViewById(R.id.editTextLoginEmail)
        password=findViewById(R.id.editTextLoginPassword)
        login=findViewById(R.id.buttonLogin)
        register=findViewById(R.id.textViewNewUser)
        auth= FirebaseAuth.getInstance()

        binding.buttonLogin.setOnClickListener {
            signin()
        }

        binding.textViewNewUser.setOnClickListener {
            val intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }



    }

    private fun signin() {
            val email = binding.editTextLoginEmail.text.toString()
            val pass = binding.editTextLoginPassword.toString()
            // calling signInWithEmailAndPassword(email, pass)
            // function using Firebase auth object
            // On successful response Display a Toast
            auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    val intent=Intent(this,HomeActivity::class.java)
                    startActivity(intent)
                } else
                    Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
            }

    }

}