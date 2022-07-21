package pontinisystems.myearnings.features.profile.impl.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import pontinisystems.myearnings.features.profile.domain.usecase.InsertProfileUseCase
import pontinisystems.myearnings.features.profile.impl.data.datasource.ProfileDataSource
import pontinisystems.myearnings.features.profile.impl.data.datasource.local.ProfileDataSourceImpl
import pontinisystems.myearnings.features.profile.impl.data.repository.ProfileRepositoryImpl
import pontinisystems.myearnings.features.profile.impl.domain.usecase.InsertProfileUseCaseImpl
import pontinisystems.myearnings.features.profile.impl.domain.repository.ProfileRepository
import pontinisystems.myearnings.features.profile.impl.presentation.viewmodel.DefaultDispatcherProvider
import pontinisystems.myearnings.features.profile.impl.presentation.viewmodel.DispactcherProvider
import pontinisystems.myearnings.features.share.data.database.Database

@Module
@InstallIn(ViewModelComponent::class)
object ProfileDependency {
    @Provides
    fun provideInsertProfileUseCase(profileRepository: ProfileRepository): InsertProfileUseCase {
        return InsertProfileUseCaseImpl(profileRepository)
    }

    @Provides
    fun provideProfileRepository(profileDataSource: ProfileDataSource): ProfileRepository {
        return ProfileRepositoryImpl(profileDataSource)
    }

    @Provides
    fun provideProfileDataSource(db: Database): ProfileDataSource {
        return ProfileDataSourceImpl(db.profileDao())
    }

    @Provides
    fun provideDispatcherProvider(): DispactcherProvider {
        return DefaultDispatcherProvider()
    }
}