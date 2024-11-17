package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class BaliActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlaceOne()
                }
            }
        }
    }
}

@Composable
fun PlaceOne() {
    Column(modifier = Modifier.background(color = Color.White)
        .padding(20.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_1),
        )
        Image(
            painterResource(id = R.drawable.bali), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival and Relaxation\n" +

                    "Arrive in Madurai and check into your hotel or accommodation.\n" +
                    "Spend the day relaxing and getting acclimated to the Place.\n" +
                    "If you have time, explore the nearby area or head to the Temples.\n" +
                    "\n" +

                    "Day 2: Temple Tour\n" +

                    "Start your day early and head to Temples, a cultural and artistic Places of India.\n" +
                    "Visit the Meenakshi Amman Temple and the Nayakar's Palace.\n" +
                    "Take a tour of the Artistic City, a beautiful Heritage City of India.\n" +
                    "End your day with a traditional Dinning Experience.\n" +
                    "\n" +
                    "Day 3: Temple Hopping\n" +

                    "Visit some of Madurai's most famous temples, such as Azhagarkovil and Tallakulam.\n" +
                    "Take in the stunning views of the Temple Tombs and its Design.\n" +
                    "Enjoy a sunset dinner at one of the many restaurants near the temples.\n" +
                    "\n" +
                    "Day 4:Fun ride Around The City\n" +

                    "Take a day trip to Maduari's beautiful Dams or Rivers \n" +
                    "Spend the afternoon at one of Madurai's famous Restaurent and finising it With City's Famous Drink Jigarthanda.\n" +
                    "\n" +
                    "Day 5: Visiting Greeny Villages\n" +

                    "Take a day trip to one of Madurai's islands,Greeny Villages filled with Love.\n" +
                    "Explore the Paddy field and many other fields.\n" +
                    "\n" +
                    "Day 6: Cultural Activities\n" +
                    "Visit a traditional Temple, Meuseums and learn about the City.\n" +
            "\n" +
                    "Day 7: Departure\n" +
                    "Explore the surrounding area and take in the stunning sunset views.\n" +
                    "Have dinner at a local restaurant before returning to your accommodation."
        )


    }
}

