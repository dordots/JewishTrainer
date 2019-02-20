package org.basim.uhabits.tasks;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public class ExportDBTaskFactory {
  private final Provider<android.content.Context> contextProvider;
  @Inject
  public ExportDBTaskFactory(@org.basim.uhabits.AppContext Provider<android.content.Context> contextProvider) {
    this.contextProvider = contextProvider;
  }
  public ExportDBTask create(ExportDBTask.Listener listener) {
    return new ExportDBTask(contextProvider.get(), listener);
  }
}
