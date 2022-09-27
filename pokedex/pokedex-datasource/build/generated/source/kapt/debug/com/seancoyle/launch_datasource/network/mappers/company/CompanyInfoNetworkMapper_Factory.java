package com.seancoyle.launch_datasource.network.mappers.company;

import com.seancoyle.launch_datasource.network.abstraction.numberformatter.NumberFormatter;
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
public final class CompanyInfoNetworkMapper_Factory implements Factory<CompanyInfoNetworkMapper> {
  private final Provider<NumberFormatter> numberFormatterProvider;

  public CompanyInfoNetworkMapper_Factory(Provider<NumberFormatter> numberFormatterProvider) {
    this.numberFormatterProvider = numberFormatterProvider;
  }

  @Override
  public CompanyInfoNetworkMapper get() {
    return newInstance(numberFormatterProvider.get());
  }

  public static CompanyInfoNetworkMapper_Factory create(
      Provider<NumberFormatter> numberFormatterProvider) {
    return new CompanyInfoNetworkMapper_Factory(numberFormatterProvider);
  }

  public static CompanyInfoNetworkMapper newInstance(NumberFormatter numberFormatter) {
    return new CompanyInfoNetworkMapper(numberFormatter);
  }
}
