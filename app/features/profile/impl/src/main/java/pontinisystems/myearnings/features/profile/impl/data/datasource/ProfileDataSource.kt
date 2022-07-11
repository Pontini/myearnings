package pontinisystems.myearnings.features.profile.impl.data.datasource

import pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity

interface ProfileDataSource {
    suspend fun insert(profile: ProfileEntity): Long
}