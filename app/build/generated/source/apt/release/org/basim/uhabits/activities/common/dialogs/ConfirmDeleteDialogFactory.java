package org.basim.uhabits.activities.common.dialogs;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public class ConfirmDeleteDialogFactory {
  private final Provider<android.content.Context> contextProvider;
  @Inject
  public ConfirmDeleteDialogFactory(@org.basim.uhabits.activities.ActivityContext Provider<android.content.Context> contextProvider) {
    this.contextProvider = contextProvider;
  }
  public ConfirmDeleteDialog create(ConfirmDeleteDialog.Callback callback) {
    return new ConfirmDeleteDialog(contextProvider.get(), callback);
  }
}
