package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image: Int

)

val pages = listOf(

    Page(
        title = "Hello There This is Hiren Gohil This Side",
        description = "I am passionate about enginnering and i love to create Applications",
        image = R.drawable.onboarding1

    ),
    Page(
        title = "Hello There This is Hiren Gohil This Side",
        description = "I am passionate about enginnering and i love to create Applications",
        image = R.drawable.onboarding2

    ),
    Page(
        title = "Hello There This is Hiren Gohil This Side",
        description = "I am passionate about enginnering and i love to create Applications",
        image = R.drawable.onboarding3

    )

)
