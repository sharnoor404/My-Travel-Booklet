package com.example.mylandmarkbooklet

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
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
        landmarkNames.add("Twelve Apostles")


        val venice=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.venice)
        val atacama=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.atacama)
        val whitsunday=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.whitsunday)
        val apostles=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.apostles)


        val landmarkImages=ArrayList<Bitmap>()

        landmarkImages.add(venice)
        landmarkImages.add(atacama)
        landmarkImages.add(whitsunday)
        landmarkImages.add(apostles)


        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)
        listView.adapter=arrayAdapter

        listView.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->

            val intent= Intent(applicationContext,DetailActivity::class.java)
            intent.putExtra("name",landmarkNames[position])
            startActivity(intent)
        }
    }
}
