package com.example.newsone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsone.DataNest
import com.example.newsone.NewsAdapter
import com.example.newsone.bindingNewsHeadline
import com.example.newsone.databinding.FragmentPopularBinding

class PopularFragment : Fragment() {

    private lateinit var binding : FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater,container,false)
        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNest.dataPopularNews)
        }
        bindingNewsHeadline(binding.newsHeadline, 1)
        return binding.root
    }
}