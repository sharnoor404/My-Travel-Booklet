package com.example.mylandmarkbooklet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var landmarkNames=ArrayList<String>()
        landmarkNames.add("Venice")
        landmarkNames.add("Atacama Desert")
        landmarkNames.add("Whitsunday")
        landmarkNames.add("Pyramid of Giza")
        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)
        listView.adapter=arrayAdapter
    }
}
