package com.example.androidpractice

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email:String,password:String){
        Log.e("tagg","USER SAVED IN DATABSE :$email + $password")
    }
}