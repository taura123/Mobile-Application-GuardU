package com.example.guardu.ui.emergencybutton

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.example.guardu.ui.community.CommunityActivity
import com.example.guardu.ui.homescreen.HomescreenActivity
import com.example.guardu.ui.news.NewsActivity
import com.example.guardu.ui.profile.ProfileActivity

class EmergencyActivity : AppCompatActivity() {

    // Tombol-tombol untuk pilihan
    private lateinit var btnNonVerbal: Button
    private lateinit var btnVerbal: Button
    private lateinit var btnCyberBullying: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_emergency)

        // Inisialisasi tombol-tombol
        btnNonVerbal = findViewById(R.id.btnNonVerbal1)
        btnVerbal = findViewById(R.id.btnVerbal1)
        btnCyberBullying = findViewById(R.id.btnCyberBullying1)

        // Setup WindowInsets untuk edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Event listener untuk tombol
        setupButtonListeners()

        // Setup navigation bar
        setupNavigationBar()
    }

    private fun setupButtonListeners() {
        // Reset semua tombol ke default
        fun resetButtonStyles() {
            btnNonVerbal.setBackgroundResource(R.drawable.emergency_option_background)
            btnVerbal.setBackgroundResource(R.drawable.emergency_option_background)
            btnCyberBullying.setBackgroundResource(R.drawable.emergency_option_background)
        }

        // Non-Verbal button click
        btnNonVerbal.setOnClickListener {
            resetButtonStyles()
            btnNonVerbal.setBackgroundResource(R.drawable.emergency_option_background_selected) // Warna saat aktif
        }

        // Verbal button click
        btnVerbal.setOnClickListener {
            resetButtonStyles()
            btnVerbal.setBackgroundResource(R.drawable.emergency_option_background_selected) // Warna saat aktif
        }

        // Cyber Bullying button click
        btnCyberBullying.setOnClickListener {
            resetButtonStyles()
            btnCyberBullying.setBackgroundResource(R.drawable.emergency_option_background_selected) // Warna saat aktif
        }
    }

    private fun setupNavigationBar() {
        // Home navigation
        findViewById<View>(R.id.nav_home).setOnClickListener {
            navigateToHome()
        }

        // News navigation
        findViewById<View>(R.id.nav_news).setOnClickListener {
            navigateToNews()
        }

        // Community navigation
        findViewById<View>(R.id.nav_community).setOnClickListener {
            navigateToCommunity()
        }

        // Profile navigation
        findViewById<View>(R.id.nav_profile).setOnClickListener {
            navigateToProfile()
        }
        findViewById<View>(R.id.sosButtonText1).setOnClickListener{
            navigateToEmergency2()
        }
    }

    // Navigation methods
    private fun navigateToHome() {
        val intent = Intent(this, HomescreenActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToNews() {
        val intent = Intent(this, NewsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToCommunity() {
        val intent = Intent(this, CommunityActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToEmergency2(){
        val intent = Intent(this, Emergency2Activity::class.java)
        startActivity(intent)
    }
}
