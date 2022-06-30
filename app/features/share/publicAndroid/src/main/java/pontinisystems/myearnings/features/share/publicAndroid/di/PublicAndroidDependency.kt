package pontinisystems.myearnings.features.share.publicAndroid.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pontinisystems.myearnings.features.share.publicAndroid.data.database.Database
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ShareModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): Database {
        return Database(app)
    }

   /* @Provides
    fun provideStockRepository(db: Database): StockRepository {
        return StockRepositoryImpl(db.stockDao())
    }

    @Provides
    fun provideProfileRepository(db: Database): ProfileRepository {
        return ProfileRepositoryImpl(db.profileDao())
    }*/
}