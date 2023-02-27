package com.example.addnamesavedata2.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.addnamesavedata2.databinding.FragmentMainBinding
import androidx.databinding.DataBindingUtil
import com.example.addnamesavedata2.R
import com.example.addnamesavedata2.BR.myProject

class MainFragment : Fragment() {

//    private var _binding: FragmentMainBinding? = null
//    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_main, container, false)
//        _binding = FragmentMainBinding.inflate(inflater, container, false)
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false)

        binding.setLifecycleOwner(this)
        return binding.root
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        binding.setVariable(myProject, viewModel)

//        val resultObserver = Observer<String> {
//            result -> binding.resultText.text = result.toString()
//        }
//        viewModel.getResult().observe(viewLifecycleOwner, resultObserver)
//
//        binding.addNameButton.setOnClickListener {
//            if (binding.nameText.text.isNotEmpty()) {
//                viewModel.setString(binding.nameText.text.toString())
//            }
//        }

    }

}