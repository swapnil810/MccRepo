package com.example.mcc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_task2.*

class Task2 : AppCompatActivity(), View.OnClickListener {
    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)

        et_input.setOnClickListener(this)
        btn_i.setOnClickListener(this)
        lin_25_operation.setOnClickListener(this)
        lin_1st_operation.setOnClickListener(this)
        lin_16st_operation.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.et_input -> {
                myToast("Button One Clicked")
            }
            R.id.btn_i -> {
                val inputText = et_input.text.toString().trim();

                if (inputText.equals("9")) {
                    lin_1st_operation.isVisible = true
                    lin_16st_operation.isVisible = false
                    lin_25_operation.isVisible=false


                } else if (inputText.equals("16")) {

                    lin_16st_operation.isVisible = true
                    lin_1st_operation.isVisible = false
                    lin_25_operation.isVisible=false



                } else if (inputText.equals("25")) {
                    lin_16st_operation.isVisible = false
                    lin_1st_operation.isVisible = false
                    lin_25_operation.isVisible=true


                } else {
                    myToast("please enter 16 , 9, 25")
                    lin_1st_operation.isVisible = false
                    lin_16st_operation.isVisible = false
                    lin_25_operation.isVisible=false


                }
            }

        }

    }

    private fun myToast(string: String) {
        toast = Toast.makeText(this, string, Toast.LENGTH_SHORT)
        toast?.show()
    }

}