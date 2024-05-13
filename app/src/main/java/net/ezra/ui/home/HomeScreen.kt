package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.android.material.bottomappbar.BottomAppBar
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable


fun HomeScreen(navController: NavHostController) {


 

    Scaffold(
       bottomBar = { BottomBar()},
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()


            )


            {
                Row {
                    Text(text = "Tico Taco Restaurant", fontSize = 40.sp, fontFamily = FontFamily.Cursive, color = Color.White)

                    Spacer(modifier = Modifier.width(50.dp))



                }



                Spacer(modifier = Modifier.height(10.dp))

                Card(
                    colors = CardDefaults.cardColors(Color(0xffEB5204)),
                    modifier = Modifier
                        .height(150.dp)
                        .width(500.dp)


                ) {

                    Row {
                        Text(text = "we offer various types of burger", fontSize = 20.sp)




                        Spacer(modifier = Modifier.width(10.dp))

                        Image(
                            painter = painterResource
                                (id = R.drawable.burger),
                            contentDescription = "",
                            modifier = Modifier
                                .width(500.dp),
                            contentScale = ContentScale.FillWidth
                        )
                    }
                    Row {
                        Spacer(modifier = Modifier.width( 100.dp))
                        Button(onClick = { navController.navigate(ROUTE_SERVICES)
                        { popUpTo(ROUTE_HOME){inclusive = true} } }) {
                            Text(text = "view products")

                        }
                    }




                }

                Spacer(modifier = Modifier.height(50.dp))




                Row {
                    Card(
                        colors = CardDefaults.cardColors(Color(0xfff623b6)),
                        modifier = Modifier
                            .height(120.dp)
                            .width(200.dp)


                    ) {
                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource
                                (id = R.drawable.starter),
                            contentDescription = "",
                            modifier = Modifier
                                .height(50.dp),
                            alignment = androidx.compose.ui.Alignment.Center


                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "starter meals")

                        Row {

                            Button(onClick = { navController.navigate(ROUTE_PRODUCTS)
                            { popUpTo(ROUTE_HOME){inclusive = true} } }) {
                                Text(text = "view products")

                            }
                        }

                    }

                    Spacer(modifier = Modifier.width(20.dp))
                    Card(
                        colors = CardDefaults.cardColors(Color(0xfff623b6)),
                        modifier = Modifier
                            .height(120.dp)
                            .width(200.dp)


                    ) {
                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource
                                (id = R.drawable.main),
                            contentDescription = "",
                            modifier = Modifier
                                .height(50.dp),
                            alignment = androidx.compose.ui.Alignment.Center


                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Main course meals")

                        Row {

                            Button(onClick = { navController.navigate(ROUTE_SHOP)
                            { popUpTo(ROUTE_HOME){inclusive = true} } }) {
                                Text(text = "view products")

                            }
                        }



                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row {
                    Card(
                        colors = CardDefaults.cardColors(Color(0xfff623b6)),
                        modifier = Modifier
                            .height(120.dp)
                            .width(200.dp)


                    ) {
                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource
                                (id = R.drawable.desert),
                            contentDescription = "",
                            modifier = Modifier
                                .height(50.dp),
                            alignment = androidx.compose.ui.Alignment.Center


                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Best desserts")

                        Row {

                            Button(onClick = { navController.navigate(ROUTE_PRODUCTS)
                            { popUpTo(ROUTE_HOME){inclusive = true} } }) {
                                Text(text = "view products")

                            }
                        }

                    }

                    Spacer(modifier = Modifier.width(20.dp))
                    Card(
                        colors = CardDefaults.cardColors(Color(0xfff623b6)),
                        modifier = Modifier
                            .height(120.dp)
                            .width(200.dp)


                    ) {
                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource
                                (id = R.drawable.bev),
                            contentDescription = "",
                            modifier = Modifier
                                .height(50.dp),
                            alignment = androidx.compose.ui.Alignment.Center


                        )
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Quench thirst with the best drinks only at our restaurant")
                        Row {

                            Button(onClick = { navController.navigate(ROUTE_ABOUT)
                            { popUpTo(ROUTE_HOME){inclusive = true} } }) {
                                Text(text = "view products")

                            }
                        }


                    }
                }





            }



        })





    }
@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}


