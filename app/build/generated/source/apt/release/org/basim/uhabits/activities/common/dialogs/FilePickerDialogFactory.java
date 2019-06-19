package org.basim.uhabits.activities.common.dialogs;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public class FilePickerDialogFactory {
  private final Provider<android.content.Context> contextProvider;
  @Inject
  public FilePickerDialogFactory(@org.basim.uhabits.activities.ActivityContext Provider<android.content.Context> contextProvider) {
    this.contextProvider = contextProvider;
  }
  public FilePickerDialog create(java.io.File initialDirectory) {
    return new FilePickerDialog(contextProvider.get(), initialDirectory);
  }
}
