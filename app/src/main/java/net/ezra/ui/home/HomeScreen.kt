package net.ezra.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS

@Composable


fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp)

    )



    {
        LazyColumn {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize()

                ) {

                    Card {
                        Box {
                            Image(painter = painterResource(id = R.drawable.dr), contentDescription = "")

                            Column {
                                Text(text = stringResource(id = R.string.mit))
                                Text(text = "Efficient, Fast", fontFamily = FontFamily.Cursive)
                                Text(text = "Intuitive",fontFamily = FontFamily.Cursive
                                )

                                Spacer(modifier = Modifier.height(40.dp))
                            }

                            
                        }
                    }

                }
            }
        }
        

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "about"
        )

        Button(onClick = {
            navController.navigate(ROUTE_ABOUT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }
        }) {

            Text(text = "about")

        }

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_CONTACT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "Contact"
        )

        Card(
            colors = CardDefaults.cardColors(Color(0xffE52C04)),
            elevation = CardDefaults.cardElevation(5.dp)

        ) {



        }


        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_PRODUCTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to products screen"

        )

        Button(onClick = {
            navController.navigate(ROUTE_MIT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }}) {

            Text(text = "contacts")

        }

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_MIT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to order screen",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_SHOP) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to shop screen",
            fontFamily = FontFamily.Cursive,
            color = Color.White,
            textAlign = TextAlign.Center,

        )

        Spacer(modifier = Modifier.height(10.dp))



        OutlinedButton(onClick = {

            navController.navigate(ROUTE_ADD_STUDENTS) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }

        }) {

            Text(text = "Add to basket", fontFamily = FontFamily.Cursive, color = Color.White)

        }







    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

