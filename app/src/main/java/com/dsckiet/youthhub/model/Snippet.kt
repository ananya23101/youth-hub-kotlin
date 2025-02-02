package com.dsckiet.youthhub.model

data class Snippet(
    val channelId: String?,
    val channelTitle: String?,
    val description: String?,
    val localized: Localized?,
    val publishedAt: String?,
    val thumbnails: Thumbnails?,
    val title: String?
)