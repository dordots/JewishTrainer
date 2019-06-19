package org.basim.uhabits.io;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.models.HabitList;
import org.basim.uhabits.models.ModelFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HabitBullCSVImporter_Factory implements Factory<HabitBullCSVImporter> {
  private final MembersInjector<HabitBullCSVImporter> habitBullCSVImporterMembersInjector;

  private final Provider<HabitList> habitsProvider;

  private final Provider<ModelFactory> modelFactoryProvider;

  public HabitBullCSVImporter_Factory(
      MembersInjector<HabitBullCSVImporter> habitBullCSVImporterMembersInjector,
      Provider<HabitList> habitsProvider,
      Provider<ModelFactory> modelFactoryProvider) {
    assert habitBullCSVImporterMembersInjector != null;
    this.habitBullCSVImporterMembersInjector = habitBullCSVImporterMembersInjector;
    assert habitsProvider != null;
    this.habitsProvider = habitsProvider;
    assert modelFactoryProvider != null;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public HabitBullCSVImporter get() {
    return MembersInjectors.injectMembers(
        habitBullCSVImporterMembersInjector,
        new HabitBullCSVImporter(habitsProvider.get(), modelFactoryProvider.get()));
  }

  public static Factory<HabitBullCSVImporter> create(
      MembersInjector<HabitBullCSVImporter> habitBullCSVImporterMembersInjector,
      Provider<HabitList> habitsProvider,
      Provider<ModelFactory> modelFactoryProvider) {
    return new HabitBullCSVImporter_Factory(
        habitBullCSVImporterMembersInjector, habitsProvider, modelFactoryProvider);
  }
}
