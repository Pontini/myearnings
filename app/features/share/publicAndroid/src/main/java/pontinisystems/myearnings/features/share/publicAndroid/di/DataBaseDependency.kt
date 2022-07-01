package pontinisystems.myearnings.features.share.publicAndroid.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pontinisystems.myearnings.features.share.publicAndroid.data.database.Database
import pontinisystems.myearnings.features.share.publicAndroid.data.database.dao.ProfileDao
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): Database {
        return Database(app)
    }

    @Provides
    fun provideProfileDao(database: Database): ProfileDao {
        return database.profileDao()
    }

}