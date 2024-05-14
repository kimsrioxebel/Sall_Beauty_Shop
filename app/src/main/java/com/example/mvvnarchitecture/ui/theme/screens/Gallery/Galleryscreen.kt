package com.example.mvvnarchitecture.ui.theme.screens.Gallery

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.Sally_Beauty_Shop.navigation.ROUTE_DELIVERY
import com.example.mvvnarchitecture.R


data class FruitModel(val name: String, val image: Int,val price: String)
private val fruitsList = listOf(
    FruitModel("Apple", R.drawable.pic1,"30 sh"),
    FruitModel("cabbage", R.drawable.pi2,"60sh"),
    FruitModel("Eggs", R.drawable.pic3,"300 per tray"),
    FruitModel("potatoes", R.drawable.pic4,"100sh per kg"),
    FruitModel("tomatoes", R.drawable.pi5,"10 sh each"),
    FruitModel("pumpkin", R.drawable.pic6,"180 sh"),
    FruitModel("red potatoes", R.drawable.pic7,"80 sh per kg"),
    FruitModel("fruit", R.drawable.pic8,"80 sh each"),
    FruitModel("fish", R.drawable.pic9,"180 sh"),
    FruitModel("arrowroots", R.drawable.pic10,"100 sh per kg"),
    FruitModel("carrots", R.drawable.pic11,"50 sh per kg"),
    FruitModel("sunflower seeds", R.drawable.pic12,"280 sh per kg"),
    FruitModel("zabibu", R.drawable.pic13,"80 sh per kg"),
    FruitModel("coffee", R.drawable.pic14,"150 sh per kg"),
    FruitModel("peas", R.drawable.pic16,"180 sh per kg"),
    FruitModel("french beans", R.drawable.pic17,"200 sh per kg"),

    )

class CustomListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                }
            }
        }


@Composable
fun FruitsList(navController: NavController, userid: String) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(fruitsList) { fruit ->
            ListRow(
                model = fruit,
                navController,
                userid = userid

            )
        }
    }
}

@Composable
fun ListRow(model: FruitModel, navController: NavController, userid: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Cyan)
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = model.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Magenta
        )
        Box (
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = model.price,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Magenta,
            )
        }


    }
    Row {
        Button(onClick = { navController.navigate("$ROUTE_DELIVERY/$userid") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Buy now")
        }
        Log.d("User Id", "Here is user id: $userid")
    }

}


@Preview(showBackground = true)
@Composable
fun MyFarmProductsThemeprev() {
    MaterialTheme
}
