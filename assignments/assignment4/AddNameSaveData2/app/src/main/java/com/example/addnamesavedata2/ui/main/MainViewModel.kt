package com.example.addnamesavedata2.ui.main
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    //private var nameText = ""
    var nameText: MutableLiveData<String> = MutableLiveData()
    var stringResult: MutableLiveData<String> = MutableLiveData("")

    fun convertText() {
        nameText.let {
            if (!it.value.equals("")) {
                stringResult.value += it.value?.toString().plus("\n")
            } else {
                stringResult.value = "No names to display"
            }

        }

//    fun setString(value: String) {
//        this.nameText = value
//        stringResult.setValue(value.joinToString("\n"))
//    }
//
//    fun getResult(): MutableLiveData<String> {
//        return stringResult
//    }
    }
}