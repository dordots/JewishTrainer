package org.basim.uhabits.preferences;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WidgetPreferences_Factory implements Factory<WidgetPreferences> {
  private final Provider<Context> contextProvider;

  public WidgetPreferences_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public WidgetPreferences get() {
    return new WidgetPreferences(contextProvider.get());
  }

  public static Factory<WidgetPreferences> create(Provider<Context> contextProvider) {
    return new WidgetPreferences_Factory(contextProvider);
  }
}
