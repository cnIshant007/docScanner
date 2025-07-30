package com.zynksoftware.documentscannersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zynksoftware.documentscannersample.databinding.ActivityMainBinding
import com.zynksoftware.documentscannersample.databinding.AppScanActivityLayoutBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListners()
    }

    private fun initListners() {
        binding.scanLibButton.setOnClickListener {
            AppScanActivity.start(this)
        }
    }
}