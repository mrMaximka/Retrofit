package wf.forward.retrofit.rest.entitie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequestType (
    @Expose
    @SerializedName("url")
    val url: String,

    @Expose
    @SerializedName("id")
    val id: String,

    @Expose
    @SerializedName("type")
    val type: String
)