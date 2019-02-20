// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.common.dialogs;

import android.content.res.Resources;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.Object;
import java.lang.Override;
import java.lang.SuppressWarnings;

public class ConfirmDeleteDialog$$ViewBinder<T extends ConfirmDeleteDialog> implements ViewBinder<T> {
  @Override
  @SuppressWarnings("ResourceType")
  public Unbinder bind(final Finder finder, final T target, Object source) {
    Resources res = finder.getContext(source).getResources();
    target.question = res.getString(2131624011);
    target.yes = res.getString(17039379);
    target.no = res.getString(17039369);
    return Unbinder.EMPTY;
  }
}
