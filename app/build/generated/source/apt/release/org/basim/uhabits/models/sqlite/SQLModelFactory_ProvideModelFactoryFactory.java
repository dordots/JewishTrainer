package org.basim.uhabits.models.sqlite;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.basim.uhabits.models.ModelFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum SQLModelFactory_ProvideModelFactoryFactory implements Factory<ModelFactory> {
  INSTANCE;

  @Override
  public ModelFactory get() {
    return Preconditions.checkNotNull(
        SQLModelFactory.provideModelFactory(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ModelFactory> create() {
    return INSTANCE;
  }
}
