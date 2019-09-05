package assignment.com.quizdemo.fragments


import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import assignment.com.quizdemo.R
import assignment.com.quizdemo.activity.HomeActivity
import assignment.com.quizdemo.model.*
import kotlinx.android.synthetic.main.fragment_questions.*
import java.util.logging.Logger


class QuestionsFragment : Fragment() {

    private  var quizModel: QuizModel?=null
    private lateinit var navController: NavController
    private var rootView: View? = null
    private var question1: Question1? =null
    private var question2: Question2? =null
    private var question3: Question3? =null
    private var questionNo:Int = 1;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_questions, container, false)
        navController = Navigation.findNavController(activity as Activity, R.id.nav_host_fragment)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        quizModel=HomeActivity.quizModel
        setData()
        handleRadioClicks()
        handleButtonClicks()

    }

    private fun setData() {

        when(questionNo){
            1->
            {
                btnPrevious.isEnabled=false
                btnNext.text=(resources.getString(R.string.next))
                question1=quizModel?.quiz?.maths?.q1
                quizModel?.quiz?.maths?.questionVisible=1

                setRadioSelection( question1?.optionSelected)
                tvQuestion.text=resources.getString(R.string.question)+" 1. "+question1?.question
                rbOptionOne.text=question1?.options?.get(0)
                rbOptionTwo.text=question1?.options?.get(1)
                rbOptionThree.text=question1?.options?.get(2)
                rbOptionFour.text=question1?.options?.get(3)
            }
            2->
            {
                btnPrevious.isEnabled=true
                btnNext.text=resources.getString(R.string.next)
                question2=quizModel?.quiz?.maths?.q2
                quizModel?.quiz?.maths?.questionVisible=2

                setRadioSelection( question2?.optionSelected)
                tvQuestion.text=resources.getString(R.string.question)+" 2. "+question2?.question
                rbOptionOne.text=question2?.options?.get(0)
                rbOptionTwo.text=""+question2?.options?.get(1)
                rbOptionThree.text=""+question2?.options?.get(2)
                rbOptionFour.text=""+question2?.options?.get(3)
            }
            3->
            {
                btnPrevious.isEnabled=true
                btnNext.text=resources.getString(R.string.finish)
                question3=quizModel?.quiz?.maths?.q3
                quizModel?.quiz?.maths?.questionVisible=3

                setRadioSelection( question3?.optionSelected)
                tvQuestion.text=resources.getString(R.string.question)+" 3. "+question3?.question
                rbOptionOne.text=question3?.options?.get(0)
                rbOptionTwo.text=question3?.options?.get(1)
                rbOptionThree.text=question3?.options?.get(2)
                rbOptionFour.text=question3?.options?.get(3)
            }
        }
    }

    /*
        Sets already selected radio button on Next and Previous button click
     */
    private fun setRadioSelection(optionSelected: Int?) {
        when(optionSelected){
            1->
            { rbOptionOne.isChecked=true
            }
            2->
            { rbOptionTwo.isChecked=true }
            3->
             { rbOptionThree.isChecked=true }
            4->
            { rbOptionFour.isChecked=true }
            else->{
                rbOptionOne.isChecked=false
                rbOptionTwo.isChecked=false
                rbOptionThree.isChecked=false
                rbOptionFour.isChecked=false
            }
        }

    }

    private fun handleButtonClicks() {
        btnNext.setOnClickListener {
            //Navigate to Result
            if( questionNo==3){
                navController.navigate(R.id.resultFragment)
            }
            //Sets the data of next question
            else{
                questionNo++
                setData()
            }
        }

        btnPrevious.setOnClickListener {
            //Sets the data of previous question
            questionNo--
            setData()
        }
    }
    private fun handleRadioClicks() {
        RGroup.setOnCheckedChangeListener { group, checkedRadioBtnId ->
            when (checkedRadioBtnId) {
                R.id.rbOptionOne -> {
                    val radio: RadioButton? = rootView?.findViewById( R.id.rbOptionOne)
                     setAnswer(radio,1)
                }
                R.id.rbOptionTwo -> {
                    val radio: RadioButton? = rootView?.findViewById( R.id.rbOptionTwo)
                    setAnswer(radio,2)
                }
                R.id.rbOptionThree -> {
                    val radio: RadioButton? = rootView?.findViewById( R.id.rbOptionThree)
                    setAnswer(radio,3)
                }
                R.id.rbOptionFour -> {
                    val radio: RadioButton? = rootView?.findViewById( R.id.rbOptionFour)
                    setAnswer(radio,4)
                }
            }
        }
    }

    /*
        Store user's answer and option number into the  model
     */
    private fun setAnswer(radio:RadioButton?, radioBtnPosition:Int) {
        when(quizModel?.quiz?.maths?.questionVisible){
            1->{
                quizModel?.quiz?.maths?.q1?.userAnswer=radio?.text.toString()
                quizModel?.quiz?.maths?.q1?.optionSelected=radioBtnPosition
            }
            2->{
                quizModel?.quiz?.maths?.q2?.userAnswer=radio?.text.toString()
                quizModel?.quiz?.maths?.q2?.optionSelected=radioBtnPosition
            }
            3->{
                quizModel?.quiz?.maths?.q3?.userAnswer=radio?.text.toString()
                quizModel?.quiz?.maths?.q3?.optionSelected=radioBtnPosition
            }
        }
    }

}
