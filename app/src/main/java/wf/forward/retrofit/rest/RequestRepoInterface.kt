package wf.forward.retrofit.rest

import retrofit2.Call

import retrofit2.http.GET
import wf.forward.retrofit.rest.entitie.RequestRestModel

interface RequestRepoInterface {
    @GET("mobile/v1/feed?limit=20")
    fun loadData(): Call<RequestRestModel>
}