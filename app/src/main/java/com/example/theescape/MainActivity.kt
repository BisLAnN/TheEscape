package com.example.theescape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Старт")
    }

    fun startButton_Click(view: View) {
        val intent:Intent=Intent(this@MainActivity, History::class.java)
        when (view.id)
        {
            R.id.startButton->startActivity(intent)
        }
    }
}