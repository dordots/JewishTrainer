/*
 * Copyright (C) 2016 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.basim.uhabits;

import android.content.*;

import org.basim.uhabits.activities.habits.list.model.*;
import org.basim.uhabits.commands.*;
import org.basim.uhabits.intents.*;
import org.basim.uhabits.io.*;
import org.basim.uhabits.models.*;
import org.basim.uhabits.models.sqlite.*;
import org.basim.uhabits.notifications.*;
import org.basim.uhabits.preferences.*;
import org.basim.uhabits.tasks.*;
import org.basim.uhabits.utils.*;
import org.basim.uhabits.widgets.*;

import dagger.*;

@AppScope
@Component(modules = {
    AppModule.class, AndroidTaskRunner.class, SQLModelFactory.class
})
public interface AppComponent
{
    CommandRunner getCommandRunner();

    @AppContext
    Context getContext();

    CreateHabitCommandFactory getCreateHabitCommandFactory();

    DirFinder getDirFinder();

    EditHabitCommandFactory getEditHabitCommandFactory();

    GenericImporter getGenericImporter();

    HabitCardListCache getHabitCardListCache();

    HabitList getHabitList();

    HabitLogger getHabitsLogger();

    IntentFactory getIntentFactory();

    IntentParser getIntentParser();

    ModelFactory getModelFactory();

    NotificationTray getNotificationTray();

    PendingIntentFactory getPendingIntentFactory();

    Preferences getPreferences();

    ReminderScheduler getReminderScheduler();

    TaskRunner getTaskRunner();

    WidgetPreferences getWidgetPreferences();

    WidgetUpdater getWidgetUpdater();
}
