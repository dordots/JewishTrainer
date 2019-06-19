package org.basim.uhabits.commands;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.models.ModelFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateHabitCommandFactory_Factory implements Factory<CreateHabitCommandFactory> {
  private final Provider<ModelFactory> modelFactoryProvider;

  public CreateHabitCommandFactory_Factory(Provider<ModelFactory> modelFactoryProvider) {
    assert modelFactoryProvider != null;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public CreateHabitCommandFactory get() {
    return new CreateHabitCommandFactory(modelFactoryProvider);
  }

  public static Factory<CreateHabitCommandFactory> create(
      Provider<ModelFactory> modelFactoryProvider) {
    return new CreateHabitCommandFactory_Factory(modelFactoryProvider);
  }
}
