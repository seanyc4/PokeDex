package com.seancoyle.launch_datasource.network.mappers.launch;

import com.seancoyle.launch_datasource.network.abstraction.dateformatter.DateFormatter;
import com.seancoyle.launch_datasource.network.abstraction.datetransformer.DateTransformer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class LaunchNetworkMapper_Factory implements Factory<LaunchNetworkMapper> {
  private final Provider<DateFormatter> dateFormatterProvider;

  private final Provider<DateTransformer> dateTransformerProvider;

  public LaunchNetworkMapper_Factory(Provider<DateFormatter> dateFormatterProvider,
      Provider<DateTransformer> dateTransformerProvider) {
    this.dateFormatterProvider = dateFormatterProvider;
    this.dateTransformerProvider = dateTransformerProvider;
  }

  @Override
  public LaunchNetworkMapper get() {
    return newInstance(dateFormatterProvider.get(), dateTransformerProvider.get());
  }

  public static LaunchNetworkMapper_Factory create(Provider<DateFormatter> dateFormatterProvider,
      Provider<DateTransformer> dateTransformerProvider) {
    return new LaunchNetworkMapper_Factory(dateFormatterProvider, dateTransformerProvider);
  }

  public static LaunchNetworkMapper newInstance(DateFormatter dateFormatter,
      DateTransformer dateTransformer) {
    return new LaunchNetworkMapper(dateFormatter, dateTransformer);
  }
}
