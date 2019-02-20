package org.basim.uhabits.activities.common.dialogs;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FilePickerDialogFactory_Factory implements Factory<FilePickerDialogFactory> {
  private final Provider<Context> contextProvider;

  public FilePickerDialogFactory_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public FilePickerDialogFactory get() {
    return new FilePickerDialogFactory(contextProvider);
  }

  public static Factory<FilePickerDialogFactory> create(Provider<Context> contextProvider) {
    return new FilePickerDialogFactory_Factory(contextProvider);
  }
}
