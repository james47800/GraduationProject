package com.mwangi.real

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button




class UploadActivity : AppCompatActivity() {

    private lateinit var btnHome: Button
    private lateinit var btnDiscover: Button
    private lateinit var btnUpload: Button
    private lateinit var btnAccount: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize buttons
        btnHome = findViewById(R.id.btnHomehome)
        btnDiscover = findViewById(R.id.btnDiscoverhome)
        btnUpload = findViewById(R.id.btnUploadhome)
        btnAccount = findViewById(R.id.btnAccounthome)

        // Set click listeners
        btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        btnDiscover.setOnClickListener {
            val intent = Intent(this, DiscoverActivity::class.java)
            startActivity(intent)
        }

        btnUpload.setOnClickListener {
            val intent = Intent(this, UploadActivity::class.java)
            startActivity(intent)
        }

        btnAccount.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }
    }
}
