package com.seancoyle.launch_datasource.di.network.companyinfo;

import com.seancoyle.launch_datasource.network.api.company.CompanyInfoApi;
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
public final class CompanyInfoApiModule_ProvideCompanyInfoApiFactory implements Factory<CompanyInfoApi> {
  private final Provider<Retrofit> retrofitProvider;

  public CompanyInfoApiModule_ProvideCompanyInfoApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CompanyInfoApi get() {
    return provideCompanyInfoApi(retrofitProvider.get());
  }

  public static CompanyInfoApiModule_ProvideCompanyInfoApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new CompanyInfoApiModule_ProvideCompanyInfoApiFactory(retrofitProvider);
  }

  public static CompanyInfoApi provideCompanyInfoApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(CompanyInfoApiModule.INSTANCE.provideCompanyInfoApi(retrofit));
  }
}
