package org.basim.uhabits.preferences;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Preferences_Factory implements Factory<Preferences> {
  private final Provider<Context> contextProvider;

  public Preferences_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public Preferences get() {
    return new Preferences(contextProvider.get());
  }

  public static Factory<Preferences> create(Provider<Context> contextProvider) {
    return new Preferences_Factory(contextProvider);
  }
}
