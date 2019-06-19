package org.basim.uhabits.activities.habits.list;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.activities.BaseActivity;
import org.basim.uhabits.activities.ThemeSwitcher;
import org.basim.uhabits.activities.common.dialogs.ColorPickerDialogFactory;
import org.basim.uhabits.activities.common.dialogs.ConfirmDeleteDialogFactory;
import org.basim.uhabits.activities.common.dialogs.FilePickerDialogFactory;
import org.basim.uhabits.activities.habits.edit.CreateHabitDialogFactory;
import org.basim.uhabits.activities.habits.edit.EditHabitDialogFactory;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.intents.IntentFactory;
import org.basim.uhabits.io.DirFinder;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListHabitsScreen_Factory implements Factory<ListHabitsScreen> {
  private final MembersInjector<ListHabitsScreen> listHabitsScreenMembersInjector;

  private final Provider<BaseActivity> activityProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<DirFinder> dirFinderProvider;

  private final Provider<ListHabitsRootView> rootViewProvider;

  private final Provider<IntentFactory> intentFactoryProvider;

  private final Provider<ThemeSwitcher> themeSwitcherProvider;

  private final Provider<ConfirmDeleteDialogFactory> confirmDeleteDialogFactoryProvider;

  private final Provider<CreateHabitDialogFactory> createHabitDialogFactoryProvider;

  private final Provider<FilePickerDialogFactory> filePickerDialogFactoryProvider;

  private final Provider<ColorPickerDialogFactory> colorPickerFactoryProvider;

  private final Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider;

  public ListHabitsScreen_Factory(
      MembersInjector<ListHabitsScreen> listHabitsScreenMembersInjector,
      Provider<BaseActivity> activityProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<DirFinder> dirFinderProvider,
      Provider<ListHabitsRootView> rootViewProvider,
      Provider<IntentFactory> intentFactoryProvider,
      Provider<ThemeSwitcher> themeSwitcherProvider,
      Provider<ConfirmDeleteDialogFactory> confirmDeleteDialogFactoryProvider,
      Provider<CreateHabitDialogFactory> createHabitDialogFactoryProvider,
      Provider<FilePickerDialogFactory> filePickerDialogFactoryProvider,
      Provider<ColorPickerDialogFactory> colorPickerFactoryProvider,
      Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider) {
    assert listHabitsScreenMembersInjector != null;
    this.listHabitsScreenMembersInjector = listHabitsScreenMembersInjector;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
    assert dirFinderProvider != null;
    this.dirFinderProvider = dirFinderProvider;
    assert rootViewProvider != null;
    this.rootViewProvider = rootViewProvider;
    assert intentFactoryProvider != null;
    this.intentFactoryProvider = intentFactoryProvider;
    assert themeSwitcherProvider != null;
    this.themeSwitcherProvider = themeSwitcherProvider;
    assert confirmDeleteDialogFactoryProvider != null;
    this.confirmDeleteDialogFactoryProvider = confirmDeleteDialogFactoryProvider;
    assert createHabitDialogFactoryProvider != null;
    this.createHabitDialogFactoryProvider = createHabitDialogFactoryProvider;
    assert filePickerDialogFactoryProvider != null;
    this.filePickerDialogFactoryProvider = filePickerDialogFactoryProvider;
    assert colorPickerFactoryProvider != null;
    this.colorPickerFactoryProvider = colorPickerFactoryProvider;
    assert editHabitDialogFactoryProvider != null;
    this.editHabitDialogFactoryProvider = editHabitDialogFactoryProvider;
  }

  @Override
  public ListHabitsScreen get() {
    return MembersInjectors.injectMembers(
        listHabitsScreenMembersInjector,
        new ListHabitsScreen(
            activityProvider.get(),
            commandRunnerProvider.get(),
            dirFinderProvider.get(),
            rootViewProvider.get(),
            intentFactoryProvider.get(),
            themeSwitcherProvider.get(),
            confirmDeleteDialogFactoryProvider.get(),
            createHabitDialogFactoryProvider.get(),
            filePickerDialogFactoryProvider.get(),
            colorPickerFactoryProvider.get(),
            editHabitDialogFactoryProvider.get()));
  }

  public static Factory<ListHabitsScreen> create(
      MembersInjector<ListHabitsScreen> listHabitsScreenMembersInjector,
      Provider<BaseActivity> activityProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<DirFinder> dirFinderProvider,
      Provider<ListHabitsRootView> rootViewProvider,
      Provider<IntentFactory> intentFactoryProvider,
      Provider<ThemeSwitcher> themeSwitcherProvider,
      Provider<ConfirmDeleteDialogFactory> confirmDeleteDialogFactoryProvider,
      Provider<CreateHabitDialogFactory> createHabitDialogFactoryProvider,
      Provider<FilePickerDialogFactory> filePickerDialogFactoryProvider,
      Provider<ColorPickerDialogFactory> colorPickerFactoryProvider,
      Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider) {
    return new ListHabitsScreen_Factory(
        listHabitsScreenMembersInjector,
        activityProvider,
        commandRunnerProvider,
        dirFinderProvider,
        rootViewProvider,
        intentFactoryProvider,
        themeSwitcherProvider,
        confirmDeleteDialogFactoryProvider,
        createHabitDialogFactoryProvider,
        filePickerDialogFactoryProvider,
        colorPickerFactoryProvider,
        editHabitDialogFactoryProvider);
  }
}
