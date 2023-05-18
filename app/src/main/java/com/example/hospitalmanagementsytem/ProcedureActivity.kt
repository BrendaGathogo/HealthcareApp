package com.example.hospitalmanagementsytem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ProcedureActivity : AppCompatActivity() {
    lateinit var cdExitP: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procedure2)

        cdExitP=findViewById(R.id.cardExitP)

        cdExitP.setOnClickListener {
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}