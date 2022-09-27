package com.seancoyle.launch_usecases.di;

import com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource;
import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource;
import com.seancoyle.launch_models.model.company.CompanyInfoFactory;
import com.seancoyle.launch_usecases.company.CompanyInfoUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
@QualifierMetadata("com.seancoyle.core.di.IODispatcher")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CompanyInfoUseCaseModule_ProvideCompanyInfoUseCasesFactory implements Factory<CompanyInfoUseCases> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<CompanyInfoCacheDataSource> companyInfoDataSourceProvider;

  private final Provider<CompanyInfoNetworkDataSource> companyInfoNetworkDataSourceProvider;

  private final Provider<CompanyInfoFactory> companyInfoFactoryProvider;

  public CompanyInfoUseCaseModule_ProvideCompanyInfoUseCasesFactory(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CompanyInfoCacheDataSource> companyInfoDataSourceProvider,
      Provider<CompanyInfoNetworkDataSource> companyInfoNetworkDataSourceProvider,
      Provider<CompanyInfoFactory> companyInfoFactoryProvider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.companyInfoDataSourceProvider = companyInfoDataSourceProvider;
    this.companyInfoNetworkDataSourceProvider = companyInfoNetworkDataSourceProvider;
    this.companyInfoFactoryProvider = companyInfoFactoryProvider;
  }

  @Override
  public CompanyInfoUseCases get() {
    return provideCompanyInfoUseCases(ioDispatcherProvider.get(), companyInfoDataSourceProvider.get(), companyInfoNetworkDataSourceProvider.get(), companyInfoFactoryProvider.get());
  }

  public static CompanyInfoUseCaseModule_ProvideCompanyInfoUseCasesFactory create(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CompanyInfoCacheDataSource> companyInfoDataSourceProvider,
      Provider<CompanyInfoNetworkDataSource> companyInfoNetworkDataSourceProvider,
      Provider<CompanyInfoFactory> companyInfoFactoryProvider) {
    return new CompanyInfoUseCaseModule_ProvideCompanyInfoUseCasesFactory(ioDispatcherProvider, companyInfoDataSourceProvider, companyInfoNetworkDataSourceProvider, companyInfoFactoryProvider);
  }

  public static CompanyInfoUseCases provideCompanyInfoUseCases(CoroutineDispatcher ioDispatcher,
      CompanyInfoCacheDataSource companyInfoDataSource,
      CompanyInfoNetworkDataSource companyInfoNetworkDataSource,
      CompanyInfoFactory companyInfoFactory) {
    return Preconditions.checkNotNullFromProvides(CompanyInfoUseCaseModule.INSTANCE.provideCompanyInfoUseCases(ioDispatcher, companyInfoDataSource, companyInfoNetworkDataSource, companyInfoFactory));
  }
}
