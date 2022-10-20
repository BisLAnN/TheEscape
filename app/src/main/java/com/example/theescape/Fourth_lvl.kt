package com.example.theescape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Fourth_lvl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_lvl)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.GONE
        val nextButton: Button =findViewById(R.id.nextButton4)
        nextButton.visibility= View.GONE
    }
    fun imageButton1_lvl4_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl4)
        textView.setText(R.string.imageButton1_lvl4)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton4)
        nextButton.visibility= View.GONE
    }
    fun imageButton2_lvl4_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl4)
        textView.setText(R.string.imageButton2_lvl4)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.GONE
        val nextButton: Button =findViewById(R.id.nextButton4)
        nextButton.visibility= View.VISIBLE
    }

    fun imageButton3_lvl4_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl4)
        textView.setText(R.string.imageButton3_lvl4)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton4)
        nextButton.visibility= View.GONE
    }

    fun restartButton_Click(view: View) {
        val intent: Intent = Intent(this@Fourth_lvl,MainActivity::class.java)
        when(view.id)
        {
            R.id.restartButton->startActivity(intent)
        }
    }
    fun nextButton4_Click(view: View) {
        val intent: Intent = Intent(this@Fourth_lvl,Fifth_lvl::class.java)
        when(view.id)
        {
            R.id.nextButton4->startActivity(intent)
        }
    }
}