package com.example.theescape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Sixth_lvl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth_lvl)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton6)
        nextButton.visibility= View.GONE
    }
    fun imageButton1_lvl6_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl6)
        textView.setText(R.string.imageButton1_lvl6)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton6)
        nextButton.visibility= View.GONE
    }
    fun imageButton2_lvl6_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl6)
        textView.setText(R.string.imageButton2_lvl6)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.GONE
        val nextButton: Button =findViewById(R.id.nextButton6)
        nextButton.visibility= View.VISIBLE
    }

    fun imageButton3_lvl6_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl6)
        textView.setText(R.string.imageButton3_lvl6)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton6)
        nextButton.visibility= View.GONE
    }

    fun restartButton_Click(view: View) {
        val intent: Intent = Intent(this@Sixth_lvl,MainActivity::class.java)
        when(view.id)
        {
            R.id.restartButton->startActivity(intent)
        }
    }
    fun nextButton6_Click(view: View) {
        val intent: Intent = Intent(this@Sixth_lvl,Seventh_lvl::class.java)
        when(view.id)
        {
            R.id.nextButton6->startActivity(intent)
        }
    }
}