package org.basim.uhabits.activities.habits.show;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.models.Habit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ShowHabitRootView_Factory implements Factory<ShowHabitRootView> {
  private final MembersInjector<ShowHabitRootView> showHabitRootViewMembersInjector;

  private final Provider<Context> contextProvider;

  private final Provider<Habit> habitProvider;

  public ShowHabitRootView_Factory(
      MembersInjector<ShowHabitRootView> showHabitRootViewMembersInjector,
      Provider<Context> contextProvider,
      Provider<Habit> habitProvider) {
    assert showHabitRootViewMembersInjector != null;
    this.showHabitRootViewMembersInjector = showHabitRootViewMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert habitProvider != null;
    this.habitProvider = habitProvider;
  }

  @Override
  public ShowHabitRootView get() {
    return MembersInjectors.injectMembers(
        showHabitRootViewMembersInjector,
        new ShowHabitRootView(contextProvider.get(), habitProvider.get()));
  }

  public static Factory<ShowHabitRootView> create(
      MembersInjector<ShowHabitRootView> showHabitRootViewMembersInjector,
      Provider<Context> contextProvider,
      Provider<Habit> habitProvider) {
    return new ShowHabitRootView_Factory(
        showHabitRootViewMembersInjector, contextProvider, habitProvider);
  }
}
