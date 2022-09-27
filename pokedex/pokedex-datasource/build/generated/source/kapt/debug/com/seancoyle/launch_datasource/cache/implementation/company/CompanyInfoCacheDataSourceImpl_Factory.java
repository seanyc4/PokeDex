package com.seancoyle.launch_datasource.cache.implementation.company;

import com.seancoyle.database.daos.CompanyInfoDao;
import com.seancoyle.launch_datasource.cache.mappers.company.CompanyInfoEntityMapper;
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
public final class CompanyInfoCacheDataSourceImpl_Factory implements Factory<CompanyInfoCacheDataSourceImpl> {
  private final Provider<CompanyInfoDao> daoProvider;

  private final Provider<CompanyInfoEntityMapper> entityMapperProvider;

  public CompanyInfoCacheDataSourceImpl_Factory(Provider<CompanyInfoDao> daoProvider,
      Provider<CompanyInfoEntityMapper> entityMapperProvider) {
    this.daoProvider = daoProvider;
    this.entityMapperProvider = entityMapperProvider;
  }

  @Override
  public CompanyInfoCacheDataSourceImpl get() {
    return newInstance(daoProvider.get(), entityMapperProvider.get());
  }

  public static CompanyInfoCacheDataSourceImpl_Factory create(Provider<CompanyInfoDao> daoProvider,
      Provider<CompanyInfoEntityMapper> entityMapperProvider) {
    return new CompanyInfoCacheDataSourceImpl_Factory(daoProvider, entityMapperProvider);
  }

  public static CompanyInfoCacheDataSourceImpl newInstance(CompanyInfoDao dao,
      CompanyInfoEntityMapper entityMapper) {
    return new CompanyInfoCacheDataSourceImpl(dao, entityMapper);
  }
}
