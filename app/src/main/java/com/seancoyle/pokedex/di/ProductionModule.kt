package com.seancoyle.pokedex.di

import android.content.Context
import com.seancoyle.pokedex.framework.presentation.BaseApplication
import com.seancoyle.core.testing.AndroidTestUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import javax.inject.Singleton


@ExperimentalCoroutinesApi
@FlowPreview
@Module
@InstallIn(SingletonComponent::class)
object ProductionModule {


    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext context: Context): BaseApplication {
        return context as BaseApplication
    }

    @Singleton
    @Provides
    fun provideAndroidTestUtils(): AndroidTestUtils {
        return AndroidTestUtils(false)
    }

}












