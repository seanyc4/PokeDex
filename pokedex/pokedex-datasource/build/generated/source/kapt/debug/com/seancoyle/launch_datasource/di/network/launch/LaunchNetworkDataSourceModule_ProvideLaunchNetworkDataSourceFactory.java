package com.seancoyle.launch_datasource.di.network.launch;

import com.seancoyle.launch_datasource.di.network.PokemonNetworkDataSourceModule;
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource;
import com.seancoyle.launch_datasource.network.api.PokemonApi;
import com.seancoyle.launch_datasource.network.PokemonNetworkMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LaunchNetworkDataSourceModule_ProvideLaunchNetworkDataSourceFactory implements Factory<PokemonNetworkDataSource> {
  private final Provider<PokemonApi> apiProvider;

  private final Provider<PokemonNetworkMapper> networkMapperProvider;

  public LaunchNetworkDataSourceModule_ProvideLaunchNetworkDataSourceFactory(
          Provider<PokemonApi> apiProvider, Provider<PokemonNetworkMapper> networkMapperProvider) {
    this.apiProvider = apiProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public PokemonNetworkDataSource get() {
    return provideLaunchNetworkDataSource(apiProvider.get(), networkMapperProvider.get());
  }

  public static LaunchNetworkDataSourceModule_ProvideLaunchNetworkDataSourceFactory create(
          Provider<PokemonApi> apiProvider, Provider<PokemonNetworkMapper> networkMapperProvider) {
    return new LaunchNetworkDataSourceModule_ProvideLaunchNetworkDataSourceFactory(apiProvider, networkMapperProvider);
  }

  public static PokemonNetworkDataSource provideLaunchNetworkDataSource(PokemonApi api,
                                                                        PokemonNetworkMapper networkMapper) {
    return Preconditions.checkNotNullFromProvides(PokemonNetworkDataSourceModule.INSTANCE.providePokemonNetworkDataSource(api, networkMapper));
  }
}
