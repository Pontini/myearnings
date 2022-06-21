package pontinisystems.myearnings.features.share.impl.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pontinisystems.myearnings.features.share.impl.infra.database.Database
import pontinisystems.myearnings.features.share.impl.infra.repositories.ProfileRepositoryImpl
import pontinisystems.myearnings.features.share.impl.infra.repositories.StockRepositoryImpl
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository
import pontinisystems.myearnings.features.share.publ.domain.repository.StockRepository
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ShareModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): Database {
        return Database(app)
    }

    @Provides
    @Singleton
    fun provideStockRepository(db: Database): StockRepository {
        return StockRepositoryImpl(db.stockDao())
    }

    @Provides
    @Singleton
    fun provideProfileRepository(db: Database): ProfileRepository {
        return ProfileRepositoryImpl(db.profileDao())
    }
}