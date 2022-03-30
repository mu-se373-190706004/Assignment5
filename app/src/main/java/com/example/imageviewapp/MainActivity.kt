package com.example.imageviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<ListView>(R.id.list)
        val names = arrayOf("Agah", "Dilay", "Gürkan", "Mert", "Emre")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )
        list.adapter = arrayAdapter

        list.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"item selected "+ names [i], Toast.LENGTH_LONG)
                .show()
        }
    }
    fun addImage(view:View){

        imageView.setImageResource(R.drawable.agah)

    }
    fun nextPage(view:View){
        val intent = Intent(applicationContext,detayAktivity::class.java)
        startActivity(intent)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true
    }

}