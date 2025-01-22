package com.example.lyodsdi

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LoggerModule {

    @Provides
    fun provideLogger() : ILooger{
        return  ConsoleLogger()
    }
}