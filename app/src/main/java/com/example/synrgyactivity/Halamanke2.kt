package com.example.synrgyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_halamanke2.*

class Halamanke2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanke2)
        Log.d(Halamanke2::class.java.simpleName, "OnCreate dijalankan pada halaman 2")

        btnHalaman2.setOnClickListener{
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(Halamanke2::class.java.simpleName, "onStart() dijalankan pada halaman 2")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Halamanke2::class.java.simpleName, "onResume() dijalankan pada halaman 2")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Halamanke2::class.java.simpleName, "onPause() dijalankan pada halaman 2")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Halamanke2::class.java.simpleName, "onStop() dijalankan pada halaman 2")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(Halamanke2::class.java.simpleName, "onRestart() dijalankan pada halaman 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Halamanke2::class.java.simpleName, "onDestroy() dijalankan pada halaman 2")
    }
}