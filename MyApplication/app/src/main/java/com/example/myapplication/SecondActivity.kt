package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val view = findViewById<TextView>(R.id.textView)
        var name = intent.getStringExtra("User")
        var message = "Hello $name! \n Welcome to new view"
        view.text = message
    }
}