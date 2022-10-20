package com.example.theescape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Third_lvl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_lvl)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.GONE
        val nextButton: Button =findViewById(R.id.nextButton3)
        nextButton.visibility= View.GONE
    }
    fun imageButton1_lvl3_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl3)
        textView.setText(R.string.imageButton1_lvl3)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.GONE
        val nextButton: Button =findViewById(R.id.nextButton3)
        nextButton.visibility= View.VISIBLE
    }
    fun imageButton2_lvl3_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl3)
        textView.setText(R.string.imageButton2_lvl3)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton3)
        nextButton.visibility= View.GONE
    }

    fun imageButton3_lvl3_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl3)
        textView.setText(R.string.imageButton3_lvl3)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton3)
        nextButton.visibility= View.GONE
    }

    fun restartButton_Click(view: View) {
        val intent: Intent = Intent(this@Third_lvl,MainActivity::class.java)
        when(view.id)
        {
            R.id.restartButton->startActivity(intent)
        }
    }
    fun nextButton3_Click(view: View) {
        val intent: Intent = Intent(this@Third_lvl,Fourth_lvl::class.java)
        when(view.id)
        {
            R.id.nextButton3->startActivity(intent)
        }
    }
}