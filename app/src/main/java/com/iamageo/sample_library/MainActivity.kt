package com.iamageo.sample_library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iamageo.awesome_toast.showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupToast()
    }

    private fun setupToast() {
        showToast(this, "its work")
    }

}