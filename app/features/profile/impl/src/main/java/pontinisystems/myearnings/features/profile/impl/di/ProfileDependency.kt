package pontinisystems.myearnings.features.profile.impl.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pontinisystems.myearnings.features.profile.domain.usecase.InsertProfileUseCase
import pontinisystems.myearnings.features.profile.impl.data.repository.ProfileRepositoryImpl
import pontinisystems.myearnings.features.profile.impl.domain.usecase.InsertProfileUseCaseImpl
import pontinisystems.myearnings.features.profile.impl.domain.repository.ProfileRepository
import pontinisystems.myearnings.features.share.publicAndroid.data.database.Database
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ProfileDependency {
    @Provides
    @Singleton
    fun provideInsertProfileUseCase(profileRepository: ProfileRepository): InsertProfileUseCase {
        return InsertProfileUseCaseImpl(profileRepository)
    }

    @Provides
    @Singleton
    fun provideProfileRepository(db: Database): ProfileRepository {
        return ProfileRepositoryImpl(db.profileDao())
    }
}