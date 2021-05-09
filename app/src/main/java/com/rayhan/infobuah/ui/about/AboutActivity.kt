package com.rayhan.infobuah.ui.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rayhan.infobuah.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}