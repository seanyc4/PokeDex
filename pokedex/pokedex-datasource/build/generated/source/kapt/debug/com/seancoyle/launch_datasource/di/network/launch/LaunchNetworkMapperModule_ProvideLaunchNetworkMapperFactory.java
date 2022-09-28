package com.seancoyle.launch_datasource.di.network.launch;

import com.seancoyle.launch_datasource.di.network.PokemonNetworkMapperModule;
import com.seancoyle.launch_datasource.network.dateformatter.DateFormatter;
import com.seancoyle.launch_datasource.network.datetransformer.DateTransformer;
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
public final class LaunchNetworkMapperModule_ProvideLaunchNetworkMapperFactory implements Factory<PokemonNetworkMapper> {
  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<DateTransformer> dateTransformerProvider;

  public LaunchNetworkMapperModule_ProvideLaunchNetworkMapperFactory(
      Provider<DateFormatter> dateFormatterProvider,
      Provider<DateTransformer> dateTransformerProvider) {
    this.dateFormatterProvider = dateFormatterProvider;
    this.dateTransformerProvider = dateTransformerProvider;
  }

  @Override
  public PokemonNetworkMapper get() {
    return provideLaunchNetworkMapper(dateFormatterProvider.get(), dateTransformerProvider.get());
  }

  public static LaunchNetworkMapperModule_ProvideLaunchNetworkMapperFactory create(
      Provider<DateFormatter> dateFormatterProvider,
      Provider<DateTransformer> dateTransformerProvider) {
    return new LaunchNetworkMapperModule_ProvideLaunchNetworkMapperFactory(dateFormatterProvider, dateTransformerProvider);
  }

  public static PokemonNetworkMapper provideLaunchNetworkMapper(DateFormatter dateFormatter,
                                                                DateTransformer dateTransformer) {
    return Preconditions.checkNotNullFromProvides(PokemonNetworkMapperModule.INSTANCE.providePokemonNetworkMapper(dateFormatter, dateTransformer));
  }
}
