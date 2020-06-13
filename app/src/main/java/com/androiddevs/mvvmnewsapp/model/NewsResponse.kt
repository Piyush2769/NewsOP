package com.androiddevs.mvvmnewsapp.model

import com.androiddevs.mvvmnewsapp.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)