package com.example.mvvnarchitecture.ui.theme.screens.About

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.Sally_Beauty_Shop.navigation.ROUTE_CONTACT
import com.example.Sally_Beauty_Shop.navigation.ROUTE_SIGIN
import com.example.mvvnarchitecture.R


@Composable
fun About(navController: NavHostController) {

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



        Text(
            text = "About us",
            color = Color.Green,
            fontSize = 25.sp,
            fontFamily = FontFamily.Monospace
        )
        Image(painter = painterResource(id = R.drawable.sally2),contentDescription = null,
            modifier = Modifier.padding(90.dp))

        Text(
            text = "Sally Beauty Shop is the  world's largest retailer of profession beauty supplies" +
                    "Sally Beauty boosts more than 2,000 stores across the United States," +
                    "",
            color = Color.Cyan,
            fontSize = 15.sp,
            fontFamily = FontFamily.Monospace
        )
        Text(
            text = "Sally Beauty stores service both retail consumers and salon professionals by " +
                    "offering up to 8,000 products for hair color, hair care, skin, and nails through " +
                    "proprietary brands such as Ion®, Generic Value Products®, Beyond the Zone® and Silk" +
                    " Elements® as well as professional lines such as Wella®, Clairol®, OPI®," +
                    "",
            color = Color.Cyan,
            fontSize = 15.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(4.dp))
        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "How you can Reach Us",modifier=Modifier.clickable {navController.navigate(
            ROUTE_CONTACT
        )  })



    }


}


@Preview(showBackground = true)
@Composable
fun Aboutprev(){

    About(navController= rememberNavController())
}