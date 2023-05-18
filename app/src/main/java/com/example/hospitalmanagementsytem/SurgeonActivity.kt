package com.example.hospitalmanagementsytem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SurgeonActivity : AppCompatActivity() {
    lateinit var SUBack:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surgeon)
        SUBack=findViewById(R.id.ButtonSUBack)

        SUBack.setOnClickListener {
            val intent=Intent(this,FindDoctorActivity::class.java)
            startActivity(intent)
        }
    }
}