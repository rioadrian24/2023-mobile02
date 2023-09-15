package com.radrnmstd.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // TODO: tambahkan callback onStart() di sini

    // TODO: tambahkan callback onStop() di sini

    // TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()
}