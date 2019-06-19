package org.basim.uhabits.commands;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public final class CreateHabitCommandFactory {
  private final Provider<org.basim.uhabits.models.ModelFactory> modelFactoryProvider;
  @Inject
  public CreateHabitCommandFactory(Provider<org.basim.uhabits.models.ModelFactory> modelFactoryProvider) {
    this.modelFactoryProvider = modelFactoryProvider;
  }
  public CreateHabitCommand create(org.basim.uhabits.models.HabitList habitList, org.basim.uhabits.models.Habit model) {
    return new CreateHabitCommand(modelFactoryProvider.get(), habitList, model);
  }
}
