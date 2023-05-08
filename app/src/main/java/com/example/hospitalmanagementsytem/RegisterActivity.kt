package com.example.hospitalmanagementsytem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.hospitalmanagementsytem.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {
    lateinit var binding:ActivityRegisterBinding
    lateinit var edtemail:EditText
    lateinit var edtpassword:EditText
    lateinit var edtconfirmpassword:EditText
    lateinit var btnregister:Button
    lateinit var loginredirect:TextView
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        edtemail=findViewById(R.id.editTextRegEmail)
        edtpassword=findViewById(R.id.editTextRegPassword)
        edtconfirmpassword=findViewById(R.id.editTextRegConfirmPassword)
        btnregister=findViewById(R.id.buttonRegister)
        loginredirect=findViewById(R.id.textViewExistingUser)
        auth=Firebase.auth

        binding.buttonRegister.setOnClickListener {
            SignUp()
        }
        binding.textViewExistingUser.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }


    }

    private fun SignUp() {

            val regemail=binding.editTextRegEmail.text.toString()
            val regpassword=binding.editTextRegPassword.text.toString()
            val regconfirmpassword=binding.editTextRegConfirmPassword.text.toString()
            if (regemail.isBlank() || regpassword.isBlank() ||regconfirmpassword.isBlank() ){
                Toast.makeText(this,"Email and password can not be blank", Toast.LENGTH_LONG).show()
                return
            }  else if (regpassword != regconfirmpassword){
                Toast.makeText(this,"Password do not match", Toast.LENGTH_LONG).show()
                return

            }
            auth.createUserWithEmailAndPassword(regemail,regpassword).addOnCompleteListener(this) {
                if (it.isSuccessful){
                    Toast.makeText(this,"Signed successfully", Toast.LENGTH_LONG).show()
                    val intent=Intent(this,LoginActivity::class.java)
                    startActivity(intent)

                    finish()
                }else{
                    Toast.makeText(this,"Failed to create", Toast.LENGTH_LONG).show()
                }

            }


    }
}