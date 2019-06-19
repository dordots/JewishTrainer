package org.basim.uhabits.activities.common.dialogs;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ColorPickerDialogFactory_Factory implements Factory<ColorPickerDialogFactory> {
  private final Provider<Context> contextProvider;

  public ColorPickerDialogFactory_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public ColorPickerDialogFactory get() {
    return new ColorPickerDialogFactory(contextProvider.get());
  }

  public static Factory<ColorPickerDialogFactory> create(Provider<Context> contextProvider) {
    return new ColorPickerDialogFactory_Factory(contextProvider);
  }
}
