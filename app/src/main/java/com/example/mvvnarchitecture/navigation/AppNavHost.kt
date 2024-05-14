package com.example.mvvnarchitecture.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.Sally_Beauty_Shop.navigation.ROUTE_ABOUT
import com.example.Sally_Beauty_Shop.navigation.ROUTE_ADD_PRODUCT
import com.example.Sally_Beauty_Shop.navigation.ROUTE_CONTACT
import com.example.Sally_Beauty_Shop.navigation.ROUTE_DELIVERY
import com.example.Sally_Beauty_Shop.navigation.ROUTE_GALLERY
import com.example.Sally_Beauty_Shop.navigation.ROUTE_HOME
import com.example.Sally_Beauty_Shop.navigation.ROUTE_LAST
import com.example.Sally_Beauty_Shop.navigation.ROUTE_LOGIN
import com.example.Sally_Beauty_Shop.navigation.ROUTE_SIGIN
import com.example.Sally_Beauty_Shop.navigation.ROUTE_VIEW_PRODUCT
import com.example.mvvnarchitecture.ui.theme.screens.About.About
import com.example.mvvnarchitecture.ui.theme.screens.Contact.Contact
import com.example.mvvnarchitecture.ui.theme.screens.Gallery.AddFruitsScreen
import com.example.mvvnarchitecture.ui.theme.screens.Gallery.FruitsList
import com.example.mvvnarchitecture.ui.theme.screens.Gallery.ViewFruitsScreen
import com.example.mvvnarchitecture.ui.theme.screens.Lastpage.LastScreen
import com.example.mvvnarchitecture.ui.theme.screens.login.LoginScreen
import com.example.mvvnarchitecture.ui.theme.screens.signin.RegisterBackground
import com.example.mvvnarchitecture.ui.theme.screens.home.Home
import com.example.sally_beauty_shop.ui.theme.screens.delivery.DeliveryScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String = ROUTE_LOGIN
) {
    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_SIGIN) {
            RegisterBackground(navController)
        }
        composable(ROUTE_HOME) {
            Home(navController)
        }
        composable(ROUTE_CONTACT) {
            Contact(navController)
        }
        composable(ROUTE_ABOUT) {
            About(navController)
        }

        composable("$ROUTE_GALLERY/{userid}") {passedData ->
            FruitsList(navController, passedData.arguments?.getString("userid")!!)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddFruitsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT) {
            ViewFruitsScreen(navController)
        }
        composable("$ROUTE_DELIVERY/{userid}") {passedData ->
            DeliveryScreen(navController, passedData.arguments?.getString("userid")!!)

        }
        composable(ROUTE_LAST) {
            LastScreen(navController)
        }
    }}