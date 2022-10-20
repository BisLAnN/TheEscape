package com.example.theescape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Seventh_lvl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh_lvl)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton7)
        nextButton.visibility= View.GONE
    }
    fun imageButton1_lvl7_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl7)
        textView.setText(R.string.imageButton1_lvl7)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton7)
        nextButton.visibility= View.GONE
    }
    fun imageButton2_lvl7_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl7)
        textView.setText(R.string.imageButton2_lvl7)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton7)
        nextButton.visibility= View.GONE
    }

    fun imageButton3_lvl7_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl7)
        textView.setText(R.string.imageButton3_lvl7)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.GONE
        val nextButton: Button =findViewById(R.id.nextButton7)
        nextButton.visibility= View.VISIBLE
    }

    fun restartButton_Click(view: View) {
        val intent: Intent = Intent(this@Seventh_lvl,MainActivity::class.java)
        when(view.id)
        {
            R.id.restartButton->startActivity(intent)
        }
    }
    fun nextButton7_Click(view: View) {
        val intent: Intent = Intent(this@Seventh_lvl,Final_lvl::class.java)
        when(view.id)
        {
            R.id.nextButton7->startActivity(intent)
        }
    }
}