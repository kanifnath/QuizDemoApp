package assignment.com.quizdemo.model

import android.util.Log
import assignment.com.quizdemo.retrofit.QuizCallbackInterface

import assignment.com.quizdemo.retrofit.RetrofitInstance
import io.reactivex.schedulers.Schedulers


class QuizRepository {


    fun getQuizData(quizCallBack:QuizCallbackInterface) {

        /*
            Fetch Quiz data from server
         */
        RetrofitInstance.create().getQuiz().subscribeOn(Schedulers.computation())
            .subscribe {
                //Log.e("QuizRepository ",""+it.quiz?.sport.toString())
                quizCallBack.getQuiz(it)
            }


    }

}
