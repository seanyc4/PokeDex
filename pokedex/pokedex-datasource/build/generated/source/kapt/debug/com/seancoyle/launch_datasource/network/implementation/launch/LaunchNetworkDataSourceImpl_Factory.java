package com.seancoyle.launch_datasource.network.implementation.launch;

import com.seancoyle.launch_datasource.network.PokemonNetworkDataSourceImpl;
import com.seancoyle.launch_datasource.network.api.PokemonApi;
import com.seancoyle.launch_datasource.network.PokemonNetworkMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class LaunchNetworkDataSourceImpl_Factory implements Factory<PokemonNetworkDataSourceImpl> {
  private final Provider<PokemonApi> apiProvider;

  private final Provider<PokemonNetworkMapper> networkMapperProvider;

  public LaunchNetworkDataSourceImpl_Factory(Provider<PokemonApi> apiProvider,
      Provider<PokemonNetworkMapper> networkMapperProvider) {
    this.apiProvider = apiProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public PokemonNetworkDataSourceImpl get() {
    return newInstance(apiProvider.get(), networkMapperProvider.get());
  }

  public static LaunchNetworkDataSourceImpl_Factory create(Provider<PokemonApi> apiProvider,
      Provider<PokemonNetworkMapper> networkMapperProvider) {
    return new LaunchNetworkDataSourceImpl_Factory(apiProvider, networkMapperProvider);
  }

  public static PokemonNetworkDataSourceImpl newInstance(PokemonApi api,
                                                         PokemonNetworkMapper networkMapper) {
    return new PokemonNetworkDataSourceImpl(api, networkMapper);
  }
}
