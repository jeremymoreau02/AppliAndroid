// Generated code from Butter Knife. Do not modify!
package com.jeremy.estiam.appliandroid;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserInfoActivity_ViewBinding<T extends UserInfoActivity> implements Unbinder {
  protected T target;

  private View view2131624118;

  private TextWatcher view2131624118TextWatcher;

  private View view2131624135;

  private View view2131624107;

  private View view2131624127;

  private View view2131624119;

  private View view2131624091;

  private View view2131624055;

  private View view2131624053;

  @UiThread
  public UserInfoActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.adresse = Utils.findRequiredView(source, R.id.adresse_layout, "field 'adresse'");
    target.donnees = Utils.findRequiredView(source, R.id.donneespersos_layout, "field 'donnees'");
    target.passwordlayout = Utils.findRequiredView(source, R.id.donneespersos_password_layout, "field 'passwordlayout'");
    view = Utils.findRequiredView(source, R.id.donneespersos_birthday_value, "field 'birthday' and method 'handleTextChange'");
    target.birthday = Utils.castView(view, R.id.donneespersos_birthday_value, "field 'birthday'", EditText.class);
    view2131624118 = view;
    view2131624118TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.handleTextChange(Utils.<Editable>castParam(p0, "onTextChanged", 0, "handleTextChange", 0));
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131624118TextWatcher);
    target.confirmpassword = Utils.findRequiredViewAsType(source, R.id.donneespersos_confirmpassword_value, "field 'confirmpassword'", EditText.class);
    target.firstname = Utils.findRequiredViewAsType(source, R.id.donneespersos_firstname_value, "field 'firstname'", EditText.class);
    target.mail = Utils.findRequiredViewAsType(source, R.id.donneespersos_mail_value, "field 'mail'", EditText.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.donneespersos_name_value, "field 'name'", EditText.class);
    target.newpassword = Utils.findRequiredViewAsType(source, R.id.donneespersos_newpassword_value, "field 'newpassword'", EditText.class);
    target.oldpassword = Utils.findRequiredViewAsType(source, R.id.donneespersos_oldpassword_value, "field 'oldpassword'", EditText.class);
    target.pseudo = Utils.findRequiredViewAsType(source, R.id.donneespersos_pseudo_value, "field 'pseudo'", EditText.class);
    target.cp = Utils.findRequiredViewAsType(source, R.id.adresse_cp_valeur, "field 'cp'", EditText.class);
    target.rue = Utils.findRequiredViewAsType(source, R.id.adresse_rue_valeur, "field 'rue'", EditText.class);
    target.ville = Utils.findRequiredViewAsType(source, R.id.adresse_ville_valeur, "field 'ville'", EditText.class);
    view = Utils.findRequiredView(source, R.id.button_okuserinfo, "method 'onClickModification'");
    view2131624135 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickModification(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.donneespersos_texte, "method 'showHideDonnees'");
    view2131624107 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showHideDonnees();
      }
    });
    view = Utils.findRequiredView(source, R.id.adresse_texte, "method 'showHideAdresse'");
    view2131624127 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showHideAdresse();
      }
    });
    view = Utils.findRequiredView(source, R.id.donneespersos_password_text, "method 'showHidePassword'");
    view2131624119 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showHidePassword();
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
    view = Utils.findRequiredView(source, R.id.button_home, "method 'onClickHome'");
    view2131624053 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickHome();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.adresse = null;
    target.donnees = null;
    target.passwordlayout = null;
    target.birthday = null;
    target.confirmpassword = null;
    target.firstname = null;
    target.mail = null;
    target.name = null;
    target.newpassword = null;
    target.oldpassword = null;
    target.pseudo = null;
    target.cp = null;
    target.rue = null;
    target.ville = null;

    ((TextView) view2131624118).removeTextChangedListener(view2131624118TextWatcher);
    view2131624118TextWatcher = null;
    view2131624118 = null;
    view2131624135.setOnClickListener(null);
    view2131624135 = null;
    view2131624107.setOnClickListener(null);
    view2131624107 = null;
    view2131624127.setOnClickListener(null);
    view2131624127 = null;
    view2131624119.setOnClickListener(null);
    view2131624119 = null;
    view2131624091.setOnClickListener(null);
    view2131624091 = null;
    view2131624055.setOnClickListener(null);
    view2131624055 = null;
    view2131624053.setOnClickListener(null);
    view2131624053 = null;

    this.target = null;
  }
}
