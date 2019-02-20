package org.basim.uhabits.activities;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseSystem_Factory implements Factory<BaseSystem> {
  private final Provider<Context> contextProvider;

  public BaseSystem_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public BaseSystem get() {
    return new BaseSystem(contextProvider.get());
  }

  public static Factory<BaseSystem> create(Provider<Context> contextProvider) {
    return new BaseSystem_Factory(contextProvider);
  }
}
