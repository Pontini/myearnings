package pontinisystems.myearnings.features.share.data.datasource

interface ProfileDataSource {
    suspend fun insert(): Long
}