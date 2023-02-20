package com.example.addnamesavedata.ui.main
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private var nameText = ""
    private var stringResult = ""

    fun setString(value: String) {
        this.nameText = value
        stringResult += value + "\n"
    }

    fun getResult(): String {
        return stringResult
    }
}