package com.example.rimberio.domain.usecases

import com.example.rimberio.domain.manager.LocalUserManager

class SaveAppSettings(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManager.saveAppSettings()
    }

}