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
import com.example.newsone.databinding.FragmentAllNewsBinding

class AllNewsFragment : Fragment() {

    private lateinit var binding : FragmentAllNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentAllNewsBinding.inflate(inflater,container,false)
        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNest.dataAllNews)
        }
        bindingNewsHeadline(binding.newsHeadline,0)

        return binding.root
    }
}