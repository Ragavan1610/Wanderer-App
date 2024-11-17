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

class ParisActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_2),
        )
        Image(
            painterResource(id = R.drawable.paris), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival and Introduction\n" +

                    "Check into your accommodation and freshen up\n" +
                    "Take a stroll around the neighborhood to get acquainted\n" +
                    "Visit the Penny Cuick Memorial, preferably in the evening when it is lit up\n" +
                    "Have a relaxing dinner at a nearby restaurant\n" +

                    "\n" +
                    "Day 2: Nature and History\n" +

                    "Visit the Megamalai  to see some of the world's most adoring Abundant nature and wildlife\n" +
                    "Stroll through the  Gardens and wildlifes\n" +
                    "Visit the Vaigai Dam, which houses a large collection of Water Reservior\n" +
                    "Have dinner at a local French restaurant\n" +

                    "\n" +
                    "Day 3: Local Culture and Food\n" +

                    "Visit the neighborhood to see the famous Restaurents and Foods\n" +
                    "Explore the historic neighborhood of Penny Cuick Meusuem\n" +
                    "Try some delicious  pastries at a local bakery\n" +
                    "Have dinner at a brasserie to taste some classic Indian cuisine\n" +

                    "\n" +

                    "Day 4: Architecture and Gardens\n" +

                    "Visit the Place of Bodi, World Heritage site, and explore its beautiful gardens\n" +
                    "Walk along the Pathways of Bodi for a peaceful Site\n" +
                    "Visit the Sanneswarar temple, a beautiful Temple with many Heritage \n" +
                    "Have dinner at a local restaurant in the 7th arrondissement\n" +

                    "\n" +
                    "Day 5: Shopping and Sightseeing\n" +

                    "Visit the Suruli Falls and climb up to the top for a stunning view of the city.\n" +
                    "Explore the Local Wildlife.\n" +
                    "Go shopping at the famous Streets  or  department stores\n" +
                    "Have dinner at a local Resort.\n" +
                    "\n" +
                    "Day 6: Parks and Museums\n" +

                    "Visit the Abundant Nature and explore its beautiful gardens\n" +
                    "Stroll through the Botanical Gardens and visit the Place\n" +
                    "Visit the Kumbakkarai Falls, a Beautiful Falls\n" +
                    "Have dinner at a local restaurant in the City\n" +
                    "\n" +
                    "Day 7: River Cruise and Farewell\n" +

                    "Take a boat cruise along the  River to see the city from a different perspective\n" +
                    "Visit the Nature for the Last one time \n" +
                    "Have a farewell dinner at a Michelin-starred restaurant"
        )
    }
}

