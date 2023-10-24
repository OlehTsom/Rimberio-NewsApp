package com.example.rimberio.di

import android.app.Application
import com.example.rimberio.data.manager.LocalUserManagerImpl
import com.example.rimberio.domain.manager.LocalUserManager
import com.example.rimberio.domain.usecases.AppSettingUseCases
import com.example.rimberio.domain.usecases.ReadAppSettings
import com.example.rimberio.domain.usecases.SaveAppSettings
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideLocalUserManager(
        application : Application
    ) : LocalUserManager = LocalUserManagerImpl(application)

    fun provideAppSettingsUseCases(
        localUserManager : LocalUserManager
    ) =
        AppSettingUseCases(
            readAppSettings = ReadAppSettings(localUserManager),
            saveAppSettings = SaveAppSettings(localUserManager)
        )

}