package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideViewModel(repository: MyRepository): MyViewModel {
        return MyViewModel(repository)
    }
    @Singleton
    @Provides
    fun provideMyRepository(): MyRepository {
        return MyRepository()
    }
}