package org.basim.uhabits.utils;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum MidnightTimer_Factory implements Factory<MidnightTimer> {
  INSTANCE;

  @Override
  public MidnightTimer get() {
    return new MidnightTimer();
  }

  public static Factory<MidnightTimer> create() {
    return INSTANCE;
  }
}
