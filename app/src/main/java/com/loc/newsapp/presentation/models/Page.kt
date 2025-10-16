package com.loc.newsapp.presentation.models

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Stay Informed",
        description = "Get the latest breaking news and updates from trusted sources around the world.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Personalized Feed",
        description = "Choose your favorite topics and get stories that matter to you most.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Read Anywhere",
        description = "Access the news anytime, even offline — stay connected wherever you are.",
        image = R.drawable.onboarding3
    )
)