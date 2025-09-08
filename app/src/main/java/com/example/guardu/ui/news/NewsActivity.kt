package com.example.guardu.ui.news

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
import com.example.guardu.ui.profile.ProfileActivity

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_news)

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
            // Currently on NewsActivity, so no need to navigate
        }

        findViewById<View>(R.id.nav_community).setOnClickListener {
            navigateToCommunity()
        }

        findViewById<View>(R.id.nav_profile).setOnClickListener {
            navigateToProfile()
        }

        // Set up click listener for the news image to navigate to News1Activity
        findViewById<View>(R.id.imageView4).setOnClickListener {
            navigateToNews1()
        }
    }

    // Navigation methods for each item
    private fun navigateToHome() {
        val intent = Intent(this, HomescreenActivity::class.java)
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

    private fun navigateToNews1() {
        val intent = Intent(this, News1Activity::class.java)
        startActivity(intent)
    }
}
