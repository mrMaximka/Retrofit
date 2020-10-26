package wf.forward.retrofit.rest.entitie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequestLiveEvent (
    @Expose
    @SerializedName("publishDate")
    val publishDate: Long,

    @Expose
    @SerializedName("content")
    val content: List<RequestContent>,
    )