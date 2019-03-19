// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.edit;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BaseDialogHelper$$ViewBinder<T extends BaseDialogHelper> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296548, "field 'tvName'");
    target.tvName = finder.castView(view, 2131296548, "field 'tvName'");
    view = finder.findRequiredView(source, 2131296544, "field 'tvDescription'");
    target.tvDescription = finder.castView(view, 2131296544, "field 'tvDescription'");
    view = finder.findRequiredView(source, 2131296547, "field 'tvFreqNum'");
    target.tvFreqNum = finder.castView(view, 2131296547, "field 'tvFreqNum'");
    view = finder.findRequiredView(source, 2131296546, "field 'tvFreqDen'");
    target.tvFreqDen = finder.castView(view, 2131296546, "field 'tvFreqDen'");
    view = finder.findRequiredView(source, 2131296551, "field 'tvReminderTime'");
    target.tvReminderTime = finder.castView(view, 2131296551, "field 'tvReminderTime'");
    view = finder.findRequiredView(source, 2131296550, "field 'tvReminderDays'");
    target.tvReminderDays = finder.castView(view, 2131296550, "field 'tvReminderDays'");
    view = finder.findRequiredView(source, 2131296460, "field 'sFrequency'");
    target.sFrequency = finder.castView(view, 2131296460, "field 'sFrequency'");
    view = finder.findRequiredView(source, 2131296416, "field 'llCustomFrequency'");
    target.llCustomFrequency = finder.castView(view, 2131296416, "field 'llCustomFrequency'");
    view = finder.findRequiredView(source, 2131296420, "field 'llReminderDays'");
    target.llReminderDays = finder.castView(view, 2131296420, "field 'llReminderDays'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends BaseDialogHelper> implements Unbinder {
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
      target.tvName = null;
      target.tvDescription = null;
      target.tvFreqNum = null;
      target.tvFreqDen = null;
      target.tvReminderTime = null;
      target.tvReminderDays = null;
      target.sFrequency = null;
      target.llCustomFrequency = null;
      target.llReminderDays = null;
    }
  }
}
