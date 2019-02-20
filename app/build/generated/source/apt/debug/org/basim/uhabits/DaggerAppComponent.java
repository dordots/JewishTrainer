package org.basim.uhabits;

import android.content.Context;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.activities.habits.list.model.HabitCardListCache;
import org.basim.uhabits.activities.habits.list.model.HabitCardListCache_Factory;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.commands.CommandRunner_Factory;
import org.basim.uhabits.commands.CreateHabitCommandFactory;
import org.basim.uhabits.commands.CreateHabitCommandFactory_Factory;
import org.basim.uhabits.commands.EditHabitCommandFactory;
import org.basim.uhabits.commands.EditHabitCommandFactory_Factory;
import org.basim.uhabits.intents.IntentFactory;
import org.basim.uhabits.intents.IntentFactory_Factory;
import org.basim.uhabits.intents.IntentParser;
import org.basim.uhabits.intents.IntentParser_Factory;
import org.basim.uhabits.intents.IntentScheduler;
import org.basim.uhabits.intents.IntentScheduler_Factory;
import org.basim.uhabits.intents.PendingIntentFactory;
import org.basim.uhabits.intents.PendingIntentFactory_Factory;
import org.basim.uhabits.io.DirFinder;
import org.basim.uhabits.io.DirFinder_Factory;
import org.basim.uhabits.io.GenericImporter;
import org.basim.uhabits.io.GenericImporter_Factory;
import org.basim.uhabits.io.HabitBullCSVImporter;
import org.basim.uhabits.io.HabitBullCSVImporter_Factory;
import org.basim.uhabits.io.LoopDBImporter;
import org.basim.uhabits.io.LoopDBImporter_Factory;
import org.basim.uhabits.io.RewireDBImporter;
import org.basim.uhabits.io.RewireDBImporter_Factory;
import org.basim.uhabits.io.TickmateDBImporter;
import org.basim.uhabits.io.TickmateDBImporter_Factory;
import org.basim.uhabits.models.HabitList;
import org.basim.uhabits.models.ModelFactory;
import org.basim.uhabits.models.sqlite.SQLModelFactory;
import org.basim.uhabits.models.sqlite.SQLModelFactory_ProvideHabitListFactory;
import org.basim.uhabits.models.sqlite.SQLModelFactory_ProvideModelFactoryFactory;
import org.basim.uhabits.notifications.NotificationTray;
import org.basim.uhabits.notifications.NotificationTray_Factory;
import org.basim.uhabits.preferences.Preferences;
import org.basim.uhabits.preferences.Preferences_Factory;
import org.basim.uhabits.preferences.WidgetPreferences;
import org.basim.uhabits.preferences.WidgetPreferences_Factory;
import org.basim.uhabits.tasks.AndroidTaskRunner;
import org.basim.uhabits.tasks.AndroidTaskRunner_ProvideTaskRunnerFactory;
import org.basim.uhabits.tasks.TaskRunner;
import org.basim.uhabits.utils.ReminderScheduler;
import org.basim.uhabits.utils.ReminderScheduler_Factory;
import org.basim.uhabits.widgets.WidgetUpdater;
import org.basim.uhabits.widgets.WidgetUpdater_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<TaskRunner> provideTaskRunnerProvider;

  private Provider<CommandRunner> commandRunnerProvider;

  private Provider<Context> getContextProvider;

  private Provider<CreateHabitCommandFactory> createHabitCommandFactoryProvider;

  private Provider<DirFinder> dirFinderProvider;

  private Provider<EditHabitCommandFactory> editHabitCommandFactoryProvider;

  private Provider<HabitList> provideHabitListProvider;

  private Provider<LoopDBImporter> loopDBImporterProvider;

  private Provider<RewireDBImporter> rewireDBImporterProvider;

  private Provider<TickmateDBImporter> tickmateDBImporterProvider;

  private Provider<HabitBullCSVImporter> habitBullCSVImporterProvider;

  private Provider<GenericImporter> genericImporterProvider;

  private Provider<HabitCardListCache> habitCardListCacheProvider;

  private Provider<HabitLogger> habitLoggerProvider;

  private Provider<IntentParser> intentParserProvider;

  private Provider<PendingIntentFactory> pendingIntentFactoryProvider;

  private Provider<Preferences> preferencesProvider;

  private Provider<NotificationTray> notificationTrayProvider;

  private Provider<IntentScheduler> intentSchedulerProvider;

  private Provider<ReminderScheduler> reminderSchedulerProvider;

  private Provider<WidgetPreferences> widgetPreferencesProvider;

  private Provider<WidgetUpdater> widgetUpdaterProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideTaskRunnerProvider =
        ScopedProvider.create(AndroidTaskRunner_ProvideTaskRunnerFactory.create());

    this.commandRunnerProvider =
        ScopedProvider.create(CommandRunner_Factory.create(provideTaskRunnerProvider));

    this.getContextProvider = AppModule_GetContextFactory.create(builder.appModule);

    this.createHabitCommandFactoryProvider =
        CreateHabitCommandFactory_Factory.create(
            SQLModelFactory_ProvideModelFactoryFactory.create());

    this.dirFinderProvider = DirFinder_Factory.create(getContextProvider);

    this.editHabitCommandFactoryProvider =
        EditHabitCommandFactory_Factory.create(SQLModelFactory_ProvideModelFactoryFactory.create());

    this.provideHabitListProvider =
        ScopedProvider.create(SQLModelFactory_ProvideHabitListFactory.create());

    this.loopDBImporterProvider =
        LoopDBImporter_Factory.create(
            MembersInjectors.<LoopDBImporter>noOp(), getContextProvider, provideHabitListProvider);

    this.rewireDBImporterProvider =
        RewireDBImporter_Factory.create(
            MembersInjectors.<RewireDBImporter>noOp(),
            provideHabitListProvider,
            SQLModelFactory_ProvideModelFactoryFactory.create());

    this.tickmateDBImporterProvider =
        TickmateDBImporter_Factory.create(
            MembersInjectors.<TickmateDBImporter>noOp(),
            provideHabitListProvider,
            SQLModelFactory_ProvideModelFactoryFactory.create());

    this.habitBullCSVImporterProvider =
        HabitBullCSVImporter_Factory.create(
            MembersInjectors.<HabitBullCSVImporter>noOp(),
            provideHabitListProvider,
            SQLModelFactory_ProvideModelFactoryFactory.create());

    this.genericImporterProvider =
        GenericImporter_Factory.create(
            MembersInjectors.<GenericImporter>noOp(),
            provideHabitListProvider,
            loopDBImporterProvider,
            rewireDBImporterProvider,
            tickmateDBImporterProvider,
            habitBullCSVImporterProvider);

    this.habitCardListCacheProvider =
        ScopedProvider.create(
            HabitCardListCache_Factory.create(
                provideHabitListProvider, commandRunnerProvider, provideTaskRunnerProvider));

    this.habitLoggerProvider = ScopedProvider.create(HabitLogger_Factory.create());

    this.intentParserProvider =
        ScopedProvider.create(IntentParser_Factory.create(provideHabitListProvider));

    this.pendingIntentFactoryProvider =
        ScopedProvider.create(
            PendingIntentFactory_Factory.create(
                getContextProvider, IntentFactory_Factory.create()));

    this.preferencesProvider =
        ScopedProvider.create(Preferences_Factory.create(getContextProvider));

    this.notificationTrayProvider =
        ScopedProvider.create(
            NotificationTray_Factory.create(
                getContextProvider,
                provideTaskRunnerProvider,
                pendingIntentFactoryProvider,
                commandRunnerProvider,
                preferencesProvider));

    this.intentSchedulerProvider =
        ScopedProvider.create(IntentScheduler_Factory.create(getContextProvider));

    this.reminderSchedulerProvider =
        ScopedProvider.create(
            ReminderScheduler_Factory.create(
                pendingIntentFactoryProvider,
                intentSchedulerProvider,
                habitLoggerProvider,
                commandRunnerProvider,
                provideHabitListProvider));

    this.widgetPreferencesProvider =
        ScopedProvider.create(WidgetPreferences_Factory.create(getContextProvider));

    this.widgetUpdaterProvider =
        WidgetUpdater_Factory.create(getContextProvider, commandRunnerProvider);
  }

  @Override
  public CommandRunner getCommandRunner() {
    return commandRunnerProvider.get();
  }

  @Override
  public Context getContext() {
    return getContextProvider.get();
  }

  @Override
  public CreateHabitCommandFactory getCreateHabitCommandFactory() {
    return createHabitCommandFactoryProvider.get();
  }

  @Override
  public DirFinder getDirFinder() {
    return dirFinderProvider.get();
  }

  @Override
  public EditHabitCommandFactory getEditHabitCommandFactory() {
    return editHabitCommandFactoryProvider.get();
  }

  @Override
  public GenericImporter getGenericImporter() {
    return genericImporterProvider.get();
  }

  @Override
  public HabitCardListCache getHabitCardListCache() {
    return habitCardListCacheProvider.get();
  }

  @Override
  public HabitList getHabitList() {
    return provideHabitListProvider.get();
  }

  @Override
  public HabitLogger getHabitsLogger() {
    return habitLoggerProvider.get();
  }

  @Override
  public IntentFactory getIntentFactory() {
    return IntentFactory_Factory.create().get();
  }

  @Override
  public IntentParser getIntentParser() {
    return intentParserProvider.get();
  }

  @Override
  public ModelFactory getModelFactory() {
    return SQLModelFactory_ProvideModelFactoryFactory.create().get();
  }

  @Override
  public NotificationTray getNotificationTray() {
    return notificationTrayProvider.get();
  }

  @Override
  public PendingIntentFactory getPendingIntentFactory() {
    return pendingIntentFactoryProvider.get();
  }

  @Override
  public Preferences getPreferences() {
    return preferencesProvider.get();
  }

  @Override
  public ReminderScheduler getReminderScheduler() {
    return reminderSchedulerProvider.get();
  }

  @Override
  public TaskRunner getTaskRunner() {
    return provideTaskRunnerProvider.get();
  }

  @Override
  public WidgetPreferences getWidgetPreferences() {
    return widgetPreferencesProvider.get();
  }

  @Override
  public WidgetUpdater getWidgetUpdater() {
    return widgetUpdaterProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder androidTaskRunner(AndroidTaskRunner androidTaskRunner) {
      Preconditions.checkNotNull(androidTaskRunner);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder sQLModelFactory(SQLModelFactory sQLModelFactory) {
      Preconditions.checkNotNull(sQLModelFactory);
      return this;
    }
  }
}
