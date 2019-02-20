package org.basim.uhabits.io;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.models.HabitList;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GenericImporter_Factory implements Factory<GenericImporter> {
  private final MembersInjector<GenericImporter> genericImporterMembersInjector;

  private final Provider<HabitList> habitsProvider;

  private final Provider<LoopDBImporter> loopDBImporterProvider;

  private final Provider<RewireDBImporter> rewireDBImporterProvider;

  private final Provider<TickmateDBImporter> tickmateDBImporterProvider;

  private final Provider<HabitBullCSVImporter> habitBullCSVImporterProvider;

  public GenericImporter_Factory(
      MembersInjector<GenericImporter> genericImporterMembersInjector,
      Provider<HabitList> habitsProvider,
      Provider<LoopDBImporter> loopDBImporterProvider,
      Provider<RewireDBImporter> rewireDBImporterProvider,
      Provider<TickmateDBImporter> tickmateDBImporterProvider,
      Provider<HabitBullCSVImporter> habitBullCSVImporterProvider) {
    assert genericImporterMembersInjector != null;
    this.genericImporterMembersInjector = genericImporterMembersInjector;
    assert habitsProvider != null;
    this.habitsProvider = habitsProvider;
    assert loopDBImporterProvider != null;
    this.loopDBImporterProvider = loopDBImporterProvider;
    assert rewireDBImporterProvider != null;
    this.rewireDBImporterProvider = rewireDBImporterProvider;
    assert tickmateDBImporterProvider != null;
    this.tickmateDBImporterProvider = tickmateDBImporterProvider;
    assert habitBullCSVImporterProvider != null;
    this.habitBullCSVImporterProvider = habitBullCSVImporterProvider;
  }

  @Override
  public GenericImporter get() {
    return MembersInjectors.injectMembers(
        genericImporterMembersInjector,
        new GenericImporter(
            habitsProvider.get(),
            loopDBImporterProvider.get(),
            rewireDBImporterProvider.get(),
            tickmateDBImporterProvider.get(),
            habitBullCSVImporterProvider.get()));
  }

  public static Factory<GenericImporter> create(
      MembersInjector<GenericImporter> genericImporterMembersInjector,
      Provider<HabitList> habitsProvider,
      Provider<LoopDBImporter> loopDBImporterProvider,
      Provider<RewireDBImporter> rewireDBImporterProvider,
      Provider<TickmateDBImporter> tickmateDBImporterProvider,
      Provider<HabitBullCSVImporter> habitBullCSVImporterProvider) {
    return new GenericImporter_Factory(
        genericImporterMembersInjector,
        habitsProvider,
        loopDBImporterProvider,
        rewireDBImporterProvider,
        tickmateDBImporterProvider,
        habitBullCSVImporterProvider);
  }
}
