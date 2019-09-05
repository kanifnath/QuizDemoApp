package assignment.com.quizdemo.model
import com.google.gson.annotations.SerializedName

data class Question2 (

	@SerializedName("question") var question : String?,
	@SerializedName("options") var options : List<String>?,
	@SerializedName("answer") var answer : String?,
	var userAnswer:String?="-1",
	var optionSelected:Int=-1
)