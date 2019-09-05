package assignment.com.quizdemo.retrofit

import androidx.lifecycle.MutableLiveData
import assignment.com.quizdemo.model.QuizModel

interface QuizCallbackInterface {


    fun getQuiz(quizModel: QuizModel)
}