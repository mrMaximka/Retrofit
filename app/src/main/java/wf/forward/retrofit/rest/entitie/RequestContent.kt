package wf.forward.retrofit.rest.entitie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequestContent (
    @Expose
    @SerializedName("type")
    val type: String,

    @Expose
    @SerializedName("content")
    val content: String
)