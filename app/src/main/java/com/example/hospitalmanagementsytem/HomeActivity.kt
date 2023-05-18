package com.example.hospitalmanagementsytem

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    lateinit var cdExit:CardView
    lateinit var cdFindDocor:CardView
    lateinit var cdLabtest:CardView
    lateinit var cdHealthArticles:CardView
    lateinit var cdProcedure:CardView
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        cdExit=findViewById(R.id.cardExit)
        cdFindDocor=findViewById(R.id.cardFindDoctor)
        cdLabtest=findViewById(R.id.cardLabTest)
        cdHealthArticles=findViewById(R.id.cardHealthDoctor)

        cdExit.setOnClickListener {
          val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        cdFindDocor.setOnClickListener {
            val intent = Intent(this, FindDoctorActivity::class.java)
            startActivity(intent)
        }
        cdLabtest.setOnClickListener {
            val intent = Intent(this, LabTestActivity::class.java)
            startActivity(intent)

        }
        cdHealthArticles.setOnClickListener {
            val intent = Intent(this, ArticlesActivity::class.java)
            startActivity(intent)
        }

    }
}