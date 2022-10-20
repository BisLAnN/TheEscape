package com.example.theescape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        setTitle("Предыстория")
    }

    fun historyNextButton_Click(view: View) {
        val intent: Intent = Intent(this@History, First_lvl::class.java)
        when(view.id)
        {
            R.id.historyNextButton->startActivity(intent)
        }
    }

}