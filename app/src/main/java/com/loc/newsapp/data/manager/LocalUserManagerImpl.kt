package com.loc.newsapp.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.loc.newsapp.domain.manager.LocalUserManager
import com.loc.newsapp.ui.util.Constants
import com.loc.newsapp.ui.util.Constants.APP_ENTRY
import com.loc.newsapp.ui.util.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.prefs.Preferences
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import androidx.datastore.preferences.preferencesDataStore as preferencesDataStore1

class LocalUserManagerImpl(

    private val context: Context

): LocalUserManager
{
    override suspend fun saveAppEntry() {

        context.dataStore.edit{ settings ->
            settings[PreferenceKeys.APP_ENTRY] = true

        }

    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map { preferences ->
            preferences[PreferenceKeys.APP_ENTRY] ?: false
        }
    }


}

private val Context.dataStore: DataStore<androidx.datastore.preferences.core.Preferences> by preferencesDataStore(name = USER_SETTINGS)


private object PreferenceKeys{
    val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)

}