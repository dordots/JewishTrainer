package org.basim.uhabits.activities.common.dialogs;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConfirmDeleteDialogFactory_Factory
    implements Factory<ConfirmDeleteDialogFactory> {
  private final Provider<Context> contextProvider;

  public ConfirmDeleteDialogFactory_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public ConfirmDeleteDialogFactory get() {
    return new ConfirmDeleteDialogFactory(contextProvider);
  }

  public static Factory<ConfirmDeleteDialogFactory> create(Provider<Context> contextProvider) {
    return new ConfirmDeleteDialogFactory_Factory(contextProvider);
  }
}
