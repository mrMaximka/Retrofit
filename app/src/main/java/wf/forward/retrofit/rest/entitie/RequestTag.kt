package wf.forward.retrofit.rest.entitie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequestTag (
    @Expose
    @SerializedName("id")
    val id: String,

    @Expose
    @SerializedName("shortName")
    val shortName: String,

    @Expose
    @SerializedName("name")
    val name: String,

    @Expose
    @SerializedName("imageUrl")
    val imageUrl: String,

    @Expose
    @SerializedName("backgroundForTextUrl")
    val backgroundForTextUrl: String,

    @Expose
    @SerializedName("subscribeEntityType")
    val subscribeEntityType: String,

    @Expose
    @SerializedName("flag")
    val flag: Boolean
)