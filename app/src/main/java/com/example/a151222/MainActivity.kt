package com.example.a151222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            //findViewById<Button>(R.id.button).text=findViewById<TextView>(R.id.textView).text
            findViewById<Button>(R.id.button).text=findViewById<TextInputEditText>(R.id.poletekstowe).text.toString() + findViewById<TextInputEditText>(R.id.poletekstowe2).text.toString()
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<Button>(R.id.button2).text=findViewById<TextInputEditText>(R.id.poletekstowe2).text
            findViewById<Button>(R.id.button).isEnabled=false
        }
    }
}