// Generated by view binder compiler. Do not edit!
package com.paqta.paqtafood.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paqta.paqtafood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailDishesBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final ImageView imageView18;

  @NonNull
  public final ImageView imageView19;

  @NonNull
  public final ImageView imageView20;

  @NonNull
  public final ImageView imageView21;

  @NonNull
  public final ImageView imageView22;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView17;

  private FragmentDetailDishesBinding(@NonNull FrameLayout rootView, @NonNull Button button2,
      @NonNull Button button3, @NonNull Button button4, @NonNull ImageView imageView18,
      @NonNull ImageView imageView19, @NonNull ImageView imageView20,
      @NonNull ImageView imageView21, @NonNull ImageView imageView22,
      @NonNull LinearLayout linearLayout4, @NonNull TextView textView15,
      @NonNull TextView textView17) {
    this.rootView = rootView;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.imageView18 = imageView18;
    this.imageView19 = imageView19;
    this.imageView20 = imageView20;
    this.imageView21 = imageView21;
    this.imageView22 = imageView22;
    this.linearLayout4 = linearLayout4;
    this.textView15 = textView15;
    this.textView17 = textView17;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailDishesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailDishesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail_dishes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailDishesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.imageView18;
      ImageView imageView18 = ViewBindings.findChildViewById(rootView, id);
      if (imageView18 == null) {
        break missingId;
      }

      id = R.id.imageView19;
      ImageView imageView19 = ViewBindings.findChildViewById(rootView, id);
      if (imageView19 == null) {
        break missingId;
      }

      id = R.id.imageView20;
      ImageView imageView20 = ViewBindings.findChildViewById(rootView, id);
      if (imageView20 == null) {
        break missingId;
      }

      id = R.id.imageView21;
      ImageView imageView21 = ViewBindings.findChildViewById(rootView, id);
      if (imageView21 == null) {
        break missingId;
      }

      id = R.id.imageView22;
      ImageView imageView22 = ViewBindings.findChildViewById(rootView, id);
      if (imageView22 == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      return new FragmentDetailDishesBinding((FrameLayout) rootView, button2, button3, button4,
          imageView18, imageView19, imageView20, imageView21, imageView22, linearLayout4,
          textView15, textView17);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
