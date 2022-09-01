package com.imn.tummoc.di

import android.content.Context
import com.imn.tummoc.data.Repo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ActivityComponent::class)
object AppModule {

    @Provides
    fun provideRepo(context:Context) : Repo = Repo(context)
}