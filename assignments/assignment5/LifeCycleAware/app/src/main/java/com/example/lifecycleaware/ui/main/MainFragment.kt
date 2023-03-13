package com.example.lifecycleaware.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.lifecycleaware.R
import com.example.lifecycleaware.DemoObserver
import com.example.lifecycleaware.databinding.FragmentMainBinding
import com.example.lifecycleaware.ui.main.MainViewModel

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MainFragment()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        lifecycle.addObserver(DemoObserver())
        val resultObserver = Observer<String> {
            result -> binding.mainfragment.text = result.toString()
        }
        viewModel.getString().observe(viewLifecycleOwner, resultObserver)
    }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            _binding = FragmentMainBinding.inflate(inflater, container, false)
            return binding.root
        }

    }
