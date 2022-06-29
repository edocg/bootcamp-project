package com.example.imdbappandroid.shared.navigation

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object Login: AppScreens("login_screen")
    object Registration: AppScreens("registration_screen")
}
