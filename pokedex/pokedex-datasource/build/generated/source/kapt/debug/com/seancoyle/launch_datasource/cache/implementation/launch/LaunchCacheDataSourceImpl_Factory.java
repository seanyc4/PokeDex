package com.seancoyle.launch_datasource.cache.implementation.launch;

import com.seancoyle.database.daos.PokemonDao;
import com.seancoyle.launch_datasource.cache.PokemonCacheDataSourceImpl;
import com.seancoyle.launch_datasource.cache.PokemonEntityMapper;
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
public final class LaunchCacheDataSourceImpl_Factory implements Factory<PokemonCacheDataSourceImpl> {
  private final Provider<PokemonDao> daoProvider;

  private final Provider<PokemonEntityMapper> entityMapperProvider;

  public LaunchCacheDataSourceImpl_Factory(Provider<PokemonDao> daoProvider,
      Provider<PokemonEntityMapper> entityMapperProvider) {
    this.daoProvider = daoProvider;
    this.entityMapperProvider = entityMapperProvider;
  }

  @Override
  public PokemonCacheDataSourceImpl get() {
    return newInstance(daoProvider.get(), entityMapperProvider.get());
  }

  public static LaunchCacheDataSourceImpl_Factory create(Provider<PokemonDao> daoProvider,
      Provider<PokemonEntityMapper> entityMapperProvider) {
    return new LaunchCacheDataSourceImpl_Factory(daoProvider, entityMapperProvider);
  }

  public static PokemonCacheDataSourceImpl newInstance(PokemonDao dao,
                                                       PokemonEntityMapper entityMapper) {
    return new PokemonCacheDataSourceImpl(dao, entityMapper);
  }
}
