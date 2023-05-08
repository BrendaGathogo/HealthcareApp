package com.example.hospitalmanagementsytem

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    lateinit var cdExit:CardView
    lateinit var cdFindDocor:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        cdExit=findViewById(R.id.cardExit)
        cdFindDocor=findViewById(R.id.cardFindDoctor)

        cdExit.setOnClickListener {
          val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        cdFindDocor.setOnClickListener {
            val intent = Intent(this, FindDoctorActivity::class.java)
            startActivity(intent)
        }
    }
}