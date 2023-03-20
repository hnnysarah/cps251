package com.example.navigationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import com.example.navigationproject.ui.main.MainFragment

class MainActivity : AppCompatActivity(), SecondFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }
  }
    override fun onFragmentInteraction(uri: Uri) {

    }
}