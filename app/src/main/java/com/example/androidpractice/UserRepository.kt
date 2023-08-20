package com.example.androidpractice

import android.util.Log

class UserRepository {
    fun saveUser(email:String,password:String){
        Log.e("tagg","USER SAVED IN DATABSE :$email + $password")
    }
}