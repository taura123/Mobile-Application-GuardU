package com.example.guardu.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.example.guardu.ui.homescreen.HomescreenActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Atur padding untuk edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tambahkan logika klik pada tombol login
        val loginButton: Button = findViewById(R.id.materialButton2)
        loginButton.setOnClickListener {
            // Buat intent untuk berpindah ke HomeScreenActivity
            val intent = Intent(this, HomescreenActivity::class.java)
            startActivity(intent)
            // Opsional: Tambahkan finish() jika ingin menutup LoginActivity setelah login
            finish()  // Close the LoginActivity so user can't navigate back to it
        }
    }
}
