package com.example.guardu.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.example.guardu.ui.signup.SignupActivity
import com.google.android.material.button.MaterialButton

class Onboard3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3)

        // Mengatur padding agar sesuai dengan system insets (opsional)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tombol "Sign Up"
        val signUpButton = findViewById<MaterialButton>(R.id.next)
        signUpButton.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        // Tombol "<<"
        val backButton = findViewById<MaterialButton>(R.id.back)
        backButton.setOnClickListener {
            val intent = Intent(this, Onboard2Activity::class.java)
            startActivity(intent)
            finish() // Mengakhiri aktivitas saat ini agar tidak menumpuk di back stack
        }
    }
}
