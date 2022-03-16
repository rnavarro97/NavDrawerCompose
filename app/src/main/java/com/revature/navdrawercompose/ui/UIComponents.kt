package com.revature.navdrawercompose.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.revature.navdrawercompose.R

@Composable
fun TopBar(title:String,
           buttonIcon: ImageVector,
           onButtonClicked:()->Unit)
{
    Column(modifier= Modifier.fillMaxSize()) {


        TopAppBar(
            title = { Text(text = "Home") },
            navigationIcon={
                IconButton(onClick = { onButtonClicked() }) {
                    Icon(buttonIcon,
                    contentDescription = "")
                }
            }



        )
    }
}
