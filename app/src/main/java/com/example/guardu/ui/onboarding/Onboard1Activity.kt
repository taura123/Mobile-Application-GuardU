package com.example.guardu.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R

class Onboard1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard1)

        // Menambahkan OnClickListener ke tombol "Next"
        findViewById<com.google.android.material.button.MaterialButton>(R.id.next).setOnClickListener {
            // Membuat Intent untuk berpindah ke Onboard2Activity
            val intent = Intent(this, Onboard2Activity::class.java)
            startActivity(intent) // Memulai Activity baru
            finish() // Menutup activity saat ini (opsional)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
