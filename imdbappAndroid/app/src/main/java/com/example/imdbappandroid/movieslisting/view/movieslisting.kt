package com.example.imdbappandroid.movieslisting.view

import com.example.imdbappandroid.R
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController

@Composable
fun MoviesListing(navController: NavController,
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon={
          Icon(
              imageVector = Icons.Default.Search,
              contentDescription =null
          )
        },
        colors= TextFieldDefaults.textFieldColors(
            backgroundColor=MaterialTheme.colors.surface
        ),
        placeholder={
          Text("Buscar IMDb")
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )
}
