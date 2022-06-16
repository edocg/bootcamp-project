package com.example.imdb

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.imdb.components.RoundedButton
import com.example.imdb.components.TransparentTextField
import com.example.imdb.ui.theme.Yellow200

@Composable
fun LoginScreen(navController: NavController){
  Scaffold(){
    BodyContent(navController)
  }
}

@Composable
fun BodyContent(navController: NavController) {

   val emailValue =rememberSaveable{ mutableStateOf("")}
   val passwordValue =rememberSaveable{ mutableStateOf("")}
   var passwordVisibility by remember { mutableStateOf(false)}
   val focusManager=LocalFocusManager.current

   Box(
       modifier = Modifier
           .background(if (isSystemInDarkTheme()) Color.Black else Yellow200)
           .fillMaxSize(),

    ){
       Text("IMDb",
            fontSize=74.sp,
            fontWeight= FontWeight.Bold,
            modifier= Modifier
                .align(Alignment.TopCenter)
                .padding(top = 100.dp)
       )
       Box(
           modifier= Modifier.fillMaxSize(),
           contentAlignment = Alignment.BottomCenter
       ){
           Surface(
               modifier = Modifier
                   .fillMaxWidth()
                   .height(550.dp),
               color = MaterialTheme.colors.primarySurface
           )
           {

               Column(modifier = Modifier
                   .fillMaxWidth()
                   .padding(horizontal = 16.dp),
                       horizontalAlignment = Alignment.CenterHorizontally,
                       verticalArrangement = Arrangement.spacedBy(8.dp)
                   ) {
                   TransparentTextField(
                         textFieldValue = emailValue,
                         textLabel = "Email",
                         keyboardType = KeyboardType.Email,
                         KeyboardActions = KeyboardActions(
                             onNext={
                                 focusManager.moveFocus(FocusDirection.Down)
                             }
                         ),
                         imeAction = ImeAction.Next
                     )
                   TransparentTextField(
                       textFieldValue = passwordValue,
                       textLabel = "Password",
                       keyboardType = KeyboardType.Password,
                       KeyboardActions = KeyboardActions(
                           onDone={
                               focusManager.clearFocus()
                               //TODO LOGIN
                           }
                       ),
                       imeAction = ImeAction.Next,
                   /*    trailingIcon={
                        IconButton(
                            onClick={
                                passwordVisibility=!passwordVisibility
                            }
                        )   {
                                Icon(
                                    imageVector = if(passwordVisibility){
                                        Icons.Default.Visibility
                                    }else{
                                        Icons.Default.VisibilityOff
                                    },
                                    contentDescription="Togle Password Icon"
                                )
                            }
                        },*/
                    /*   VisualTransformation = if(passwordVisibility){
                           VisualTransformation.None
                       } else {
                           PasswordVisualTransformation()
                       }*/
                   )
                   Text(modifier= Modifier.fillMaxWidth(),
                       text="Olvido la contraseña",
                       style = MaterialTheme.typography.body1,
                       textAlign= TextAlign.End
                   )
                   }
               }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment=Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ){
                      RoundedButton(text = "Login",
                                    displayProgressBar= false,
                                    onClick={
                                        //TODO login
                                    }
                      )
                      ClickableText(text= buildAnnotatedString {
                          append("¿no tenes cuenta? Registrate")

                          withStyle(
                              style= SpanStyle(
                                  color=MaterialTheme.colors.primary,
                                  fontWeight= FontWeight.Bold
                              )
                          ){
                              append("Sign up")
                          }
                      }
                      ){
                          //NAVIGATE TO REGISTRER SCREEN
                    }
                }
           }

       }
   }