package com.example.loginapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding? = null
    var adapter:FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val listview: ListView = findViewById(R.id.list_view)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setupFact()
    }


    private fun setupFact() {
        adapter = FactAdapter(this, DummyData.facts)
        binding?.listView?.adapter = adapter

    }

    override fun onDestroy(){
        super.onDestroy()
        binding = null
    }
}
