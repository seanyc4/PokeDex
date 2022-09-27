package com.seancoyle.launch_datasource.di.cache.companyinfo;

import com.seancoyle.database.daos.CompanyInfoDao;
import com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource;
import com.seancoyle.launch_datasource.cache.mappers.company.CompanyInfoEntityMapper;
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
public final class CompanyInfoCacheDataSourceModule_ProvideCompanyInfoCacheDataSourceFactory implements Factory<CompanyInfoCacheDataSource> {
  private final Provider<CompanyInfoDao> daoProvider;

  private final Provider<CompanyInfoEntityMapper> companyInfoEntityMapperProvider;

  public CompanyInfoCacheDataSourceModule_ProvideCompanyInfoCacheDataSourceFactory(
      Provider<CompanyInfoDao> daoProvider,
      Provider<CompanyInfoEntityMapper> companyInfoEntityMapperProvider) {
    this.daoProvider = daoProvider;
    this.companyInfoEntityMapperProvider = companyInfoEntityMapperProvider;
  }

  @Override
  public CompanyInfoCacheDataSource get() {
    return provideCompanyInfoCacheDataSource(daoProvider.get(), companyInfoEntityMapperProvider.get());
  }

  public static CompanyInfoCacheDataSourceModule_ProvideCompanyInfoCacheDataSourceFactory create(
      Provider<CompanyInfoDao> daoProvider,
      Provider<CompanyInfoEntityMapper> companyInfoEntityMapperProvider) {
    return new CompanyInfoCacheDataSourceModule_ProvideCompanyInfoCacheDataSourceFactory(daoProvider, companyInfoEntityMapperProvider);
  }

  public static CompanyInfoCacheDataSource provideCompanyInfoCacheDataSource(CompanyInfoDao dao,
      CompanyInfoEntityMapper companyInfoEntityMapper) {
    return Preconditions.checkNotNullFromProvides(CompanyInfoCacheDataSourceModule.INSTANCE.provideCompanyInfoCacheDataSource(dao, companyInfoEntityMapper));
  }
}
