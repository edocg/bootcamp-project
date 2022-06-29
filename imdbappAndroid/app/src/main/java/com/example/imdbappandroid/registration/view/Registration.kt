package com.example.imdbappandroid.registration.view

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.imdbappandroid.R
import com.example.imdbappandroid.shared.theme.Yellow200

@Composable
fun Registration(navController: NavController) {
    Column {

    LogoCard()

    Column(
        modifier= Modifier
            .fillMaxWidth(),
        horizontalAlignment=Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ){
            Text(
                text ="Create an account",
                fontWeight = FontWeight.Bold,
                fontSize=20.sp,
                modifier =Modifier.padding(vertical = 8.dp)
            )
            InputName()
            InputEmail()
            InputPassword()
            Text(
                text ="Password must contain 8 characters",
                fontWeight = FontWeight.Bold,
                fontSize=16.sp,
                modifier =Modifier.padding(vertical = 8.dp)
            )
        Button(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .width(280.dp)
                .height(60.dp),
            onClick = { navController.popBackStack()   },
            shape= RoundedCornerShape(20),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),

            ){
            Text(text = "Accept",
                color = Color.White,
                style= MaterialTheme.typography.h5.copy(
                    color = Color.Black
                )
            )
        }
        }
    }
}

@Composable
fun LogoCard(
    modifier: Modifier = Modifier
    ){
        Surface(
            color= Yellow200,
            shape = RoundedCornerShape(8.dp),
            elevation = 8.dp,
            modifier=modifier.padding(48.dp)
        ) {
                Image(
                    painter = painterResource(id = R.drawable.splashlogo),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .size(80.dp)
                )
            }
        }


@Composable
fun InputName(){
    var name by rememberSaveable(stateSaver = TextFieldValue.Saver) {mutableStateOf(TextFieldValue("")) }

    Box(
        Modifier
            .fillMaxWidth()
            .padding(12.dp),
        Alignment.Center

    ){
        OutlinedTextField(
            value = name,
            onValueChange = {name= it},
            label={Text(text="name")}
        )
    }
}

@Composable
fun InputEmail(){
    var email by rememberSaveable(stateSaver = TextFieldValue.Saver) {mutableStateOf(TextFieldValue("")) }

    Box(
        Modifier
            .fillMaxWidth()
            .padding(12.dp),
        Alignment.Center

    ){
        OutlinedTextField(
            value = email,
            onValueChange = {email= it},
            label={Text(text="Email")}
        )
    }
}

@Composable
fun InputPassword(){
    var password by rememberSaveable(stateSaver = TextFieldValue.Saver) {mutableStateOf(TextFieldValue("")) }

    Box(
        Modifier
            .fillMaxWidth()
            .padding(12.dp),
        Alignment.Center

    ){
        OutlinedTextField(
            value = password,
            onValueChange = {password= it},
            label={Text(text="Password")}
        )
    }
}