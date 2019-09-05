package assignment.com.quizdemo.model
import com.google.gson.annotations.SerializedName

data class Quiz (

	@SerializedName("sport") var sport : Sport?,
	@SerializedName("maths") var maths : Maths?
)