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
public final class TickmateDBImporter_Factory implements Factory<TickmateDBImporter> {
  private final MembersInjector<TickmateDBImporter> tickmateDBImporterMembersInjector;

  private final Provider<HabitList> habitsProvider;

  private final Provider<ModelFactory> modelFactoryProvider;

  public TickmateDBImporter_Factory(
      MembersInjector<TickmateDBImporter> tickmateDBImporterMembersInjector,
      Provider<HabitList> habitsProvider,
      Provider<ModelFactory> modelFactoryProvider) {
    assert tickmateDBImporterMembersInjector != null;
    this.tickmateDBImporterMembersInjector = tickmateDBImporterMembersInjector;
    assert habitsProvider != null;
    this.habitsProvider = habitsProvider;
    assert modelFactoryProvider != null;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public TickmateDBImporter get() {
    return MembersInjectors.injectMembers(
        tickmateDBImporterMembersInjector,
        new TickmateDBImporter(habitsProvider.get(), modelFactoryProvider.get()));
  }

  public static Factory<TickmateDBImporter> create(
      MembersInjector<TickmateDBImporter> tickmateDBImporterMembersInjector,
      Provider<HabitList> habitsProvider,
      Provider<ModelFactory> modelFactoryProvider) {
    return new TickmateDBImporter_Factory(
        tickmateDBImporterMembersInjector, habitsProvider, modelFactoryProvider);
  }
}
