package org.basim.uhabits.activities.habits.list.model;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.preferences.Preferences;
import org.basim.uhabits.utils.MidnightTimer;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HabitCardListAdapter_Factory implements Factory<HabitCardListAdapter> {
  private final MembersInjector<HabitCardListAdapter> habitCardListAdapterMembersInjector;

  private final Provider<HabitCardListCache> cacheProvider;

  private final Provider<Preferences> preferencesProvider;

  private final Provider<MidnightTimer> midnightTimerProvider;

  public HabitCardListAdapter_Factory(
      MembersInjector<HabitCardListAdapter> habitCardListAdapterMembersInjector,
      Provider<HabitCardListCache> cacheProvider,
      Provider<Preferences> preferencesProvider,
      Provider<MidnightTimer> midnightTimerProvider) {
    assert habitCardListAdapterMembersInjector != null;
    this.habitCardListAdapterMembersInjector = habitCardListAdapterMembersInjector;
    assert cacheProvider != null;
    this.cacheProvider = cacheProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
    assert midnightTimerProvider != null;
    this.midnightTimerProvider = midnightTimerProvider;
  }

  @Override
  public HabitCardListAdapter get() {
    return MembersInjectors.injectMembers(
        habitCardListAdapterMembersInjector,
        new HabitCardListAdapter(
            cacheProvider.get(), preferencesProvider.get(), midnightTimerProvider.get()));
  }

  public static Factory<HabitCardListAdapter> create(
      MembersInjector<HabitCardListAdapter> habitCardListAdapterMembersInjector,
      Provider<HabitCardListCache> cacheProvider,
      Provider<Preferences> preferencesProvider,
      Provider<MidnightTimer> midnightTimerProvider) {
    return new HabitCardListAdapter_Factory(
        habitCardListAdapterMembersInjector,
        cacheProvider,
        preferencesProvider,
        midnightTimerProvider);
  }
}
