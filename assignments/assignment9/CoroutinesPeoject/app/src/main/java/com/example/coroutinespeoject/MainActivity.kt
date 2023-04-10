package com.example.coroutinespeoject

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coroutinespeoject.databinding.ActivityMainBinding
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {

    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        layoutManager = LinearLayoutManager(this)
        binding.contentMain.recyclerView.layoutManager = layoutManager
        adapter = RecyclerAdapter(viewModel)
        binding.contentMain.recyclerView.adapter = adapter
    }

    suspend fun performTask(name : String): String {
            val delay = (1..10).random() * 1000
            delay(delay.toLong())
            return "The name is $name and the delay was $delay milliseconds."
        }
    fun launchCoroutines(v: View){
        //Splits this char sequence to a list of strings around occurrences of the specified delimiters.
        val names = binding.TextView.text.toString().split(" ")
        coroutineScope.launch(Dispatchers.Main) {
            for (name in names) {
                viewModel.addNames(performTask(name))
                adapter?.notifyItemInserted(viewModel.getNames().size - 1)
            }
        }
    }

}