package com.example.theescape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Fifth_lvl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_lvl)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton5)
        nextButton.visibility= View.GONE
    }
    fun imageButton1_lvl5_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl5)
        textView.setText(R.string.imageButton1_lvl5)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.GONE
        val nextButton: Button =findViewById(R.id.nextButton5)
        nextButton.visibility= View.VISIBLE
    }
    fun imageButton2_lvl5_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl2)
        textView.setText(R.string.imageButton2_lvl5)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton5)
        nextButton.visibility= View.GONE
    }

    fun imageButton3_lvl5_Click(view: View) {
        val textView: TextView = findViewById(R.id.textView_lvl5)
        textView.setText(R.string.imageButton3_lvl5)
        val restartButton: Button =findViewById(R.id.restartButton)
        restartButton.visibility= View.VISIBLE
        val nextButton: Button =findViewById(R.id.nextButton5)
        nextButton.visibility= View.GONE
    }

    fun restartButton_Click(view: View) {
        val intent: Intent = Intent(this@Fifth_lvl,MainActivity::class.java)
        when(view.id)
        {
            R.id.restartButton->startActivity(intent)
        }
    }
    fun nextButton5_Click(view: View) {
        val intent: Intent = Intent(this@Fifth_lvl,Sixth_lvl::class.java)
        when(view.id)
        {
            R.id.nextButton5->startActivity(intent)
        }
    }
}