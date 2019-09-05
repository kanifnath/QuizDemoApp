package assignment.com.quizdemo.fragments


import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginTop
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import assignment.com.quizdemo.R
import assignment.com.quizdemo.activity.HomeActivity
import assignment.com.quizdemo.model.QuizModel
import assignment.com.quizdemo.model.QuizViewModel
import kotlinx.android.synthetic.main.fragment_result.*
import java.util.logging.Logger

class ResultFragment : Fragment() {
    private var rootView: View? = null
    private  var quizModel: QuizModel?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_result, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        quizModel=HomeActivity.quizModel;
        addQuestionsView()
        addButton()
    }

    /*
    Add Button to main layout
     */
    private fun addButton() {

        val finishButton = Button(activity)
        finishButton.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        finishButton.text = resources.getString(R.string.complete)
        finishButton.setOnClickListener{
            HomeActivity.quizModel=null
            val intent = Intent(activity, HomeActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        llMain.addView(finishButton);
    }


    private fun addQuestionsView() {

        //question 1
        var que1=quizModel?.quiz?.maths?.q1?.question
        lateinit var que1Result:String
        if(quizModel?.quiz?.maths?.q1?.answer==quizModel?.quiz?.maths?.q1?.userAnswer){
            que1Result=resources.getString(R.string.correct)
        }else{
            que1Result=resources.getString(R.string.incorrect)

        }
        addQueView(que1,que1Result)

        //question 2
        var que2=quizModel?.quiz?.maths?.q2?.question
        lateinit var que2Result:String
        if(quizModel?.quiz?.maths?.q2?.answer==quizModel?.quiz?.maths?.q2?.userAnswer){
            que2Result=resources.getString(R.string.correct)
        }else{
            que2Result=resources.getString(R.string.incorrect)

        }
        addQueView(que2,que2Result)

        //question 3
        var que3=quizModel?.quiz?.maths?.q3?.question
        lateinit var que3Result:String
        if(quizModel?.quiz?.maths?.q3?.answer==quizModel?.quiz?.maths?.q3?.userAnswer){
            que3Result=resources.getString(R.string.correct)
        }else{
            que3Result=resources.getString(R.string.incorrect)

        }
        addQueView(que3,que3Result)


    }
/*
    Add question view to main layout
 */
    private fun addQueView(que:String?,queResult:String) {
        val tvQuestion = TextView(activity)
        tvQuestion.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        tvQuestion.textSize = 15f

        tvQuestion.text = que+" : "+queResult
        llMain.addView(tvQuestion)
    }




}
