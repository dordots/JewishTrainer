package org.basim.uhabits;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum HabitLogger_Factory implements Factory<HabitLogger> {
  INSTANCE;

  @Override
  public HabitLogger get() {
    return new HabitLogger();
  }

  public static Factory<HabitLogger> create() {
    return INSTANCE;
  }
}
