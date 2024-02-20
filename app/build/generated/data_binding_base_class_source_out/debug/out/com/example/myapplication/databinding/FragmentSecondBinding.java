// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSecondBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Milk;

  @NonNull
  public final Button buttonSecond;

  @NonNull
  public final TextView c;

  @NonNull
  public final TextView classic;

  @NonNull
  public final TextView disclaimer;

  @NonNull
  public final TextView f;

  @NonNull
  public final TextView fruit;

  @NonNull
  public final ImageView imageview2;

  @NonNull
  public final TextView m;

  @NonNull
  public final TextView matchalatte;

  @NonNull
  public final TextView mods;

  @NonNull
  public final TextView plarge;

  @NonNull
  public final TextView pre;

  @NonNull
  public final TextView premuim;

  @NonNull
  public final TextView s;

  @NonNull
  public final TextView size;

  @NonNull
  public final TextView sweet;

  @NonNull
  public final TextView sweetness;

  @NonNull
  public final TextView teas;

  @NonNull
  public final TextView top;

  @NonNull
  public final TextView toppings;

  @NonNull
  public final TextView traditional;

  @NonNull
  public final TextView tt;

  private FragmentSecondBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Milk,
      @NonNull Button buttonSecond, @NonNull TextView c, @NonNull TextView classic,
      @NonNull TextView disclaimer, @NonNull TextView f, @NonNull TextView fruit,
      @NonNull ImageView imageview2, @NonNull TextView m, @NonNull TextView matchalatte,
      @NonNull TextView mods, @NonNull TextView plarge, @NonNull TextView pre,
      @NonNull TextView premuim, @NonNull TextView s, @NonNull TextView size,
      @NonNull TextView sweet, @NonNull TextView sweetness, @NonNull TextView teas,
      @NonNull TextView top, @NonNull TextView toppings, @NonNull TextView traditional,
      @NonNull TextView tt) {
    this.rootView = rootView;
    this.Milk = Milk;
    this.buttonSecond = buttonSecond;
    this.c = c;
    this.classic = classic;
    this.disclaimer = disclaimer;
    this.f = f;
    this.fruit = fruit;
    this.imageview2 = imageview2;
    this.m = m;
    this.matchalatte = matchalatte;
    this.mods = mods;
    this.plarge = plarge;
    this.pre = pre;
    this.premuim = premuim;
    this.s = s;
    this.size = size;
    this.sweet = sweet;
    this.sweetness = sweetness;
    this.teas = teas;
    this.top = top;
    this.toppings = toppings;
    this.traditional = traditional;
    this.tt = tt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Milk;
      TextView Milk = rootView.findViewById(id);
      if (Milk == null) {
        break missingId;
      }

      id = R.id.button_second;
      Button buttonSecond = rootView.findViewById(id);
      if (buttonSecond == null) {
        break missingId;
      }

      id = R.id.c;
      TextView c = rootView.findViewById(id);
      if (c == null) {
        break missingId;
      }

      id = R.id.classic;
      TextView classic = rootView.findViewById(id);
      if (classic == null) {
        break missingId;
      }

      id = R.id.disclaimer;
      TextView disclaimer = rootView.findViewById(id);
      if (disclaimer == null) {
        break missingId;
      }

      id = R.id.f;
      TextView f = rootView.findViewById(id);
      if (f == null) {
        break missingId;
      }

      id = R.id.fruit;
      TextView fruit = rootView.findViewById(id);
      if (fruit == null) {
        break missingId;
      }

      id = R.id.imageview2;
      ImageView imageview2 = rootView.findViewById(id);
      if (imageview2 == null) {
        break missingId;
      }

      id = R.id.m;
      TextView m = rootView.findViewById(id);
      if (m == null) {
        break missingId;
      }

      id = R.id.matchalatte;
      TextView matchalatte = rootView.findViewById(id);
      if (matchalatte == null) {
        break missingId;
      }

      id = R.id.mods;
      TextView mods = rootView.findViewById(id);
      if (mods == null) {
        break missingId;
      }

      id = R.id.plarge;
      TextView plarge = rootView.findViewById(id);
      if (plarge == null) {
        break missingId;
      }

      id = R.id.pre;
      TextView pre = rootView.findViewById(id);
      if (pre == null) {
        break missingId;
      }

      id = R.id.premuim;
      TextView premuim = rootView.findViewById(id);
      if (premuim == null) {
        break missingId;
      }

      id = R.id.s;
      TextView s = rootView.findViewById(id);
      if (s == null) {
        break missingId;
      }

      id = R.id.size;
      TextView size = rootView.findViewById(id);
      if (size == null) {
        break missingId;
      }

      id = R.id.sweet;
      TextView sweet = rootView.findViewById(id);
      if (sweet == null) {
        break missingId;
      }

      id = R.id.sweetness;
      TextView sweetness = rootView.findViewById(id);
      if (sweetness == null) {
        break missingId;
      }

      id = R.id.teas;
      TextView teas = rootView.findViewById(id);
      if (teas == null) {
        break missingId;
      }

      id = R.id.top;
      TextView top = rootView.findViewById(id);
      if (top == null) {
        break missingId;
      }

      id = R.id.toppings;
      TextView toppings = rootView.findViewById(id);
      if (toppings == null) {
        break missingId;
      }

      id = R.id.traditional;
      TextView traditional = rootView.findViewById(id);
      if (traditional == null) {
        break missingId;
      }

      id = R.id.tt;
      TextView tt = rootView.findViewById(id);
      if (tt == null) {
        break missingId;
      }

      return new FragmentSecondBinding((ConstraintLayout) rootView, Milk, buttonSecond, c, classic,
          disclaimer, f, fruit, imageview2, m, matchalatte, mods, plarge, pre, premuim, s, size,
          sweet, sweetness, teas, top, toppings, traditional, tt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}