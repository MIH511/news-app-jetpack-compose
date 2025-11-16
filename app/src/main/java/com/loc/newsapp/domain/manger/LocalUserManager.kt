package com.loc.newsapp.domain.manger

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    suspend fun saveAppEntry()
    suspend fun readDataEntry(): Flow<Boolean>
}