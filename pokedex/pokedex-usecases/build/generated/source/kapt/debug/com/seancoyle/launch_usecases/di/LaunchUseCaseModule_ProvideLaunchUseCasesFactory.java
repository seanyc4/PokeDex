package com.seancoyle.launch_usecases.di;

import com.seancoyle.launch_datasource.cache.PokemonCacheDataSource;
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource;
import com.seancoyle.launch_usecases.launch.PokemonUseCases;
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
public final class LaunchUseCaseModule_ProvideLaunchUseCasesFactory implements Factory<PokemonUseCases> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<PokemonCacheDataSource> launchCacheDataSourceProvider;

  private final Provider<PokemonNetworkDataSource> launchNetworkDataSourceProvider;

  public LaunchUseCaseModule_ProvideLaunchUseCasesFactory(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<PokemonCacheDataSource> launchCacheDataSourceProvider,
      Provider<PokemonNetworkDataSource> launchNetworkDataSourceProvider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.launchCacheDataSourceProvider = launchCacheDataSourceProvider;
    this.launchNetworkDataSourceProvider = launchNetworkDataSourceProvider;
  }

  @Override
  public PokemonUseCases get() {
    return provideLaunchUseCases(ioDispatcherProvider.get(), launchCacheDataSourceProvider.get(), launchNetworkDataSourceProvider.get());
  }

  public static LaunchUseCaseModule_ProvideLaunchUseCasesFactory create(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<PokemonCacheDataSource> launchCacheDataSourceProvider,
      Provider<PokemonNetworkDataSource> launchNetworkDataSourceProvider) {
    return new LaunchUseCaseModule_ProvideLaunchUseCasesFactory(ioDispatcherProvider, launchCacheDataSourceProvider, launchNetworkDataSourceProvider);
  }

  public static PokemonUseCases provideLaunchUseCases(CoroutineDispatcher ioDispatcher,
                                                      PokemonCacheDataSource pokemonCacheDataSource,
                                                      PokemonNetworkDataSource pokemonNetworkDataSource) {
    return Preconditions.checkNotNullFromProvides(LaunchUseCaseModule.INSTANCE.provideLaunchUseCases(ioDispatcher, pokemonCacheDataSource, pokemonNetworkDataSource));
  }
}
