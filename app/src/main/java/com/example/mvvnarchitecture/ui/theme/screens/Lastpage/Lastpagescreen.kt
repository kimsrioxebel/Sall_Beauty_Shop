package com.example.mvvnarchitecture.ui.theme.screens.Lastpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvnarchitecture.R


@Composable
fun LastScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.sally1),
            contentDescription = "Farm Produce",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(1300.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//            TopBar()
            Text(
                text = "Thanks For Shopping with us",
                color = Color.Blue,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )



            Text(text = "Thank you for shopping with us." + "WELCOME!!",
                color = Color.Magenta,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp)


        }
    }


}

@Preview(
    showSystemUi = true,
    showBackground = true
)

@Composable
fun LastScreenPreview(){
    LastScreen(navController = rememberNavController())

}