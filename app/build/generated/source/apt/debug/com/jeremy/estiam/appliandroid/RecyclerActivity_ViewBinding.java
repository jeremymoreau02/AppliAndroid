// Generated code from Butter Knife. Do not modify!
package com.jeremy.estiam.appliandroid;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RecyclerActivity_ViewBinding<T extends RecyclerActivity> implements Unbinder {
  protected T target;

  private View view2131624089;

  private View view2131624090;

  private View view2131624091;

  private View view2131624055;

  private View view2131624054;

  @UiThread
  public RecyclerActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.recycler = Utils.findRequiredViewAsType(source, R.id.photos_recycler_view, "field 'recycler'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.addphoto_button, "method 'addPhoto'");
    view2131624089 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.addPhoto(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.newphoto_button, "method 'newPhoto'");
    view2131624090 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.newPhoto(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.button_contact, "method 'onClickContact'");
    view2131624091 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickContact();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_deconnexion, "method 'onClickDeconnexion'");
    view2131624055 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickDeconnexion();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_parametres, "method 'onClickUserInfo'");
    view2131624054 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickUserInfo();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.recycler = null;

    view2131624089.setOnClickListener(null);
    view2131624089 = null;
    view2131624090.setOnClickListener(null);
    view2131624090 = null;
    view2131624091.setOnClickListener(null);
    view2131624091 = null;
    view2131624055.setOnClickListener(null);
    view2131624055 = null;
    view2131624054.setOnClickListener(null);
    view2131624054 = null;

    this.target = null;
  }
}
