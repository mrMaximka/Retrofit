package wf.forward.retrofit.rest.entitie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequestElement (
    @Expose
    @SerializedName("url")
    val url: String,

    @Expose
    @SerializedName("type")
    val type: String,

    @Expose
    @SerializedName("data")
    val data: RequestData
)