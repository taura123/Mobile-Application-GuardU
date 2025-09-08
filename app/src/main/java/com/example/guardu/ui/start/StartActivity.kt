package com.example.guardu.ui.start

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.example.guardu.ui.login.LoginActivity // Import LoginActivity
import com.example.guardu.ui.onboarding.Onboard1Activity
import com.example.guardu.ui.onboarding.Onboard2Activity

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start)

        // Menambahkan OnClickListener ke tombol "Next"
        findViewById<com.google.android.material.button.MaterialButton>(R.id.getstarted).setOnClickListener {
            // Membuat Intent untuk berpindah ke Onboard2Activity
            val intent = Intent(this, Onboard1Activity::class.java)
            startActivity(intent) // Memulai Activity baru
            finish() // Menutup activity saat ini (opsional)
        }

        // Handle padding for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find TextView by ID and set OnClickListener
        val loginTextView: TextView = findViewById(R.id.login)
        loginTextView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
