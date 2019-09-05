package assignment.com.quizdemo.databinding;
import assignment.com.quizdemo.R;
import assignment.com.quizdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentQuizStartBindingImpl extends FragmentQuizStartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentQuizStartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentQuizStartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            );
        this.btnMaths.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.quizModel == variableId) {
            setQuizModel((assignment.com.quizdemo.model.QuizModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuizModel(@Nullable assignment.com.quizdemo.model.QuizModel QuizModel) {
        this.mQuizModel = QuizModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.quizModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String quizModelQuizComponent2ToString = null;
        assignment.com.quizdemo.model.Maths quizModelQuizComponent2 = null;
        assignment.com.quizdemo.model.QuizModel quizModel = mQuizModel;
        assignment.com.quizdemo.model.Quiz quizModelQuiz = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (quizModel != null) {
                    // read quizModel.quiz
                    quizModelQuiz = quizModel.getQuiz();
                }


                if (quizModelQuiz != null) {
                    // read quizModel.quiz.component2()
                    quizModelQuizComponent2 = quizModelQuiz.component2();
                }


                if (quizModelQuizComponent2 != null) {
                    // read quizModel.quiz.component2().toString()
                    quizModelQuizComponent2ToString = quizModelQuizComponent2.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnMaths, quizModelQuizComponent2ToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): quizModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}