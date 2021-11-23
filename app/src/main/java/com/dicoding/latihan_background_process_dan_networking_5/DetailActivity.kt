package com.dicoding.latihan_background_process_dan_networking_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.latihan_background_process_dan_networking_5.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    // Setup variable
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        binding.tvTitle.text = title
        binding.tvMessage.text = message
    }

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_MESSAGE = "extra_message"
    }
}