package com.example.mvvnarchitecture.ui.theme.screens.signin


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.Sally_Beauty_Shop.navigation.ROUTE_LOGIN
import com.example.mvvnarchitecture.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterBackground(navController: NavController) {
    var name by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var second by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var email by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var confirmpass by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var context = LocalContext.current

    Text(text = "Hello")
    Box {
        Image(
            painter = painterResource(id = R.drawable.pic8),
            contentDescription = "tomatoes",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(1300.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Signin",
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "Enter FirstNme") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
            )
            OutlinedTextField(
                value = second,
                onValueChange = { second = it },
                label = { Text(text = "Enter ") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
            )
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
                    .padding(8.dp),
            )
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
            OutlinedTextField(
                value = confirmpass,
                onValueChange = { confirmpass = it },
                label = { Text(text = "Confirm your password") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
            )

            Button(onClick = {navController.navigate(ROUTE_LOGIN)},
                modifier= Modifier.fillMaxWidth()



            ) {
                Text(text ="Login" )

            }
//
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun RegPreview(){
    RegisterBackground(navController = rememberNavController())
}
