package com.seancoyle.launch_datasource.di.cache.launch;

import com.seancoyle.launch_datasource.cache.PokemonEntityMapper;
import com.seancoyle.launch_datasource.di.cache.PokemonCacheMapperModule;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class LaunchCacheMapperModule_ProvideLaunchCacheMapperFactory implements Factory<PokemonEntityMapper> {
  @Override
  public PokemonEntityMapper get() {
    return provideLaunchCacheMapper();
  }

  public static LaunchCacheMapperModule_ProvideLaunchCacheMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PokemonEntityMapper provideLaunchCacheMapper() {
    return Preconditions.checkNotNullFromProvides(PokemonCacheMapperModule.INSTANCE.providePokemonCacheMapper());
  }

  private static final class InstanceHolder {
    private static final LaunchCacheMapperModule_ProvideLaunchCacheMapperFactory INSTANCE = new LaunchCacheMapperModule_ProvideLaunchCacheMapperFactory();
  }
}
