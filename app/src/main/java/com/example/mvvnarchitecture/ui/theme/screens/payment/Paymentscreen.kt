package com.example.mvvnarchitecture.ui.theme.screens.payment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mvvnarchitecture.R


@Composable
fun Home(navController: NavHostController) {

//    Icon(imageVector = Icons.Default.Person, contentDescription = "Person")
    Image(painter = painterResource(id = R.drawable.pic11),contentDescription = null,
        modifier = Modifier.size(13000.dp))


    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
//         .padding(20.sp)
            .background(color = Color.Black)
    ) {
        Text(
            text = "You can through our Till Number 762550",
            color = Color.Red,
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive
        )


    }
}