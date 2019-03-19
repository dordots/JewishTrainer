// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.show.views;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class StreakCard$$ViewBinder<T extends StreakCard> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296529, "field 'title'");
    target.title = finder.castView(view, 2131296529, "field 'title'");
    view = finder.findRequiredView(source, 2131296506, "field 'streakChart'");
    target.streakChart = finder.castView(view, 2131296506, "field 'streakChart'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends StreakCard> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.title = null;
      target.streakChart = null;
    }
  }
}
