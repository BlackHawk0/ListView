package com.example.loginapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    private var logo = 0
    private var name:String? = null
    private var detail:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        
        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRA, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)
        setFactDetail()


    }


    private fun setFactDetail(){
        binding?.detailTv?.text = detail
        binding?.logoIv?.setImageResource(logo)
        title = name

    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}