package com.example.mcc

import Data
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //gh
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener(this)


        //calling web services
        val apiInterface = ApiInterface.create().getResultData()
        apiInterface.enqueue(object : Callback<List<Result<Data>>> {
            override fun onResponse(
                call: Call<List<Result<Data>>>?,
                response: Response<List<Result<Data>>>?
            ) {

                Log.e("TAG", "onResponse: " + response)

            }

            override fun onFailure(call: Call<List<Result<Data>>>?, t: Throwable?) {

            }
        })


    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imageView -> {
                //go to 1st task screen
                val intent = Intent(this@MainActivity,Task2::class.java);
                startActivity(intent);
            }

        }
    }
}