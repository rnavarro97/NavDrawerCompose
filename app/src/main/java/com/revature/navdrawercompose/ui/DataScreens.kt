package com.revature.navdrawercompose.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.revature.navdrawercompose.R

@Composable
fun Home(NavController:NavController)
{
    Column(
        modifier=Modifier.fillMaxSize()
    ) {
        TopBar(title = "Home",
        buttonIcon = Icons.Filled.Menu,
        onButtonClicked = {NavController.popBackStack() })

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Home Page Content Goes Here.")
        }
    }
}

@Composable
fun Account(NavController:NavController)
{
    Column(
        modifier=Modifier.fillMaxSize()
    ) {
        TopBar(title = "Account",
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = {NavController.popBackStack() })

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Account Page Content Goes Here.")
        }
    }
}

@Composable
fun Help(NavController:NavController)
{
    Column(
        modifier=Modifier.fillMaxSize()
    ) {
        TopBar(title = "Help",
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = {NavController.popBackStack()})

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Help Page Content Goes Here.")
        }
    }
}