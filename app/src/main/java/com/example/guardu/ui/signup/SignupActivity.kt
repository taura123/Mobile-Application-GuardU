package com.example.guardu.ui.signup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.example.guardu.ui.login.LoginActivity
import com.google.android.material.button.MaterialButton

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Inisialisasi elemen UI
        val signUpButton = findViewById<MaterialButton>(R.id.materialButton2)
        val signInTextView = findViewById<android.widget.TextView>(R.id.tv_sign_in)

        // Tambahkan listener untuk Sign Up Button
        signUpButton.setOnClickListener {
            // Intent ke NumberActivity
            val intent = Intent(this, NumberActivity::class.java)
            startActivity(intent)
        }

        // Tambahkan listener untuk Sign In TextView
        signInTextView.setOnClickListener {
            // Intent ke LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Edge-to-edge UI (opsional, jika memang dibutuhkan)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
