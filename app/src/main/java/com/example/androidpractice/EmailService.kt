package com.example.androidpractice

import android.util.Log

class EmailService {
    fun send(to:String,from:String,body:String?){
        Log.e("emailservice","Email Sent to user :- $to  + $from + $body")

    }
}