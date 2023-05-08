package com.example.hospitalmanagementsytem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class FindDoctorActivity : AppCompatActivity() {
    lateinit var cdBack:CardView
    lateinit var cdFamilyPhysician:CardView
    lateinit var cdDietician:CardView
    lateinit var cdDentist:CardView
    lateinit var cdSurgeon:CardView
    lateinit var cdCardiologist:CardView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_doctor)

        cdBack=findViewById(R.id.cardFDBack)
        cdFamilyPhysician=findViewById(R.id.cardFDFamilyPhysician)
        cdDietician=findViewById(R.id.cardFDDietician)
        cdDentist=findViewById(R.id.cardFDDentist)
        cdSurgeon=findViewById(R.id.cardFDSurgeon)
        cdCardiologist=findViewById(R.id.cardFDCardiologists)

        cdBack.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        cdFamilyPhysician.setOnClickListener {
            val intent=Intent(this,DoctorDetailsActivity::class.java)
            intent.putExtra("title","Family Physicians")
            startActivity(intent)
        }
        cdDietician.setOnClickListener {
            val intent=Intent(this,DoctorDetailsActivity::class.java)
            intent.putExtra("title","Dietician")
            startActivity(intent)
        }
        cdDentist.setOnClickListener {
            val intent=Intent(this,DoctorDetailsActivity::class.java)
            intent.putExtra("title","Dentist")
            startActivity(intent)
        }
        cdSurgeon.setOnClickListener {
            val intent=Intent(this,DoctorDetailsActivity::class.java)
            intent.putExtra("title","Surgeons")
            startActivity(intent)
        }
        cdCardiologist.setOnClickListener {
            val intent=Intent(this,DoctorDetailsActivity::class.java)
            intent.putExtra("title","Cardiologists")
            startActivity(intent)
        }


    }
}