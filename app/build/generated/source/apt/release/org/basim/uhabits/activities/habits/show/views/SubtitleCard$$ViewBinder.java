// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.show.views;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SubtitleCard$$ViewBinder<T extends SubtitleCard> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296471, "field 'questionLabel'");
    target.questionLabel = finder.castView(view, 2131296471, "field 'questionLabel'");
    view = finder.findRequiredView(source, 2131296382, "field 'frequencyLabel'");
    target.frequencyLabel = finder.castView(view, 2131296382, "field 'frequencyLabel'");
    view = finder.findRequiredView(source, 2131296474, "field 'reminderLabel'");
    target.reminderLabel = finder.castView(view, 2131296474, "field 'reminderLabel'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SubtitleCard> implements Unbinder {
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
      target.questionLabel = null;
      target.frequencyLabel = null;
      target.reminderLabel = null;
    }
  }
}
