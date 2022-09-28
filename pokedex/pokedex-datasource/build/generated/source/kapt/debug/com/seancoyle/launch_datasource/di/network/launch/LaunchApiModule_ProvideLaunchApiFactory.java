package com.seancoyle.launch_datasource.di.network.launch;

import com.seancoyle.launch_datasource.di.network.PokemonApiModule;
import com.seancoyle.launch_datasource.network.api.PokemonApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class LaunchApiModule_ProvideLaunchApiFactory implements Factory<PokemonApi> {
  private final Provider<Retrofit> retrofitProvider;

  public LaunchApiModule_ProvideLaunchApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PokemonApi get() {
    return provideLaunchApi(retrofitProvider.get());
  }

  public static LaunchApiModule_ProvideLaunchApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new LaunchApiModule_ProvideLaunchApiFactory(retrofitProvider);
  }

  public static PokemonApi provideLaunchApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(PokemonApiModule.INSTANCE.providePokemonApi(retrofit));
  }
}
