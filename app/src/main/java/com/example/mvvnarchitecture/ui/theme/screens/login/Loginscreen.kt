package com.example.mvvnarchitecture.ui.theme.screens.login



import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
//import com.example.Sally_Beauty_Shop.models.User
//import com.example.Sally_Beauty_Shop.navigation.ROUTE_ABOUT
import com.example.Sally_Beauty_Shop.navigation.ROUTE_SIGIN
import com.example.mvvnarchitecture.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var userid by remember {
        mutableStateOf("")
    }
    var context = LocalContext.current
    Text(text = "Hello")
    Box {
        Image(
            painter = painterResource(id = R.drawable.pic9),
            contentDescription = "tomatoes",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(1200.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "LOGIN SCREEN",
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.img), contentDescription = "login",
                modifier = Modifier.size(200.dp))
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Enter Email Address") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            )
            Spacer(modifier = Modifier.height(4.dp))
            Spacer(modifier = Modifier.height(4.dp))


            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Enter your Password") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
            )
            Spacer(modifier = Modifier.height(4.dp))
            Spacer(modifier = Modifier.height(4.dp))
       Button(onClick = {
                val myLogin = AuthViewModel(navController)
                myLogin.login(
                    email.text.trim(),
                    password.text.trim()
                )
//            navController.navigate("$ROUTE_ABOUT/$use")
            },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.Cyan)) {
                Text(text = "Log In")

            }

            Spacer(modifier = Modifier.height(4.dp))
            Spacer(modifier = Modifier.height(4.dp))

            Text(text = "Don't have an account?",modifier=Modifier.clickable {navController.navigate(
                ROUTE_SIGIN)  })
            Spacer(modifier = Modifier.height(4.dp))

            Text(text = "Or sign in with")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(painter = painterResource(id = R.drawable.pic2), contentDescription ="instagram",
                    modifier = Modifier
                        .size(65.dp)
                        .clickable {
//                    facebook clickable
                        })
                Image(painter = painterResource(id = R.drawable.pic3),
                    contentDescription ="facebook",
                    modifier = Modifier
                        .size(65.dp)
                        .clickable {
//                   Instagram clickable
                        })
                Image(painter = painterResource(id = R.drawable.pic2), contentDescription ="google",
                    modifier = Modifier
                        .size(65.dp)
                        .clickable {
//                   Instagram clickable
                        }
                )



            }
        }
    }

}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun LogInScreenPreview(){

    LoginScreen(navController = rememberNavController())
}

