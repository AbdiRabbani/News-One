package com.example.newsone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsone.DataNest
import com.example.newsone.NewsAdapter
import com.example.newsone.R
import com.example.newsone.bindingNewsHeadline
import com.example.newsone.databinding.FragmentPopularBinding
import com.example.newsone.databinding.FragmentTopBinding

class TopFragment : Fragment() {

    private lateinit var binding : FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater,container,false)
        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNest.dataTopNews)
        }
        bindingNewsHeadline(binding.newsHeadline, 2)
        return binding.root
    }
}