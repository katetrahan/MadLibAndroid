// Generated code from Butter Knife. Do not modify!
package com.example.guest.madlibs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StoryActivity$$ViewBinder<T extends com.example.guest.madlibs.StoryActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427432, "field 'mStoryTextView'");
    target.mStoryTextView = finder.castView(view, 2131427432, "field 'mStoryTextView'");
  }

  @Override public void unbind(T target) {
    target.mStoryTextView = null;
  }
}
