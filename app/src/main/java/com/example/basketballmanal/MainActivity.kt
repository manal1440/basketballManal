package com.example.basketballmanal

import android.graphics.Paint
import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.R
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basketballmanal.ui.theme.BasketballManalTheme
import com.example.basketballmanal.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasketballManalTheme {
                Main()
            }
        }
    }
}
@Preview(
    showBackground = true,
    device = Devices.NEXUS_6,
    showSystemUi = true
)
@Composable
fun Main(){
    Surface(modifier = Modifier.fillMaxSize()) {

        Column(horizontalAlignment =Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.SpaceEvenly) {

            Image(painter = painterResource(id = com.example.basketballmanal.R.drawable.ic_baskball),
                contentDescription = "" )

            Box( modifier = Modifier.padding(20.dp)) {

                Column(modifier = Modifier.padding(20.dp)) {

                    Text(text = "The Perfect Basketball Courts for you", color = Color.Black,
                        style = Typography.h1)

                    Text(text = "Explore your dream basketball with advanced basketball courts",
                        color = Color.Gray, style = Typography.body1 ,
                        modifier = Modifier.padding(top = 16.dp))

                    Box(
                        modifier = Modifier.fillMaxWidth().padding(end = 48.dp),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Image(
                            painterResource(id = com.example.basketballmanal.R.drawable.ic_arr),
                            contentDescription = null , modifier = Modifier.padding(top = 16.dp)
                        )
                    }
                }



            }



        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Main()
}