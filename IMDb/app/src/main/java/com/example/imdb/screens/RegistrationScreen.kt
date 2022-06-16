package com.example.imdb

import androidx.compose.material.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun RegistrationScreen(navController: NavController) {
Box(
    modifier = Modifier.fillMaxWidth()
){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            IconButton(
                onClick = {
                    //TODO back button
                }
            ){
                Icon(
                    iamgeVector = Icons.Default.ArrowBack,
                    contentDescription ="Back Icon",
                    tint = MaterialTheme.colors.primary
                )
            }
            Text(
                text=
            )
        }
    }
}

}