package com.example.imdb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.imdb.LoginScreen
import com.example.imdb.RegistrationScreen
import com.example.imdb.SplashScreen

@Composable
fun AppNavigation() {
    val navController= rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route){
            composable(AppScreens.SplashScreen.route){
                SplashScreen(navController)
            }
            composable(AppScreens.LoginScreen.route){
                LoginScreen(navController)
            }
            composable(AppScreens.RegistrationScreen.route){
                RegistrationScreen(navController)
            }
        }
}