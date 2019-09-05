package assignment.com.quizdemo.model
import com.google.gson.annotations.SerializedName

data class QuizModel (
	@SerializedName("quiz")
	var quiz : Quiz?
)