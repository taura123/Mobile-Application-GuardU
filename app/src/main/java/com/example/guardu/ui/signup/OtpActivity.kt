package com.example.guardu.ui.signup

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guardu.R
import com.example.guardu.ui.login.LoginActivity

class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otp)

        // Handling edge-to-edge behavior (system bars)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up click listener for the Confirm button
        findViewById<View>(R.id.confirm_button).setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()  // Optionally, finish the current activity to prevent navigating back to it
        }

        // Set up click listener for the "Edit now" link
        findViewById<View>(R.id.edit_number_text).setOnClickListener {
            val intent = Intent(this, NumberActivity::class.java)
            startActivity(intent)
        }

    }
}
