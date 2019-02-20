package org.basim.uhabits.tasks;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExportDBTaskFactory_Factory implements Factory<ExportDBTaskFactory> {
  private final Provider<Context> contextProvider;

  public ExportDBTaskFactory_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public ExportDBTaskFactory get() {
    return new ExportDBTaskFactory(contextProvider);
  }

  public static Factory<ExportDBTaskFactory> create(Provider<Context> contextProvider) {
    return new ExportDBTaskFactory_Factory(contextProvider);
  }
}
