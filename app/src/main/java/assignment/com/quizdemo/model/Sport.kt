package assignment.com.quizdemo.model
import com.google.gson.annotations.SerializedName

data class Sport (

	@SerializedName("q1") val q1 : Question1?
)