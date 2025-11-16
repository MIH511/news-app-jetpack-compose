package com.loc.newsapp.domain.usecase

import com.loc.newsapp.domain.manger.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManager.readDataEntry()
    }
}