// Generated code from Butter Knife. Do not modify!
package com.example.guest.madlibs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.example.guest.madlibs.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427431, "field 'mCreateMadLibsButton'");
    target.mCreateMadLibsButton = finder.castView(view, 2131427431, "field 'mCreateMadLibsButton'");
    view = finder.findRequiredView(source, 2131427424, "field 'mNounEditText'");
    target.mNounEditText = finder.castView(view, 2131427424, "field 'mNounEditText'");
    view = finder.findRequiredView(source, 2131427425, "field 'mVerbEditText'");
    target.mVerbEditText = finder.castView(view, 2131427425, "field 'mVerbEditText'");
    view = finder.findRequiredView(source, 2131427426, "field 'mAdjEditText'");
    target.mAdjEditText = finder.castView(view, 2131427426, "field 'mAdjEditText'");
    view = finder.findRequiredView(source, 2131427427, "field 'mAdj1EditText'");
    target.mAdj1EditText = finder.castView(view, 2131427427, "field 'mAdj1EditText'");
    view = finder.findRequiredView(source, 2131427428, "field 'mNoun2EditText'");
    target.mNoun2EditText = finder.castView(view, 2131427428, "field 'mNoun2EditText'");
    view = finder.findRequiredView(source, 2131427429, "field 'mNoun1EditText'");
    target.mNoun1EditText = finder.castView(view, 2131427429, "field 'mNoun1EditText'");
    view = finder.findRequiredView(source, 2131427430, "field 'mAdj3EditText'");
    target.mAdj3EditText = finder.castView(view, 2131427430, "field 'mAdj3EditText'");
    view = finder.findRequiredView(source, 2131427423, "field 'mAppNameTextView'");
    target.mAppNameTextView = finder.castView(view, 2131427423, "field 'mAppNameTextView'");
  }

  @Override public void unbind(T target) {
    target.mCreateMadLibsButton = null;
    target.mNounEditText = null;
    target.mVerbEditText = null;
    target.mAdjEditText = null;
    target.mAdj1EditText = null;
    target.mNoun2EditText = null;
    target.mNoun1EditText = null;
    target.mAdj3EditText = null;
    target.mAppNameTextView = null;
  }
}
