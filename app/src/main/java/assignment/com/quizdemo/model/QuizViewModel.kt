package assignment.com.quizdemo.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import assignment.com.quizdemo.retrofit.QuizCallbackInterface
import assignment.com.quizdemo.retrofit.RetrofitInstance
import io.reactivex.schedulers.Schedulers

class QuizViewModel : ViewModel(),QuizCallbackInterface {

    private var quizData: MutableLiveData<QuizModel>? = MutableLiveData()
    private var repository = QuizRepository()

    fun getQuizData(): MutableLiveData<QuizModel>? {
        repository.getQuizData(this)
        return quizData
    }

    override fun getQuiz(quizModel: QuizModel) {
        //Broadcast's the data who has observed for it
        quizData?.postValue(quizModel)
    }




}