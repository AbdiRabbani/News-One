package com.example.newsone

import android.content.Intent
import com.example.newsone.databinding.NewsHeadlineBinding

fun bindingNewsHeadline(binding: NewsHeadlineBinding, position: Int){
    binding.apply {
        imgHeadline.setImageResource(DataNest.photoHeadline[position])
        tvTitleHeadline.text = DataNest.titleHeadline[position]
        tvDescHeadline.text = DataNest.contentHeadline[position]
        tvDateHeadline.text = DataNest.dateHeadline[position]
        tvAuthorHeadline.text= DataNest.authorHeadline[position]
    }

    binding.root.setOnClickListener{
        val intentToDetail = Intent(binding.root.context, DetailActivity::class.java)
        intentToDetail.putExtra(DetailActivity.EXTRA_AUTHOR_HEADLINE, DataNest.authorHeadline[position])
        intentToDetail.putExtra(DetailActivity.EXTRA_CONTENT_HEADLINE, DataNest.contentHeadline[position])
        intentToDetail.putExtra(DetailActivity.EXTRA_DATE_HEADLINE, DataNest.dateHeadline[position])
        intentToDetail.putExtra(DetailActivity.EXTRA_TITLE_HEADLINE, DataNest.titleHeadline[position])
        intentToDetail.putExtra(DetailActivity.EXTRA_IMG_HEADLINE, DataNest.photoHeadline[position])
        binding.root.context.startActivity(intentToDetail)
    }
}