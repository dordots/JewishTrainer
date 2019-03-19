// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.list.views;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class HabitCardView$$ViewBinder<T extends HabitCardView> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296329, "field 'checkmarkPanel'");
    target.checkmarkPanel = finder.castView(view, 2131296329, "field 'checkmarkPanel'");
    view = finder.findRequiredView(source, 2131296403, "field 'innerFrame'");
    target.innerFrame = finder.castView(view, 2131296403, "field 'innerFrame'");
    view = finder.findRequiredView(source, 2131296406, "field 'label'");
    target.label = finder.castView(view, 2131296406, "field 'label'");
    view = finder.findRequiredView(source, 2131296466, "field 'scoreRing'");
    target.scoreRing = finder.castView(view, 2131296466, "field 'scoreRing'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends HabitCardView> implements Unbinder {
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
      target.checkmarkPanel = null;
      target.innerFrame = null;
      target.label = null;
      target.scoreRing = null;
    }
  }
}
