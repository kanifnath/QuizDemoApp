package assignment.com.quizdemo.activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import assignment.com.quizdemo.R
import assignment.com.quizdemo.model.QuizModel

import assignment.com.quizdemo.model.QuizViewModel
import java.util.logging.Logger

class HomeActivity : AppCompatActivity() {


    lateinit var viewModel: QuizViewModel
    companion object{var quizModel: QuizModel?=null}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
    }

    private fun initView() {
        viewModel = ViewModelProviders.of(this).get(QuizViewModel::class.java)
        viewModel.getQuizData()?.observe(this, Observer {
                quizModelData->
            quizModel=quizModelData

        })
    }

}
