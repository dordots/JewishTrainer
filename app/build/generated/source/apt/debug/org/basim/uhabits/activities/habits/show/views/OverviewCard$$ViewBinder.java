// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.show.views;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class OverviewCard$$ViewBinder<T extends OverviewCard> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296466, "field 'scoreRing'");
    target.scoreRing = finder.castView(view, 2131296466, "field 'scoreRing'");
    view = finder.findRequiredView(source, 2131296465, "field 'scoreLabel'");
    target.scoreLabel = finder.castView(view, 2131296465, "field 'scoreLabel'");
    view = finder.findRequiredView(source, 2131296430, "field 'monthDiffLabel'");
    target.monthDiffLabel = finder.castView(view, 2131296430, "field 'monthDiffLabel'");
    view = finder.findRequiredView(source, 2131296564, "field 'yearDiffLabel'");
    target.yearDiffLabel = finder.castView(view, 2131296564, "field 'yearDiffLabel'");
    view = finder.findRequiredView(source, 2131296536, "field 'totalCountLabel'");
    target.totalCountLabel = finder.castView(view, 2131296536, "field 'totalCountLabel'");
    view = finder.findRequiredView(source, 2131296529, "field 'title'");
    target.title = finder.castView(view, 2131296529, "field 'title'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends OverviewCard> implements Unbinder {
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
      target.scoreRing = null;
      target.scoreLabel = null;
      target.monthDiffLabel = null;
      target.yearDiffLabel = null;
      target.totalCountLabel = null;
      target.title = null;
    }
  }
}
