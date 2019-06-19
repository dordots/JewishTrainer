// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.show;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ShowHabitRootView$$ViewBinder<T extends ShowHabitRootView> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296379, "field 'frequencyCard'");
    target.frequencyCard = finder.castView(view, 2131296379, "field 'frequencyCard'");
    view = finder.findRequiredView(source, 2131296525, "field 'streakCard'");
    target.streakCard = finder.castView(view, 2131296525, "field 'streakCard'");
    view = finder.findRequiredView(source, 2131296529, "field 'subtitleCard'");
    target.subtitleCard = finder.castView(view, 2131296529, "field 'subtitleCard'");
    view = finder.findRequiredView(source, 2131296463, "field 'overviewCard'");
    target.overviewCard = finder.castView(view, 2131296463, "field 'overviewCard'");
    view = finder.findRequiredView(source, 2131296484, "field 'scoreCard'");
    target.scoreCard = finder.castView(view, 2131296484, "field 'scoreCard'");
    view = finder.findRequiredView(source, 2131296390, "field 'historyCard'");
    target.historyCard = finder.castView(view, 2131296390, "field 'historyCard'");
    view = finder.findRequiredView(source, 2131296552, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131296552, "field 'toolbar'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ShowHabitRootView> implements Unbinder {
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
      target.frequencyCard = null;
      target.streakCard = null;
      target.subtitleCard = null;
      target.overviewCard = null;
      target.scoreCard = null;
      target.historyCard = null;
      target.toolbar = null;
    }
  }
}
