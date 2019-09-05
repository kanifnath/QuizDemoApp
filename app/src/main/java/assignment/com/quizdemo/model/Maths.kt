package assignment.com.quizdemo.model
import com.google.gson.annotations.SerializedName

data class Maths (

    @SerializedName("q1") var q1 : Question1?,
    @SerializedName("q2") var q2 : Question2?,
    @SerializedName("q3") var q3 : Question3?,
    var questionVisible:Int?=0
)