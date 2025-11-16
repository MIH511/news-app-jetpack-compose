package com.loc.newsapp.data.manager

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.loc.newsapp.domain.manger.LocalUserManager
import com.loc.newsapp.utils.Constant
import com.loc.newsapp.utils.Constant.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalUserManagerImpl(
    private val context: Context
): LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit {settings->
            settings[PreferencesKey.APP_ENTRY] = true
        }
    }

    override suspend fun readDataEntry(): Flow<Boolean> {
        return context.dataStore.data.map { preferences->
            preferences[PreferencesKey.APP_ENTRY] ?: false
        }
    }
}

private val Context.dataStore by preferencesDataStore(name = USER_SETTINGS)

private object PreferencesKey{
    val APP_ENTRY = booleanPreferencesKey(name = Constant.APP_ENTRY)

}