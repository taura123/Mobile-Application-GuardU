package com.example.guardu.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.google.android.material.button.MaterialButton

class Onboard2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard2)

        // Mengatur padding untuk view
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tombol ">>" untuk pindah ke Onboard3Activity
        val nextButton = findViewById<MaterialButton>(R.id.next)
        nextButton.setOnClickListener {
            val intent = Intent(this, Onboard3Activity::class.java)
            startActivity(intent)
        }

        // Tombol "<<" untuk kembali ke Onboard1Activity
        val backButton = findViewById<MaterialButton>(R.id.back)
        backButton.setOnClickListener {
            val intent = Intent(this, Onboard1Activity::class.java)
            startActivity(intent)
        }
    }
}
