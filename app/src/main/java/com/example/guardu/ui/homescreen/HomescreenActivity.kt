package com.example.guardu.ui.homescreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.example.guardu.ui.chatbot.ChatbotActivity
import com.example.guardu.ui.community.CommunityActivity
import com.example.guardu.ui.emergencybutton.EmergencyActivity
import com.example.guardu.ui.news.News1Activity
import com.example.guardu.ui.news.NewsActivity
import com.example.guardu.ui.profile.ProfileActivity
import com.example.guardu.ui.reportstatus.ReportstatusActivity
import com.example.guardu.ui.uploadreport.UploadreportActivity

class HomescreenActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homescreen)

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
        findViewById<View>(R.id.uploadreport).setOnClickListener{
            navigateToUploadreport()
        }


        // Other button listeners

        findViewById<View>(R.id.llcommunitybutton).setOnClickListener {
            navigateToCommunity()
        }
        findViewById<View>(R.id.llreportstatusbutton).setOnClickListener {
            navigateToReportStatus()
        }
        findViewById<View>(R.id.llnewsbutton).setOnClickListener {
            navigateToNews()
        }
        findViewById<View>(R.id.btnAskKojo).setOnClickListener {
            navigateToChatbot()
        }
        findViewById<View>(R.id.tvSeeAll).setOnClickListener {
            navigateToNews()
        }
        findViewById<View>(R.id.ivArrow).setOnClickListener {
            navigateToNews1()
        }
        findViewById<View>(R.id.nav_logo).setOnClickListener{
            navigateToEmergency()
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomescreenActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToUploadreport() {
        val intent = Intent(this, UploadreportActivity::class.java)
        startActivity(intent)}


    private fun navigateToNews() {
        val intent = Intent(this, NewsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }


    private fun navigateToCommunity() {
        val intent = Intent(this, CommunityActivity::class.java)
        startActivity(intent)
    }



    private fun navigateToReportStatus() {
        val intent = Intent(this, ReportstatusActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToChatbot() {
        val intent = Intent(this, ChatbotActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToNews1() {
        val intent = Intent(this, News1Activity::class.java)
        startActivity(intent)
    }
    private fun navigateToEmergency() {
        val intent = Intent(this, EmergencyActivity::class.java)
        startActivity(intent)
    }
}
