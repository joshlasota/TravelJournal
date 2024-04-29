package com.example.traveljournal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val addEntryButton = findViewById<Button>(R.id.addEntryButton)
        val viewEntriesButton = findViewById<Button>(R.id.viewEntriesButton)
        val settingsButton = findViewById<Button>(R.id.settingsButton)

        addEntryButton.setOnClickListener {
            val intent = Intent(this, AddEntryActivity::class.java)
            startActivity(intent)
        }

        viewEntriesButton.setOnClickListener {
            val intent = Intent(this, ViewEntriesActivity::class.java)
            startActivity(intent)
        }

        settingsButton.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
