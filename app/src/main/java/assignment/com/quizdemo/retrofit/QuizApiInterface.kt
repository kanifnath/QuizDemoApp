package assignment.com.quizdemo.retrofit

import assignment.com.quizdemo.model.QuizModel
import io.reactivex.Flowable

import retrofit2.http.GET

interface QuizApiInterface {

    @GET("items/8f3dfd7a-c4cd-453e-8354-4e80ab4d4a6f")
    fun getQuiz(): Flowable<QuizModel>

}