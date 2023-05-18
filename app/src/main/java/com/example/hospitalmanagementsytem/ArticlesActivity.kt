package com.example.hospitalmanagementsytem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ArticlesActivity : AppCompatActivity() {
    lateinit var cdExitA:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_articles)

        cdExitA=findViewById(R.id.cardExitA)

        cdExitA.setOnClickListener {
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}