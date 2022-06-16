package com.example.imdb.navigation

sealed class AppScreens (val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object LoginScreen: AppScreens("login_screen")
    object RegistrationScreen: AppScreens("registration_screen")
}