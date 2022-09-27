package com.seancoyle.launch_usecases.di;

import com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource;
import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource;
import com.seancoyle.launch_usecases.launch.LaunchUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
@QualifierMetadata("com.seancoyle.core.di.IODispatcher")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LaunchUseCaseModule_ProvideLaunchUseCasesFactory implements Factory<LaunchUseCases> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<LaunchCacheDataSource> launchCacheDataSourceProvider;

  private final Provider<LaunchNetworkDataSource> launchNetworkDataSourceProvider;

  public LaunchUseCaseModule_ProvideLaunchUseCasesFactory(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<LaunchCacheDataSource> launchCacheDataSourceProvider,
      Provider<LaunchNetworkDataSource> launchNetworkDataSourceProvider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.launchCacheDataSourceProvider = launchCacheDataSourceProvider;
    this.launchNetworkDataSourceProvider = launchNetworkDataSourceProvider;
  }

  @Override
  public LaunchUseCases get() {
    return provideLaunchUseCases(ioDispatcherProvider.get(), launchCacheDataSourceProvider.get(), launchNetworkDataSourceProvider.get());
  }

  public static LaunchUseCaseModule_ProvideLaunchUseCasesFactory create(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<LaunchCacheDataSource> launchCacheDataSourceProvider,
      Provider<LaunchNetworkDataSource> launchNetworkDataSourceProvider) {
    return new LaunchUseCaseModule_ProvideLaunchUseCasesFactory(ioDispatcherProvider, launchCacheDataSourceProvider, launchNetworkDataSourceProvider);
  }

  public static LaunchUseCases provideLaunchUseCases(CoroutineDispatcher ioDispatcher,
      LaunchCacheDataSource launchCacheDataSource,
      LaunchNetworkDataSource launchNetworkDataSource) {
    return Preconditions.checkNotNullFromProvides(LaunchUseCaseModule.INSTANCE.provideLaunchUseCases(ioDispatcher, launchCacheDataSource, launchNetworkDataSource));
  }
}
