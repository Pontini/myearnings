package pontinisystems.myearnings.features.profile.impl.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pontinisystems.myearnings.features.profile.impl.data.repository.ProfileRepositoryImpl
import pontinisystems.myearnings.features.profile.impl.domain.usecase.InsertProfileUseCaseImpl
import pontinisystems.myearnings.features.profile.impl.domain.repository.ProfileRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ProfileDependency {

    @Binds
    @Singleton
    abstract fun bindProfileRepository(
        profileRepository: ProfileRepositoryImpl
    ): ProfileRepository

    @Binds
    @Singleton
    abstract fun bindInsertProfileUseCase(
        insertProfileUseCase: InsertProfileUseCaseImpl
    ): InsertProfileUseCaseImpl
}