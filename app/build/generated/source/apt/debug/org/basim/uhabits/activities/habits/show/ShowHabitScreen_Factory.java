package org.basim.uhabits.activities.habits.show;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.activities.BaseActivity;
import org.basim.uhabits.activities.habits.edit.EditHabitDialogFactory;
import org.basim.uhabits.models.Habit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ShowHabitScreen_Factory implements Factory<ShowHabitScreen> {
  private final MembersInjector<ShowHabitScreen> showHabitScreenMembersInjector;

  private final Provider<BaseActivity> activityProvider;

  private final Provider<Habit> habitProvider;

  private final Provider<ShowHabitRootView> viewProvider;

  private final Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider;

  public ShowHabitScreen_Factory(
      MembersInjector<ShowHabitScreen> showHabitScreenMembersInjector,
      Provider<BaseActivity> activityProvider,
      Provider<Habit> habitProvider,
      Provider<ShowHabitRootView> viewProvider,
      Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider) {
    assert showHabitScreenMembersInjector != null;
    this.showHabitScreenMembersInjector = showHabitScreenMembersInjector;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
    assert habitProvider != null;
    this.habitProvider = habitProvider;
    assert viewProvider != null;
    this.viewProvider = viewProvider;
    assert editHabitDialogFactoryProvider != null;
    this.editHabitDialogFactoryProvider = editHabitDialogFactoryProvider;
  }

  @Override
  public ShowHabitScreen get() {
    return MembersInjectors.injectMembers(
        showHabitScreenMembersInjector,
        new ShowHabitScreen(
            activityProvider.get(),
            habitProvider.get(),
            viewProvider.get(),
            editHabitDialogFactoryProvider.get()));
  }

  public static Factory<ShowHabitScreen> create(
      MembersInjector<ShowHabitScreen> showHabitScreenMembersInjector,
      Provider<BaseActivity> activityProvider,
      Provider<Habit> habitProvider,
      Provider<ShowHabitRootView> viewProvider,
      Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider) {
    return new ShowHabitScreen_Factory(
        showHabitScreenMembersInjector,
        activityProvider,
        habitProvider,
        viewProvider,
        editHabitDialogFactoryProvider);
  }
}
