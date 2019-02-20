package org.basim.uhabits.tasks;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.io.GenericImporter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ImportDataTaskFactory_Factory implements Factory<ImportDataTaskFactory> {
  private final Provider<GenericImporter> importerProvider;

  public ImportDataTaskFactory_Factory(Provider<GenericImporter> importerProvider) {
    assert importerProvider != null;
    this.importerProvider = importerProvider;
  }

  @Override
  public ImportDataTaskFactory get() {
    return new ImportDataTaskFactory(importerProvider);
  }

  public static Factory<ImportDataTaskFactory> create(Provider<GenericImporter> importerProvider) {
    return new ImportDataTaskFactory_Factory(importerProvider);
  }
}
