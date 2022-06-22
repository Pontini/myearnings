package pontinisystems.myearnings.features.profile.impl.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pontinisystems.myearnings.features.profile.impl.domain.ProfileUseCases
import pontinisystems.myearnings.features.profile.impl.domain.usecase.InsertProfileUseCaseImpl
import pontinisystems.myearnings.features.profile.impl.domain.usecase.LoadProfileUseCaseImpl
import pontinisystems.myearnings.features.profile.impl.presentation.viewmodel.DefaultDispatcherProvider
import pontinisystems.myearnings.features.profile.impl.presentation.viewmodel.DispactcherProvider
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProfileDependency {

    @Provides
    fun provideCreateProfileUseCases(repository: ProfileRepository): ProfileUseCases {
        return ProfileUseCases(
            insertProfile = InsertProfileUseCaseImpl(repository),
            loadAddressUseCase = LoadAddressUseCaseImpl(repository),
            loadProfileUseCase = LoadProfileUseCaseImpl(repository)
        )
    }

    @Provides
    @Singleton
    fun provideDispatcher():DispactcherProvider{
        return DefaultDispatcherProvider()
    }
}
