package com.example.newsone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsone.databinding.ActivityDetailBinding
import com.example.newsone.databinding.NewsHeadlineBinding

class DetailActivity : AppCompatActivity() {

    companion object{
        const val NEWS_DATA = "data"
        const val EXTRA_IMG_HEADLINE = "image"
        const val EXTRA_TITLE_HEADLINE = "title"
        const val EXTRA_CONTENT_HEADLINE = "desc"
        const val EXTRA_DATE_HEADLINE = "date"
        const val EXTRA_AUTHOR_HEADLINE = "author"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setSupportActionBar(binding.toolbarDetail)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = "news"
            }

        //menerima data dari intent parcelable
        val news = intent.getParcelableExtra<News>(NEWS_DATA)


        val photoHeadLine = intent.getIntExtra(EXTRA_IMG_HEADLINE, 0)
        val titleHeadline = intent.getStringExtra(EXTRA_TITLE_HEADLINE)
        val contentHeadLine = intent.getStringExtra(EXTRA_CONTENT_HEADLINE)
        val dateHeadLine = intent.getStringExtra(EXTRA_DATE_HEADLINE)
        val authorHeadLine = intent.getStringExtra(EXTRA_AUTHOR_HEADLINE)

     if(news != null){
         binding.imgNewsDetail.setImageResource(news.photo)
         binding.tvTitleDetail.text = news.title
         binding.tvContentDetail.text = news.content
         binding.tvDateDetail.text = news.date
         binding.tvAuthorDetail.text = news.author
     }else{
         binding.imgNewsDetail.setImageResource(photoHeadLine)
         binding.tvTitleDetail.text = titleHeadline
         binding.tvContentDetail.text = contentHeadLine
         binding.tvDateDetail.text = dateHeadLine
         binding.tvAuthorDetail.text = authorHeadLine
     }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}