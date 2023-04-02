package com.example.recyclerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.recyclerproject.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras ?: return
        val titles = extras.getInt("Titles")
        val details = extras.getInt("Details")
        val images = extras.getInt("Images")
        binding.textView.text = Data.titles[titles]
        binding.textView2.text = Data.details[details]
        binding.imageView.setImageResource(Data.images[images])
    }
}