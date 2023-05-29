package org.d3if0000.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "onCreate dijalankan")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy dijalankan")
    }
}