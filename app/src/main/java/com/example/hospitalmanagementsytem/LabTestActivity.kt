package com.example.hospitalmanagementsytem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class LabTestActivity : AppCompatActivity() {
    lateinit var cdExitM:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab_test)

        cdExitM=findViewById(R.id.cardExitM)

        cdExitM.setOnClickListener {
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}