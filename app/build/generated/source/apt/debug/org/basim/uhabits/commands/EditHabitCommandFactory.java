package org.basim.uhabits.commands;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public final class EditHabitCommandFactory {
  private final Provider<org.basim.uhabits.models.ModelFactory> modelFactoryProvider;
  @Inject
  public EditHabitCommandFactory(Provider<org.basim.uhabits.models.ModelFactory> modelFactoryProvider) {
    this.modelFactoryProvider = modelFactoryProvider;
  }
  public EditHabitCommand create(org.basim.uhabits.models.HabitList habitList, org.basim.uhabits.models.Habit original, org.basim.uhabits.models.Habit modified) {
    return new EditHabitCommand(modelFactoryProvider.get(), habitList, original, modified);
  }
}
