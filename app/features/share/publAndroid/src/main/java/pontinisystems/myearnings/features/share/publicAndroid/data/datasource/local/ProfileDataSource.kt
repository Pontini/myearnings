package pontinisystems.myearnings.features.share.publicAndroid.data.datasource.local

interface ProfileDataSource {
    suspend fun insert(): Long
}