package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MyTag", "New Application")
        val greetings = findViewById<TextView>(R.id.txt_hello)
        val inputname = findViewById<EditText>(R.id.name)
        val btn = findViewById<Button>(R.id.btn_submit)
        val btnoffer = findViewById<Button>(R.id.btn_offers)
        var name = ""
        btn.setOnClickListener{
            name = inputname.text.toString()

            if(name == ""){
                greetings.text = ""
                btnoffer.visibility = INVISIBLE
                Toast.makeText(
                    this@MainActivity,
                    "Please enter your name",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val message = "Welcome $name"
                Log.i("MyTag", message)
                greetings.text = message
                inputname.text.clear()
                btnoffer.visibility= VISIBLE
            }

            btnoffer.setOnClickListener{
                var intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("User",name)
                startActivity(intent)
            }
        }
    }
}