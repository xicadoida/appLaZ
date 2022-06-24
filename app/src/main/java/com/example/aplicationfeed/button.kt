package com.example.aplicationfeed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class button : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        val bt_E = findViewById<Button>(R.id.bt_E)
        bt_E.setOnClickListener {
            val Intent = Intent (this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}