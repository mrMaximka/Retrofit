package wf.forward.retrofit.rest.entitie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequestData (
    @Expose
    @SerializedName("backgroundImage")
    val backgroundImage: String,

    @Expose
    @SerializedName("title")
    val title: String,

    @Expose
    @SerializedName("tags")
    val tags: List<RequestTag>? = null,

    @Expose
    @SerializedName("image")
    val image: String? = null,

    @Expose
    @SerializedName("content")
    val content: List<RequestContent>? = null,

    @Expose
    @SerializedName("sport")
    val sport: String? = null,

    @Expose
    @SerializedName("liveEvents")
    val liveEvents: List<RequestLiveEvent>? = null,

    @Expose
    @SerializedName("live")
    val live:Boolean? = null,

    @Expose
    @SerializedName("photoUrlList")
    val photoUrlList: List<String>? = null
)