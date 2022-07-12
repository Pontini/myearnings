package pontinisystems.myearnings.features.share.impl.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pontinisystems.myearnings.features.share.data.database.Database
import pontinisystems.myearnings.features.share.data.database.dao.ProfileDao
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataBaseDependency {
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