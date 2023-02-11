package com.example.tipcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tipcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    @SuppressLint("SetTextI18n")
    fun tipCalculation(view: View) {
        if (binding.billText.text.isNotEmpty()) {
            val billTotal = binding.billText.text.toString().toFloat()
            val tipValue1 = billTotal * 1.10f
            val tipValue2 = billTotal * 1.15f
            val tipValue3 = billTotal * 1.20f
            val tipValue1Format = String.format("%.2f", tipValue1)
            val tipValue2Format = String.format("%.2f", tipValue2)
            val tipValue3Format = String.format("%.2f", tipValue3)
            binding.TextView.text = "The tips are as follows:\n" +
                    "\n10% = $tipValue1Format\n" +"15% = $tipValue2Format\n" + "20% = $tipValue3Format\n"
        } else {
            binding.TextView.text = getString(R.string.noValue)
        }
    }

}