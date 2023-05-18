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
    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()
        binding.textView.setOnClickListener {
            val intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            val email=binding.emailEt.text.toString()
            val pass=binding.passET.text.toString()


            if(email.isNotEmpty() && pass.isNotEmpty() ){

                    firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, HomeActivity::class.java)
                            startActivity(intent)

                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }


            }else{
                Toast.makeText(this,"Empty fields not allowed",Toast.LENGTH_SHORT).show()

            }
        }







    }

    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser!=null){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }
    }




}