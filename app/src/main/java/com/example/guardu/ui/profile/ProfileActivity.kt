package com.example.guardu.ui.profile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.example.guardu.ui.community.CommunityActivity
import com.example.guardu.ui.homescreen.HomescreenActivity
import com.example.guardu.ui.login.LoginActivity
import com.example.guardu.ui.news.NewsActivity

class ProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile) // Gunakan layout yang benar

        // Set padding for edge-to-edge support
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navbar listeners
        findViewById<View>(R.id.nav_home).setOnClickListener {
            navigateToHome()
        }
        findViewById<View>(R.id.nav_news).setOnClickListener {
            navigateToNews()
        }
        findViewById<View>(R.id.nav_community).setOnClickListener {
            navigateToCommunity()
        }
        findViewById<View>(R.id.nav_profile).setOnClickListener {
            navigateToProfile()
        }

        // Logout button listener
        findViewById<View>(R.id.logoutButton).setOnClickListener {
            navigateToLogin()
        }
    }

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

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
    class ProfileActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_profile)
        }
    }
}
