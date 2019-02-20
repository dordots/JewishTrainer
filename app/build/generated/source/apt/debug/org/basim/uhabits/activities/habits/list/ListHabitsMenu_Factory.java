package org.basim.uhabits.activities.habits.list;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.activities.BaseActivity;
import org.basim.uhabits.activities.ThemeSwitcher;
import org.basim.uhabits.activities.habits.list.model.HabitCardListAdapter;
import org.basim.uhabits.preferences.Preferences;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListHabitsMenu_Factory implements Factory<ListHabitsMenu> {
  private final MembersInjector<ListHabitsMenu> listHabitsMenuMembersInjector;

  private final Provider<BaseActivity> activityProvider;

  private final Provider<ListHabitsScreen> screenProvider;

  private final Provider<HabitCardListAdapter> adapterProvider;

  private final Provider<Preferences> preferencesProvider;

  private final Provider<ThemeSwitcher> themeSwitcherProvider;

  public ListHabitsMenu_Factory(
      MembersInjector<ListHabitsMenu> listHabitsMenuMembersInjector,
      Provider<BaseActivity> activityProvider,
      Provider<ListHabitsScreen> screenProvider,
      Provider<HabitCardListAdapter> adapterProvider,
      Provider<Preferences> preferencesProvider,
      Provider<ThemeSwitcher> themeSwitcherProvider) {
    assert listHabitsMenuMembersInjector != null;
    this.listHabitsMenuMembersInjector = listHabitsMenuMembersInjector;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
    assert screenProvider != null;
    this.screenProvider = screenProvider;
    assert adapterProvider != null;
    this.adapterProvider = adapterProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
    assert themeSwitcherProvider != null;
    this.themeSwitcherProvider = themeSwitcherProvider;
  }

  @Override
  public ListHabitsMenu get() {
    return MembersInjectors.injectMembers(
        listHabitsMenuMembersInjector,
        new ListHabitsMenu(
            activityProvider.get(),
            screenProvider.get(),
            adapterProvider.get(),
            preferencesProvider.get(),
            themeSwitcherProvider.get()));
  }

  public static Factory<ListHabitsMenu> create(
      MembersInjector<ListHabitsMenu> listHabitsMenuMembersInjector,
      Provider<BaseActivity> activityProvider,
      Provider<ListHabitsScreen> screenProvider,
      Provider<HabitCardListAdapter> adapterProvider,
      Provider<Preferences> preferencesProvider,
      Provider<ThemeSwitcher> themeSwitcherProvider) {
    return new ListHabitsMenu_Factory(
        listHabitsMenuMembersInjector,
        activityProvider,
        screenProvider,
        adapterProvider,
        preferencesProvider,
        themeSwitcherProvider);
  }
}
