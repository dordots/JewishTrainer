package org.basim.uhabits.commands;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.models.ModelFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EditHabitCommandFactory_Factory implements Factory<EditHabitCommandFactory> {
  private final Provider<ModelFactory> modelFactoryProvider;

  public EditHabitCommandFactory_Factory(Provider<ModelFactory> modelFactoryProvider) {
    assert modelFactoryProvider != null;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public EditHabitCommandFactory get() {
    return new EditHabitCommandFactory(modelFactoryProvider);
  }

  public static Factory<EditHabitCommandFactory> create(
      Provider<ModelFactory> modelFactoryProvider) {
    return new EditHabitCommandFactory_Factory(modelFactoryProvider);
  }
}
