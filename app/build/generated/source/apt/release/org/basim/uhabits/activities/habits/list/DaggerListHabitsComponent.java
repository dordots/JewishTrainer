package org.basim.uhabits.activities.habits.list;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.AppComponent;
import org.basim.uhabits.activities.ActivityModule;
import org.basim.uhabits.activities.ActivityModule_GetActivityFactory;
import org.basim.uhabits.activities.ActivityModule_GetContextFactory;
import org.basim.uhabits.activities.BaseActivity;
import org.basim.uhabits.activities.BaseSystem;
import org.basim.uhabits.activities.BaseSystem_Factory;
import org.basim.uhabits.activities.ThemeSwitcher;
import org.basim.uhabits.activities.ThemeSwitcher_Factory;
import org.basim.uhabits.activities.common.dialogs.ColorPickerDialogFactory;
import org.basim.uhabits.activities.common.dialogs.ColorPickerDialogFactory_Factory;
import org.basim.uhabits.activities.common.dialogs.ConfirmDeleteDialogFactory;
import org.basim.uhabits.activities.common.dialogs.ConfirmDeleteDialogFactory_Factory;
import org.basim.uhabits.activities.common.dialogs.FilePickerDialogFactory;
import org.basim.uhabits.activities.common.dialogs.FilePickerDialogFactory_Factory;
import org.basim.uhabits.activities.habits.edit.CreateHabitDialogFactory_Factory;
import org.basim.uhabits.activities.habits.edit.EditHabitDialogFactory_Factory;
import org.basim.uhabits.activities.habits.list.controllers.CheckmarkButtonControllerFactory;
import org.basim.uhabits.activities.habits.list.controllers.CheckmarkButtonControllerFactory_Factory;
import org.basim.uhabits.activities.habits.list.model.HabitCardListAdapter;
import org.basim.uhabits.activities.habits.list.model.HabitCardListAdapter_Factory;
import org.basim.uhabits.activities.habits.list.model.HabitCardListCache;
import org.basim.uhabits.activities.habits.list.model.HintListFactory;
import org.basim.uhabits.activities.habits.list.model.HintListFactory_Factory;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.intents.IntentFactory;
import org.basim.uhabits.io.DirFinder;
import org.basim.uhabits.io.GenericImporter;
import org.basim.uhabits.models.HabitList;
import org.basim.uhabits.preferences.Preferences;
import org.basim.uhabits.tasks.ExportCSVTaskFactory;
import org.basim.uhabits.tasks.ExportCSVTaskFactory_Factory;
import org.basim.uhabits.tasks.ExportDBTaskFactory;
import org.basim.uhabits.tasks.ExportDBTaskFactory_Factory;
import org.basim.uhabits.tasks.ImportDataTaskFactory;
import org.basim.uhabits.tasks.ImportDataTaskFactory_Factory;
import org.basim.uhabits.tasks.TaskRunner;
import org.basim.uhabits.utils.MidnightTimer;
import org.basim.uhabits.utils.MidnightTimer_Factory;
import org.basim.uhabits.utils.ReminderScheduler;
import org.basim.uhabits.widgets.WidgetUpdater;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerListHabitsComponent implements ListHabitsComponent {
  private Provider<Preferences> getPreferencesProvider;

  private Provider<CheckmarkButtonControllerFactory> checkmarkButtonControllerFactoryProvider;

  private Provider<HabitCardListCache> getHabitCardListCacheProvider;

  private Provider<MidnightTimer> midnightTimerProvider;

  private Provider<HabitCardListAdapter> habitCardListAdapterProvider;

  private Provider<Context> getContextProvider;

  private Provider<BaseSystem> baseSystemProvider;

  private Provider<CommandRunner> getCommandRunnerProvider;

  private Provider<HabitList> getHabitListProvider;

  private Provider<BaseActivity> getActivityProvider;

  private Provider<DirFinder> getDirFinderProvider;

  private Provider<HintListFactory> hintListFactoryProvider;

  private Provider<TaskRunner> getTaskRunnerProvider;

  private Provider<ListHabitsRootView> listHabitsRootViewProvider;

  private Provider<IntentFactory> getIntentFactoryProvider;

  private Provider<ThemeSwitcher> themeSwitcherProvider;

  private Provider<ConfirmDeleteDialogFactory> confirmDeleteDialogFactoryProvider;

  private Provider<FilePickerDialogFactory> filePickerDialogFactoryProvider;

  private Provider<ColorPickerDialogFactory> colorPickerDialogFactoryProvider;

  private Provider<ListHabitsScreen> listHabitsScreenProvider;

  private Provider<ReminderScheduler> getReminderSchedulerProvider;

  private Provider<WidgetUpdater> getWidgetUpdaterProvider;

  private Provider<GenericImporter> getGenericImporterProvider;

  private Provider<ImportDataTaskFactory> importDataTaskFactoryProvider;

  private Provider<Context> getContextProvider2;

  private Provider<ExportCSVTaskFactory> exportCSVTaskFactoryProvider;

  private Provider<ExportDBTaskFactory> exportDBTaskFactoryProvider;

  private Provider<ListHabitsController> listHabitsControllerProvider;

  private Provider<ListHabitsMenu> listHabitsMenuProvider;

  private Provider<ListHabitsSelectionMenu> listHabitsSelectionMenuProvider;

  private DaggerListHabitsComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getPreferencesProvider =
        new Factory<Preferences>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public Preferences get() {
            return Preconditions.checkNotNull(
                appComponent.getPreferences(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.checkmarkButtonControllerFactoryProvider =
        CheckmarkButtonControllerFactory_Factory.create(getPreferencesProvider);

    this.getHabitCardListCacheProvider =
        new Factory<HabitCardListCache>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public HabitCardListCache get() {
            return Preconditions.checkNotNull(
                appComponent.getHabitCardListCache(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.midnightTimerProvider = ScopedProvider.create(MidnightTimer_Factory.create());

    this.habitCardListAdapterProvider =
        ScopedProvider.create(
            HabitCardListAdapter_Factory.create(
                MembersInjectors.<HabitCardListAdapter>noOp(),
                getHabitCardListCacheProvider,
                getPreferencesProvider,
                midnightTimerProvider));

    this.getContextProvider = ActivityModule_GetContextFactory.create(builder.activityModule);

    this.baseSystemProvider = ScopedProvider.create(BaseSystem_Factory.create(getContextProvider));

    this.getCommandRunnerProvider =
        new Factory<CommandRunner>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public CommandRunner get() {
            return Preconditions.checkNotNull(
                appComponent.getCommandRunner(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.getHabitListProvider =
        new Factory<HabitList>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public HabitList get() {
            return Preconditions.checkNotNull(
                appComponent.getHabitList(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.getActivityProvider = ActivityModule_GetActivityFactory.create(builder.activityModule);

    this.getDirFinderProvider =
        new Factory<DirFinder>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public DirFinder get() {
            return Preconditions.checkNotNull(
                appComponent.getDirFinder(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.hintListFactoryProvider = HintListFactory_Factory.create(getPreferencesProvider);

    this.getTaskRunnerProvider =
        new Factory<TaskRunner>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public TaskRunner get() {
            return Preconditions.checkNotNull(
                appComponent.getTaskRunner(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.listHabitsRootViewProvider =
        ScopedProvider.create(
            ListHabitsRootView_Factory.create(
                MembersInjectors.<ListHabitsRootView>noOp(),
                getContextProvider,
                hintListFactoryProvider,
                habitCardListAdapterProvider,
                getTaskRunnerProvider));

    this.getIntentFactoryProvider =
        new Factory<IntentFactory>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public IntentFactory get() {
            return Preconditions.checkNotNull(
                appComponent.getIntentFactory(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.themeSwitcherProvider =
        ScopedProvider.create(
            ThemeSwitcher_Factory.create(getActivityProvider, getPreferencesProvider));

    this.confirmDeleteDialogFactoryProvider =
        ConfirmDeleteDialogFactory_Factory.create(getContextProvider);

    this.filePickerDialogFactoryProvider =
        FilePickerDialogFactory_Factory.create(getContextProvider);

    this.colorPickerDialogFactoryProvider =
        ScopedProvider.create(ColorPickerDialogFactory_Factory.create(getContextProvider));

    this.listHabitsScreenProvider =
        ScopedProvider.create(
            ListHabitsScreen_Factory.create(
                MembersInjectors.<ListHabitsScreen>noOp(),
                getActivityProvider,
                getCommandRunnerProvider,
                getDirFinderProvider,
                listHabitsRootViewProvider,
                getIntentFactoryProvider,
                themeSwitcherProvider,
                confirmDeleteDialogFactoryProvider,
                CreateHabitDialogFactory_Factory.create(),
                filePickerDialogFactoryProvider,
                colorPickerDialogFactoryProvider,
                EditHabitDialogFactory_Factory.create()));

    this.getReminderSchedulerProvider =
        new Factory<ReminderScheduler>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public ReminderScheduler get() {
            return Preconditions.checkNotNull(
                appComponent.getReminderScheduler(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.getWidgetUpdaterProvider =
        new Factory<WidgetUpdater>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public WidgetUpdater get() {
            return Preconditions.checkNotNull(
                appComponent.getWidgetUpdater(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.getGenericImporterProvider =
        new Factory<GenericImporter>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public GenericImporter get() {
            return Preconditions.checkNotNull(
                appComponent.getGenericImporter(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.importDataTaskFactoryProvider =
        ImportDataTaskFactory_Factory.create(getGenericImporterProvider);

    this.getContextProvider2 =
        new Factory<Context>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public Context get() {
            return Preconditions.checkNotNull(
                appComponent.getContext(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.exportCSVTaskFactoryProvider =
        ExportCSVTaskFactory_Factory.create(getContextProvider2, getHabitListProvider);

    this.exportDBTaskFactoryProvider = ExportDBTaskFactory_Factory.create(getContextProvider2);

    this.listHabitsControllerProvider =
        ScopedProvider.create(
            ListHabitsController_Factory.create(
                baseSystemProvider,
                getCommandRunnerProvider,
                getHabitListProvider,
                habitCardListAdapterProvider,
                listHabitsScreenProvider,
                getPreferencesProvider,
                getReminderSchedulerProvider,
                getTaskRunnerProvider,
                getWidgetUpdaterProvider,
                importDataTaskFactoryProvider,
                exportCSVTaskFactoryProvider,
                exportDBTaskFactoryProvider));

    this.listHabitsMenuProvider =
        ScopedProvider.create(
            ListHabitsMenu_Factory.create(
                MembersInjectors.<ListHabitsMenu>noOp(),
                getActivityProvider,
                listHabitsScreenProvider,
                habitCardListAdapterProvider,
                getPreferencesProvider,
                themeSwitcherProvider));

    this.listHabitsSelectionMenuProvider =
        ScopedProvider.create(
            ListHabitsSelectionMenu_Factory.create(
                MembersInjectors.<ListHabitsSelectionMenu>noOp(),
                getHabitListProvider,
                listHabitsScreenProvider,
                habitCardListAdapterProvider,
                getCommandRunnerProvider));
  }

  @Override
  public CheckmarkButtonControllerFactory getCheckmarkButtonControllerFactory() {
    return checkmarkButtonControllerFactoryProvider.get();
  }

  @Override
  public HabitCardListAdapter getAdapter() {
    return habitCardListAdapterProvider.get();
  }

  @Override
  public ListHabitsController getController() {
    return listHabitsControllerProvider.get();
  }

  @Override
  public ListHabitsMenu getMenu() {
    return listHabitsMenuProvider.get();
  }

  @Override
  public ListHabitsRootView getRootView() {
    return listHabitsRootViewProvider.get();
  }

  @Override
  public ListHabitsScreen getScreen() {
    return listHabitsScreenProvider.get();
  }

  @Override
  public ListHabitsSelectionMenu getSelectionMenu() {
    return listHabitsSelectionMenuProvider.get();
  }

  @Override
  public MidnightTimer getMidnightTimer() {
    return midnightTimerProvider.get();
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private AppComponent appComponent;

    private Builder() {}

    public ListHabitsComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerListHabitsComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
