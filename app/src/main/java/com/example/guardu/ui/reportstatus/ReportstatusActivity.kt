package com.example.guardu.ui.reportstatus

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
import com.example.guardu.ui.news.NewsActivity
import com.example.guardu.ui.profile.ProfileActivity

class ReportstatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reportstatus)

        // Set padding for edge-to-edge support
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up click listeners for the navigation bar
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
    }

    // Navigation methods for each item
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
}
