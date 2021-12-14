package com.example.mcc

import Data
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //gh
        setContentView(R.layout.activity_main)


        //calling web services
        val apiInterface = ApiInterface.create().getResultData()
        apiInterface.enqueue( object : Callback<List<Result<Data>>> {
            override fun onResponse(call: Call<List<Result<Data>>>?, response: Response<List<Result<Data>>>?) {

                Log.e("TAG", "onResponse: "+response, )

            }

            override fun onFailure(call: Call<List<Result<Data>>>?, t: Throwable?) {

            }
        })


    }
}