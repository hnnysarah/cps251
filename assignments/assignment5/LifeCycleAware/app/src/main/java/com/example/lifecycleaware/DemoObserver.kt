package com.example.lifecycleaware

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import com.example.lifecycleaware.ui.main.MainViewModel
import java.time.LocalTime

class DemoObserver: DefaultLifecycleObserver {

    private val LOG_TAG = "DemoObserver"
    var mainViewModel = MainViewModel
    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i(LOG_TAG, "onResume was fired on")
        mainViewModel.setString("onResume was fired on " + LocalTime.now() + "\n")
        mainViewModel.setString("**********" + "\n")
    }

    override fun onPause(owner: LifecycleOwner){
        super.onPause(owner)
        Log.i(LOG_TAG, "onPause was fired on")
        mainViewModel.setString("onPause was fired on " + LocalTime.now() + "\n")
        mainViewModel.setString("**********" + "\n")
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i(LOG_TAG, "onCreate was fired on")
        mainViewModel.setString("onCreate was fired on " + LocalTime.now() + "\n")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.i(LOG_TAG, "onStart was fired on")
        mainViewModel.setString("onStart was fired on " + LocalTime.now() + "\n")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.i(LOG_TAG, "onStop was fired on")
        mainViewModel.setString("onStop was fired on " + LocalTime.now() + "\n")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i(LOG_TAG, "onDestroy was fired on")
        mainViewModel.setString("onDestroy was fired on " + LocalTime.now() + "\n")
        mainViewModel.setString("**********" + "\n")
    }

}