package com.bahri.storyapp.data.remote.model.home

import com.bahri.storyapp.data.remote.model.home.ListStory
import com.google.gson.annotations.SerializedName

data class ResponseHome(
    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String,

    @field:SerializedName("listStory")
    val listStory: List<ListStory>,
)
