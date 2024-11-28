package com.example.helloworld

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import android.widget.Toast
import com.example.helloworld.databinding.ActivityMainBinding
import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
//        val button1: Button = findViewById(R.id.button1)

        binding.button1.setOnClickListener{
            Toast.makeText(this, "You clicked Button 1", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.buttonFinish.setOnClickListener{
            finish()
        }
        Log.d("data", "onCreate execute")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add",
                Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove",
                Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onDestroy() {
        super.onDestroy()
        val inputText = binding.editText.text.toString()
        Log.d("data", inputText)
        save(inputText)
    }

    private fun save(inputText: String){
        try{
            val output = openFileOutput("data", Context.MODE_PRIVATE)
            val writer = BufferedWriter(OutputStreamWriter(output))
            writer.use {
                it.write(inputText)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}