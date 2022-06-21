package pontinisystems.myearnings.features.profile.impl.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pontinisystems.myearnings.features.profile.impl.domain.CreateProfileUseCases
import pontinisystems.myearnings.features.profile.impl.domain.usecase.InsertProfileUseCaseImpl
import pontinisystems.myearnings.features.profile.publ.domain.InsertProfileUseCase
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProfileDependency {

    @Provides
    fun provideCreateProfileUseCases(repository: ProfileRepository): CreateProfileUseCases {
        return CreateProfileUseCases(
            insertProfile = InsertProfileUseCaseImpl(repository),

            )
    }

}
