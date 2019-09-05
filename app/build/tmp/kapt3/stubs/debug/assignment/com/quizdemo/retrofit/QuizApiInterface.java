package assignment.com.quizdemo.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lassignment/com/quizdemo/retrofit/QuizApiInterface;", "", "getQuiz", "Lio/reactivex/Flowable;", "Lassignment/com/quizdemo/model/QuizModel;", "app_debug"})
public abstract interface QuizApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "items/8f3dfd7a-c4cd-453e-8354-4e80ab4d4a6f")
    public abstract io.reactivex.Flowable<assignment.com.quizdemo.model.QuizModel> getQuiz();
}