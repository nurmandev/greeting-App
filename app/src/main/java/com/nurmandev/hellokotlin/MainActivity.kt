package com.nurmandev.hellokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Apply window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize views
        val editText: EditText = findViewById(R.id.editText)
        val submitBTN: Button = findViewById(R.id.submitBTN)
        val title: TextView = findViewById(R.id.title)

        // Set onClickListener with lambda syntax
        submitBTN.setOnClickListener {
            val inputText = editText.text.toString()
            title.text = inputText
            Toast.makeText(this, "Welcome $inputText to our App", Toast.LENGTH_SHORT).show()
        }
    }
}
