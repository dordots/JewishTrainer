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
public final class RewireDBImporter_Factory implements Factory<RewireDBImporter> {
  private final MembersInjector<RewireDBImporter> rewireDBImporterMembersInjector;

  private final Provider<HabitList> habitsProvider;

  private final Provider<ModelFactory> modelFactoryProvider;

  public RewireDBImporter_Factory(
      MembersInjector<RewireDBImporter> rewireDBImporterMembersInjector,
      Provider<HabitList> habitsProvider,
      Provider<ModelFactory> modelFactoryProvider) {
    assert rewireDBImporterMembersInjector != null;
    this.rewireDBImporterMembersInjector = rewireDBImporterMembersInjector;
    assert habitsProvider != null;
    this.habitsProvider = habitsProvider;
    assert modelFactoryProvider != null;
    this.modelFactoryProvider = modelFactoryProvider;
  }

  @Override
  public RewireDBImporter get() {
    return MembersInjectors.injectMembers(
        rewireDBImporterMembersInjector,
        new RewireDBImporter(habitsProvider.get(), modelFactoryProvider.get()));
  }

  public static Factory<RewireDBImporter> create(
      MembersInjector<RewireDBImporter> rewireDBImporterMembersInjector,
      Provider<HabitList> habitsProvider,
      Provider<ModelFactory> modelFactoryProvider) {
    return new RewireDBImporter_Factory(
        rewireDBImporterMembersInjector, habitsProvider, modelFactoryProvider);
  }
}
