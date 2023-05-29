package org.d3if0000.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.d3if0000.galerihewan.util.MyTimer

class MainActivity : AppCompatActivity() {

    private lateinit var myTimer: MyTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTimer = MyTimer()
        Log.i("MainActivity", "onCreate dijalankan")
    }

    override fun onStart() {
        super.onStart()
        myTimer.startTimer()
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
        Log.i("MainActivity", "onStop dijalankan")
        myTimer.stopTimer()
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("MainActivity", "onDestroy dijalankan")
        super.onDestroy()
    }
}