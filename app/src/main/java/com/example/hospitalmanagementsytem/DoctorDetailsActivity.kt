package com.example.hospitalmanagementsytem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DoctorDetailsActivity : AppCompatActivity() {
    lateinit var DDTitle:TextView
    lateinit var DDBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_details)

        DDTitle=findViewById(R.id.textViewDDTitle)
        DDBack=findViewById(R.id.buttonDDBack)

        DDBack.setOnClickListener {
            val intent=Intent(this,FindDoctorActivity::class.java)
            startActivity(intent)
        }


    }
}