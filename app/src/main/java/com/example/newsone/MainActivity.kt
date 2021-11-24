package com.example.newsone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsone.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.vpNews.adapter = SectionPagerAdapter(this)

        val tabList = arrayListOf("All News", "Top News", "Popular")
        TabLayoutMediator(binding.tabs, binding.vpNews){
            tab , position -> tab.text = tabList[position]
        }.attach()

    }
}