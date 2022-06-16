package com.example.imdb

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
import androidx.navigation.NavHostController
import com.example.imdb.navigation.AppScreens
import com.example.imdb.ui.theme.Yellow200
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {

    LaunchedEffect(key1 = true  ){
        delay(1000)
        navController.popBackStack()
        navController.navigate(AppScreens.LoginScreen.route)
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
            painter=painterResource(id=R.drawable.ic_logo),
            contentDescription= "logo IMDb",
        )
    }
}

@Preview(showBackground= true)
@Composable
fun SplashScreenView() {
    Splash()
}