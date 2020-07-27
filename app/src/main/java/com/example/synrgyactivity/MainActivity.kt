package com.example.synrgyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.java.simpleName,"onCreate() dijalankan")

        btnHalaman1.setOnClickListener{
        val intent = Intent (this, Halamanke2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.java.simpleName, "onStart() dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.java.simpleName, "onResume() dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.java.simpleName, "onPause() dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.java.simpleName, "onStop() dijalankan")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity::class.java.simpleName, "OnRestart() dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.java.simpleName, "OnDestroy() dijalankan")
    }
}