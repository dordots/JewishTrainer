package org.basim.uhabits.intents;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum IntentFactory_Factory implements Factory<IntentFactory> {
  INSTANCE;

  @Override
  public IntentFactory get() {
    return new IntentFactory();
  }

  public static Factory<IntentFactory> create() {
    return INSTANCE;
  }
}
