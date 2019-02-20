package org.basim.uhabits.io;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DirFinder_Factory implements Factory<DirFinder> {
  private final Provider<Context> contextProvider;

  public DirFinder_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public DirFinder get() {
    return new DirFinder(contextProvider.get());
  }

  public static Factory<DirFinder> create(Provider<Context> contextProvider) {
    return new DirFinder_Factory(contextProvider);
  }
}
