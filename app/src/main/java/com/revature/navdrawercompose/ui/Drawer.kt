package com.revature.navdrawercompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.revature.navdrawercompose.Model.data.screens
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.revature.navdrawercompose.R
import com.revature.navdrawercompose.ui.theme.NavDrawerComposeTheme

@Composable
fun Drawer(
    modifier:Modifier = Modifier,
    onDestinationClicked:(route:String)->Unit
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(start=24.dp)
    ){
        Image(painter = painterResource(R.drawable.kiwi),
        contentDescription = "App Icon")

        Spacer(Modifier.height(24.dp))

        screens.forEach{screen->
            Spacer(Modifier.height(24.dp))
            Text(
                text = screen.title,
                style = MaterialTheme.typography.h4,
                modifier = Modifier.clickable{}
            )
        }

        Text(
            text = "Screen Title",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.clickable{}
        )
    }
}

@Preview
@Composable
fun DrawerPreview()
{
    NavDrawerComposeTheme{
        Drawer{}
    }
}
