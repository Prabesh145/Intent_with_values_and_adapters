package com.example.intentwithvalue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvResult = findViewById(R.id.tvResult)

      /*  val result = intent.getIntExtra("output",0)
        tvResult.text = "The sum of numbers are:$result"*/

        val result = intent.getStringExtra("Capital")
        Toast.makeText(this, "The capital of the country is $result", Toast.LENGTH_SHORT).show()

    }
}