package com.example.mcc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_task2.*

class Task2 : AppCompatActivity(),View.OnClickListener {
    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)

        et_input.setOnClickListener(this)
        btn_i.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when ( v!!.id)
        {
            R.id.et_input->
            {
                myToast("Button One Clicked")
            }
            R.id.btn_i->
            {
                val inputText =et_input.text.toString().trim();

                if(inputText.equals("9")){

                }else if(inputText.equals("16")){

                }else if (inputText.equals("25")){

                }else{
                    myToast("please enter 16 , 9, 25")
                }
            }

        }

    }

    private fun myToast(string: String)
    {
        toast = Toast.makeText(this,string,Toast.LENGTH_SHORT)
        toast?.show()
    }

}