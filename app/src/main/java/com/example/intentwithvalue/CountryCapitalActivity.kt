package com.example.intentwithvalue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class CountryCapitalActivity : AppCompatActivity() {

    private lateinit var lvList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_capital)

        lvList = findViewById(R.id.lvList)

        val countryCapitals = mapOf<String,String>(
            "Nepal" to "Kathmandu",
            "India" to "New Delhi",
            "UK" to "London")

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            countryCapitals.keys.toTypedArray()
        )

        lvList.adapter = adapter

        lvList.setOnItemClickListener { adapterView, view, i, l ->
            val country = adapterView.getItemAtPosition(i).toString()
            val capital = countryCapitals[country]
            //Toast.makeText(this, "The capital of $country is $capital", Toast.LENGTH_SHORT).show()
            intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Capital", capital)
            startActivity(intent)
        }


    }
}