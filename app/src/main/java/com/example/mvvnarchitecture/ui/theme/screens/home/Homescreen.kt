package com.example.mvvnarchitecture.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvnarchitecture.R


@Composable
fun Home(navController: NavHostController) {

    Icon(imageVector = Icons.Default.Person, contentDescription = "Person")


    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
//         .padding(20.sp)
            .background(color = Color.Black)
    ) {
        Text(
            text = "Welcome to Sally Beauty Shop Collection",
            color = Color.Red,
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(4.dp))
        Spacer(modifier = Modifier.height(4.dp))
        Spacer(modifier = Modifier.height(4.dp))
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "The Home Of Beauty And Fashion",
            color = Color.Cyan,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif
        )
        Image(painter = painterResource(id = R.drawable.sally1),contentDescription = null,
            modifier = Modifier.size(13000.dp))


    }


    }


@Preview(showBackground = true)
@Composable
fun Homeprev(){

    Home(navController= rememberNavController())
}