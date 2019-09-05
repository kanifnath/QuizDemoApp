package assignment.com.quizdemo.fragments


import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import assignment.com.quizdemo.R
import kotlinx.android.synthetic.main.fragment_quiz_start.*

import androidx.navigation.Navigation
import assignment.com.quizdemo.activity.HomeActivity
import assignment.com.quizdemo.databinding.FragmentQuizStartBinding
import assignment.com.quizdemo.model.QuizModel
import assignment.com.quizdemo.model.QuizViewModel
import java.util.logging.Logger


class QuizStartFragment : Fragment() {
    private lateinit var navController: NavController
    private var rootView:View?=null
    private lateinit var viewModel: QuizViewModel
    lateinit var  binding:FragmentQuizStartBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = DataBindingUtil.inflate(inflater ,R.layout.fragment_quiz_start,container , false)
        rootView = binding.root
       // binding.quizModel=HomeActivity.quizModel

        navController = Navigation.findNavController(activity as Activity, R.id.nav_host_fragment)
        return rootView;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()

        btnMaths.setOnClickListener {
            navController.navigate(R.id.questionsFragment)

        }
    }

    private fun setViewModel() {
        viewModel = ViewModelProviders.of(this).get(QuizViewModel::class.java)
        viewModel.getQuizData()?.observe(this, Observer {
                quizModelData->
            HomeActivity.quizModel =quizModelData
            //btnMaths.setText(""+HomeActivity.quizModel?.quiz?.maths.toString())
             binding.quizModel=HomeActivity.quizModel

        })
    }



}
