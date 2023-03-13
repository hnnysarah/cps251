package com.example.lifecycleaware.ui.main

import androidx.lifecycle.ViewModel
import com.example.lifecycleaware.DemoObserver
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    companion object {
    private var stringResult: MutableLiveData<String> = MutableLiveData("")
    fun setString(value: String) {
        stringResult.value += value
    }
}
    fun getString(): MutableLiveData<String> {
        return stringResult
    }
}