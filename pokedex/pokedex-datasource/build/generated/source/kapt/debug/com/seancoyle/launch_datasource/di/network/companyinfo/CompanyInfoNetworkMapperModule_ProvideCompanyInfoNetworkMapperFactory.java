package com.seancoyle.launch_datasource.di.network.companyinfo;

import com.seancoyle.launch_datasource.network.numberformatter.NumberFormatter;
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper;
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
public final class CompanyInfoNetworkMapperModule_ProvideCompanyInfoNetworkMapperFactory implements Factory<CompanyInfoNetworkMapper> {
  private final Provider<NumberFormatter> numberFormatterProvider;

  public CompanyInfoNetworkMapperModule_ProvideCompanyInfoNetworkMapperFactory(
      Provider<NumberFormatter> numberFormatterProvider) {
    this.numberFormatterProvider = numberFormatterProvider;
  }

  @Override
  public CompanyInfoNetworkMapper get() {
    return provideCompanyInfoNetworkMapper(numberFormatterProvider.get());
  }

  public static CompanyInfoNetworkMapperModule_ProvideCompanyInfoNetworkMapperFactory create(
      Provider<NumberFormatter> numberFormatterProvider) {
    return new CompanyInfoNetworkMapperModule_ProvideCompanyInfoNetworkMapperFactory(numberFormatterProvider);
  }

  public static CompanyInfoNetworkMapper provideCompanyInfoNetworkMapper(
      NumberFormatter numberFormatter) {
    return Preconditions.checkNotNullFromProvides(CompanyInfoNetworkMapperModule.INSTANCE.provideCompanyInfoNetworkMapper(numberFormatter));
  }
}
