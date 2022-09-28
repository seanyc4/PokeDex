package com.seancoyle.launch_datasource.di.cache.launch;

import com.seancoyle.database.daos.PokemonDao;
import com.seancoyle.launch_datasource.cache.PokemonCacheDataSource;
import com.seancoyle.launch_datasource.cache.PokemonEntityMapper;
import com.seancoyle.launch_datasource.di.cache.PokemonCacheDataSourceModule;

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
public final class LaunchCacheDataSourceModule_ProvideLaunchCacheDataSourceFactory implements Factory<PokemonCacheDataSource> {
  private final Provider<PokemonDao> daoProvider;

  private final Provider<PokemonEntityMapper> launchEntityMapperProvider;

  public LaunchCacheDataSourceModule_ProvideLaunchCacheDataSourceFactory(
          Provider<PokemonDao> daoProvider, Provider<PokemonEntityMapper> launchEntityMapperProvider) {
    this.daoProvider = daoProvider;
    this.launchEntityMapperProvider = launchEntityMapperProvider;
  }

  @Override
  public PokemonCacheDataSource get() {
    return provideLaunchCacheDataSource(daoProvider.get(), launchEntityMapperProvider.get());
  }

  public static LaunchCacheDataSourceModule_ProvideLaunchCacheDataSourceFactory create(
          Provider<PokemonDao> daoProvider, Provider<PokemonEntityMapper> launchEntityMapperProvider) {
    return new LaunchCacheDataSourceModule_ProvideLaunchCacheDataSourceFactory(daoProvider, launchEntityMapperProvider);
  }

  public static PokemonCacheDataSource provideLaunchCacheDataSource(PokemonDao dao,
                                                                    PokemonEntityMapper pokemonEntityMapper) {
    return Preconditions.checkNotNullFromProvides(PokemonCacheDataSourceModule.INSTANCE.providePokemonCacheDataSource(dao, pokemonEntityMapper));
  }
}
