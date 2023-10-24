package com.example.rimberio.domain.usecases

import com.example.rimberio.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppSettings(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke() : Flow<Boolean>{
        return localUserManager.readAppSettings()
    }

}