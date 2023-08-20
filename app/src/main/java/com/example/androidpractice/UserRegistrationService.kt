package com.example.androidpractice


class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
){
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send(email,"no-reply@luckykandpal.com", "User Registered")
    }
}



//class UserRegistrationService {
//    private val userRepository = UserRepository()
//    private val emailService = EmailService()
//
//    fun registerUser(email: String, password: String) {
//        userRepository.saveUser(email, password)
//        emailService.send(email, "no-reply@luckykandpal.com", "User Registered")
//    }
//
//}

/*
* Unit Testing
* Single Responsibility
* Lifetime of these objects
* Extensible(Created objects are hardcoded)
* */