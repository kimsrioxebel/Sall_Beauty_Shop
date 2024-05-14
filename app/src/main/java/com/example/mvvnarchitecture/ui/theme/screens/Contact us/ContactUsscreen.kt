package com.example.mvvnarchitecture.ui.theme.screens.Contact

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.Sally_Beauty_Shop.navigation.ROUTE_CONTACT
import com.example.mvvnarchitecture.R


@Composable
fun Contact(navController: NavHostController) {

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

        Text(
            text = "Contact Us",
            color = Color.Green,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif
        )

        Image(
            painter = painterResource(id = R.drawable.sally3), contentDescription = null,
            modifier = Modifier.padding(90.dp)
        )

        Text(
            text = "You can reach us through our agents",
            color = Color.Green,
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.sally7), contentDescription ="instagram",
                modifier = Modifier
                    .size(75.dp)
                    .clickable {
//                    facebook clickable
                    })
            Image(painter = painterResource(id = R.drawable.sally8),
                contentDescription ="facebook",
                modifier = Modifier
                    .size(75.dp)
                    .clickable {
//                   Instagram clickable
                    })
            Image(painter = painterResource(id = R.drawable.sally9), contentDescription ="google",
                modifier = Modifier
                    .size(75.dp)
                    .clickable {
//                   Instagram clickable
                    }
            )}

        Text(
            text = "You can cotact us through our whatsapp number",
            color = Color.Green,
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(4.dp))
        Spacer(modifier = Modifier.height(4.dp))


        Text(
            text = "+25405815059",
            color = Color.Green,
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif, modifier = Modifier.clickable {  }
        )
        Text(
            text = "or visit our websites",
            color = Color.Green,
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.pic3), contentDescription ="instagram",
                modifier = Modifier
                    .size(75.dp)
                    .clickable {
//                    facebook clickable
                    })
            Image(painter = painterResource(id = R.drawable.pic2),
                contentDescription ="facebook",
                modifier = Modifier
                    .size(75.dp)
                    .clickable {
//                   Instagram clickable
                    })
            Image(painter = painterResource(id = R.drawable.pic3), contentDescription ="google",
                modifier = Modifier
                    .size(75.dp)
                    .clickable {
//                   Instagram clickable
                    }
            )}


    }
}

@Preview(showBackground = true)
@Composable
fun Contactprev(){
Contact(navController = rememberNavController())
}
