package org.basim.uhabits.tasks;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public class ImportDataTaskFactory {
  private final Provider<org.basim.uhabits.io.GenericImporter> importerProvider;
  @Inject
  public ImportDataTaskFactory(Provider<org.basim.uhabits.io.GenericImporter> importerProvider) {
    this.importerProvider = importerProvider;
  }
  public ImportDataTask create(java.io.File file, ImportDataTask.Listener listener) {
    return new ImportDataTask(importerProvider.get(), file, listener);
  }
}
