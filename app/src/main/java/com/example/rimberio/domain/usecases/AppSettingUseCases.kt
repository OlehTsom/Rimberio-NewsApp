package com.example.rimberio.domain.usecases

data class AppSettingUseCases(
    val readAppSettings: ReadAppSettings,
    val saveAppSettings: SaveAppSettings
)
