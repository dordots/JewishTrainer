package org.basim.uhabits.io;

import android.content.Context;
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
public final class LoopDBImporter_Factory implements Factory<LoopDBImporter> {
  private final MembersInjector<LoopDBImporter> loopDBImporterMembersInjector;

  private final Provider<Context> contextProvider;

  private final Provider<HabitList> habitsProvider;

  public LoopDBImporter_Factory(
      MembersInjector<LoopDBImporter> loopDBImporterMembersInjector,
      Provider<Context> contextProvider,
      Provider<HabitList> habitsProvider) {
    assert loopDBImporterMembersInjector != null;
    this.loopDBImporterMembersInjector = loopDBImporterMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert habitsProvider != null;
    this.habitsProvider = habitsProvider;
  }

  @Override
  public LoopDBImporter get() {
    return MembersInjectors.injectMembers(
        loopDBImporterMembersInjector,
        new LoopDBImporter(contextProvider.get(), habitsProvider.get()));
  }

  public static Factory<LoopDBImporter> create(
      MembersInjector<LoopDBImporter> loopDBImporterMembersInjector,
      Provider<Context> contextProvider,
      Provider<HabitList> habitsProvider) {
    return new LoopDBImporter_Factory(
        loopDBImporterMembersInjector, contextProvider, habitsProvider);
  }
}
