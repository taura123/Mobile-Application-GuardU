package com.example.guardu.ui.signup

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.google.android.material.button.MaterialButton

class NumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_number)

        // Mengatur padding untuk window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Daftar negara dan kode telepon untuk Spinner
        val countries = listOf(
            "Argentina (+54)",
            "Indonesia (+62)",
            "Liberia (+231)",
            "Nicaragua (+505)",
            "Niger (+227)",
            "Nigeria (+234)"
        )

        // Inisialisasi Spinner
        val countrySpinner = findViewById<Spinner>(R.id.country_spinner)

        // Membuat adapter untuk Spinner
        val adapter = ArrayAdapter(
            this, // Context
            android.R.layout.simple_spinner_item, // Layout untuk item Spinner
            countries // Data yang akan ditampilkan di Spinner
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Menghubungkan adapter ke Spinner
        countrySpinner.adapter = adapter

        // Menambahkan fungsi untuk tombol Send OTP
        val sendOtpButton = findViewById<MaterialButton>(R.id.materialButton2)
        sendOtpButton.setOnClickListener {
            // Intent ke OtpActivity
            val intent = Intent(this, OtpActivity::class.java)
            startActivity(intent)
        }
    }
}
