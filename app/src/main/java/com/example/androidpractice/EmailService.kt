package com.example.androidpractice

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to:String,from:String,body:String?){
        Log.e("emailservice","Email Sent to user :- $to  + $from + $body")

    }
}