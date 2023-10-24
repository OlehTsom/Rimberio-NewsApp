package com.example.rimberio.presentation.introduction

import androidx.annotation.DrawableRes
import com.example.rimberio.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image : Int
)

val pages = listOf(
    Page(
        title = "Willkommen bei Rimberio News",
        description = "Erfahren Sie mehr über unsere Plattform und wie sie Ihnen aktuelle Nachrichten und Informationen bietet.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Entdecken Sie unsere News-Plattform",
        description = "Sie erhalten Zugang zu den neuesten Nachrichten, die für Sie am wichtigsten sind.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Personalisierte Nachrichten für Sie",
        description = "Bleiben Sie über aktuelle Ereignisse auf dem Laufenden, ganz nach Ihren Vorlieben und Bedürfnissen.",
        image = R.drawable.onboarding3
    )
)
