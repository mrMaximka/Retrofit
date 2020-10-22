package wf.forward.retrofit.rest.entitie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequestRestModel (

    @Expose
    @SerializedName("items")
    val array: List<RequestType>?

)
