package com.androiddevs.mvvmnewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import com.androiddevs.mvvmnewsapp.repo.NewsRepository
import kotlinx.android.synthetic.main.activity_news.*
import retrofit2.http.GET

class NewsActivity : AppCompatActivity() {

    lateinit var newsViewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelFactory = NewsViewModelFactory(newsRepository)
        newsViewModel = ViewModelProvider(this, viewModelFactory).get(NewsViewModel::class.java)
        bottomNavigationView.setupWithNavController(NavHostFragment.findNavController())
    }

}
