package com.example.animalsdangerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mammalsCard = findViewById<CardView>(R.id.mammals_card1)

        mammalsCard.setOnClickListener{
            val intent = Intent(this, MammalsActivity::class.java)
                startActivity(intent)
            }
    }
}