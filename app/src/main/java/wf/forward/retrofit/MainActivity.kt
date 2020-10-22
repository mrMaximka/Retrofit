package wf.forward.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import wf.forward.retrofit.rest.RequestRepo
import wf.forward.retrofit.rest.entitie.RequestRestModel
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    var model = RequestRestModel(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        getData()

    }

    private fun getData(){
        val call: Call<RequestRestModel> = RequestRepo.getClient.loadData()
        call.enqueue(object : Callback<RequestRestModel>{
            override fun onResponse(
                call: Call<RequestRestModel>,
                response: Response<RequestRestModel>
            ) {
                if (response.body() != null && response.isSuccessful)
                model = response.body()!!
                intiType()

            }

            override fun onFailure(
                call: Call<RequestRestModel>,
                t: Throwable
            ) {
                Log.d("MMV", "Fail")
            }

        })
    }

    private fun intiType() {
        for (i in 0..(model.array!!.size-1)){
            Log.d("MMV", model.array!![i].type)
            if (model.array!![i].type == "news")
                Log.d("MMV", "This news!!!!!")
        }
    }
}