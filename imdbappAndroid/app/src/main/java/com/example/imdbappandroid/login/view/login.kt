package com.example.imdbappandroid.login.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.imdbappandroid.R
import com.example.imdbappandroid.shared.navigation.AppScreens
import com.example.imdbappandroid.shared.theme.Yellow200

@Composable
fun Login(navController: NavController) {
    Scaffold {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(if (isSystemInDarkTheme()) Color.Black else Yellow200)
                .fillMaxSize(),
        ) {

            Image(
                painter = painterResource(id = R.drawable.splashlogo),
                contentDescription = null,
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .size(100.dp)
            )

            Column(
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Text(
                    "User",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(20),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White
                    )
                )
            }

            Column(
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Text(
                    "Password",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(20),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White
                    )
                )
                Text(
                    "¿Forgot the password?",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }


            Button(
                modifier = Modifier
                    .padding(vertical = 18.dp)
                    .width(280.dp)
                    .height(60.dp),
                onClick = { navController.navigate(route = AppScreens.MoviesListing.route) },
                shape = RoundedCornerShape(20),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),

                ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    style = MaterialTheme.typography.h5.copy(
                        color = Color.Black
                    )
                )
            }


            Text(
                "Or you can Login with",
                modifier = Modifier.padding(vertical = 16.dp),
                fontSize = 20.sp
            )


            Row(
                modifier = Modifier.padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.apple_logo_1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(54.dp)
                        .clip(CircleShape)
                        .border(5.dp, Color.White, CircleShape)
                )
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(54.dp)
                        .clip(CircleShape)
                        .border(5.dp, Color.White, CircleShape)
                )
                Image(
                    painter = painterResource(id = R.drawable.gmail),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(54.dp)
                        .clip(CircleShape)
                        .border(5.dp, Color.White, CircleShape)
                )
            }

            TextButton(
                onClick = { navController.navigate(route = AppScreens.Registration.route) }
            ) {
                Text(
                    text = "¿Don't have an account? Register",
                    fontSize = 20.sp,
                    color = Color.Black
                    )
            }


            TextButton(
                onClick = { navController.navigate(route = AppScreens.MoviesListing.route) }
            ) {
                Text(
                    text = "Continue as a guest",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 8.dp),
                    fontSize = 20.sp,
                    color=Color.Black
                )
            }
        }
    }
}
