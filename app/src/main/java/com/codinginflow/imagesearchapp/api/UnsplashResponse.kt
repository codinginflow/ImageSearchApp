package com.codinginflow.imagesearchapp.api

import com.codinginflow.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)