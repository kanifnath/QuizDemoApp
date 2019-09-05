package assignment.com.quizdemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import assignment.com.quizdemo.model.QuizModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentQuizStartBinding extends ViewDataBinding {
  @NonNull
  public final Button btnMaths;

  @Bindable
  protected QuizModel mQuizModel;

  protected FragmentQuizStartBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnMaths) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnMaths = btnMaths;
  }

  public abstract void setQuizModel(@Nullable QuizModel quizModel);

  @Nullable
  public QuizModel getQuizModel() {
    return mQuizModel;
  }

  @NonNull
  public static FragmentQuizStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_quiz_start, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentQuizStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentQuizStartBinding>inflateInternal(inflater, assignment.com.quizdemo.R.layout.fragment_quiz_start, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentQuizStartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_quiz_start, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentQuizStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentQuizStartBinding>inflateInternal(inflater, assignment.com.quizdemo.R.layout.fragment_quiz_start, null, false, component);
  }

  public static FragmentQuizStartBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentQuizStartBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentQuizStartBinding)bind(component, view, assignment.com.quizdemo.R.layout.fragment_quiz_start);
  }
}
