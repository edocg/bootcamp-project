package com.example.imdbappandroid

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.navArgument
import com.example.imdbappandroid.login.view.Login
import com.example.imdbappandroid.shared.navigation.AppScreens
import com.example.imdbappandroid.shared.theme.Yellow200
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {

    LaunchedEffect(key1 = true  ){
        delay(1000)
        navController.popBackStack()
        navController.navigate(AppScreens.Login.route)
    }
    Splash()
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier
            .background(if(isSystemInDarkTheme()) Color.Black else Yellow200)
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Image(
            painter= painterResource(id=R.drawable.splashlogo),
            contentDescription= "logo IMDb",
        )
    }
}
