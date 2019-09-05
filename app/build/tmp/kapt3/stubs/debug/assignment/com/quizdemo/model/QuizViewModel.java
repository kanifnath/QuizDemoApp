package assignment.com.quizdemo.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lassignment/com/quizdemo/model/QuizViewModel;", "Landroidx/lifecycle/ViewModel;", "Lassignment/com/quizdemo/retrofit/QuizCallbackInterface;", "()V", "quizData", "Landroidx/lifecycle/MutableLiveData;", "Lassignment/com/quizdemo/model/QuizModel;", "repository", "Lassignment/com/quizdemo/model/QuizRepository;", "getQuiz", "", "quizModel", "getQuizData", "app_debug"})
public final class QuizViewModel extends androidx.lifecycle.ViewModel implements assignment.com.quizdemo.retrofit.QuizCallbackInterface {
    private androidx.lifecycle.MutableLiveData<assignment.com.quizdemo.model.QuizModel> quizData;
    private assignment.com.quizdemo.model.QuizRepository repository;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<assignment.com.quizdemo.model.QuizModel> getQuizData() {
        return null;
    }
    
    @java.lang.Override()
    public void getQuiz(@org.jetbrains.annotations.NotNull()
    assignment.com.quizdemo.model.QuizModel quizModel) {
    }
    
    public QuizViewModel() {
        super();
    }
}