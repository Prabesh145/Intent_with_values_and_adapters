package com.example.intentwithvalue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var btnAdd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnAdd = findViewById(R.id.btnAdd)

        btnAdd.setOnClickListener {
            val first = etFirst.text.toString().toInt()
            val second = etSecond.text.toString().toInt()
            val result:Int =  first + second

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("output", result)
            startActivity(intent)


        }

    }

}