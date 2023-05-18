package com.example.hospitalmanagementsytem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DieticianActivity : AppCompatActivity() {
    lateinit var DEBack:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dietician)
        DEBack=findViewById(R.id.buttonDEBack)

        DEBack.setOnClickListener {
            val intent=Intent(this,FindDoctorActivity::class.java)
            startActivity(intent)
        }
    }
}