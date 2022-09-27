package com.seancoyle.launch_datasource.di.cache.companyinfo;

import com.seancoyle.launch_datasource.cache.mappers.company.CompanyInfoEntityMapper;
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
public final class CompanyInfoCacheMapperModule_ProvideCompanyInfoCacheMapperFactory implements Factory<CompanyInfoEntityMapper> {
  @Override
  public CompanyInfoEntityMapper get() {
    return provideCompanyInfoCacheMapper();
  }

  public static CompanyInfoCacheMapperModule_ProvideCompanyInfoCacheMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CompanyInfoEntityMapper provideCompanyInfoCacheMapper() {
    return Preconditions.checkNotNullFromProvides(CompanyInfoCacheMapperModule.INSTANCE.provideCompanyInfoCacheMapper());
  }

  private static final class InstanceHolder {
    private static final CompanyInfoCacheMapperModule_ProvideCompanyInfoCacheMapperFactory INSTANCE = new CompanyInfoCacheMapperModule_ProvideCompanyInfoCacheMapperFactory();
  }
}
