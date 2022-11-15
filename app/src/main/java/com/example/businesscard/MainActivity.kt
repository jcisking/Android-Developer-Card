package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .background(Color(0xFF234657))
                .fillMaxSize()) {
                Spacer(modifier = Modifier.weight(3f))
                Header()
                Spacer(modifier = Modifier.weight(3f))
                Body()
            }
        }
    }
}


@Composable
fun Header() {
    val image = painterResource(id = R.drawable.android_logo)
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {


        Image(painter = image, contentDescription = null,
            modifier = Modifier.width(75.dp)
            )
        Text(color = Color.White,text = stringResource(id = R.string.Name), fontSize = 40.sp)
        Text(color = Color(0xFF3ddc84),text = stringResource(id = R.string.Occupation))

    }

}

@Composable
fun ColumnScope.Body() {
    Column(modifier = Modifier
        .background(Color.Red)
        .weight(2.5f)
        .fillMaxWidth()) {

        Divider(color = Color.White, thickness = .5.dp)

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 9.dp, bottom = 9.dp, start = 40.dp)) {
            Icon(tint = Color(0xFF3ddc84), painter = painterResource(id = R.drawable.phone_black_24dp), contentDescription = null)
            Text(color = Color.White, text = stringResource(id = R.string.PhoneNumber))
        }

        Divider(color = Color.White, thickness = .5.dp)

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 9.dp, bottom = 9.dp, start = 40.dp)) {
            Icon(tint = Color(0xFF3ddc84), painter = painterResource(id = R.drawable.share_black_24dp), contentDescription = null)
            Text(color = Color.White, text = stringResource(id = R.string.TwitterHandle))
        }

        Divider(color = Color.White, thickness = .5.dp)

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 9.dp, bottom = 9.dp, start = 40.dp)) {
            Icon(tint = Color(0xFF3ddc84), painter = painterResource(id = R.drawable.email_black_24dp), contentDescription = null)
            Text(color = Color.White, text = stringResource(id = R.string.Email))
        }


    }


}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Greeting("Android")
    }
}