package com.example.imdbappandroid.shared.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.imdbappandroid.SplashScreen
import com.example.imdbappandroid.login.view.Login
import com.example.imdbappandroid.registration.view.Registration
import com.example.imdbappandroid.movieslisting.view.MoviesListing

@Composable
fun AppNavigation() {
    val navController= rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route){
        composable(AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(AppScreens.Login.route){
            Login(navController)
        }
        composable(AppScreens.Registration.route){
            Registration(navController)
        }
        composable(AppScreens.MoviesListing.route){
            MoviesListing(navController)
        }
    }
}