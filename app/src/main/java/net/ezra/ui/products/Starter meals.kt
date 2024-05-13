package net.ezra.ui.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.navigation.ROUTE_PRODUCTS

@Composable
fun ProductsScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)



    ){
        Text(text = "this is the starter foods screen")

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                    }
                },
            text = "Go home", color = Color(0xff23D342)
        )

        Row {
            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.starter),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 350",fontSize=20.sp)

            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.se),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 350",fontSize=20.sp)



            }





        }
        Spacer(modifier = Modifier.height(10.dp))
        Row {

            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.sd),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 250",fontSize=20.sp)


            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.sdr),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 450",fontSize=20.sp)

            }

            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.starter),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 350",fontSize=20.sp)

            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.se),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 350",fontSize=20.sp)



            }





        }
        Spacer(modifier = Modifier.height(10.dp))
        Row {

            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.sd),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 250",fontSize=20.sp)


            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.sdr),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 450",fontSize=20.sp)

            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                colors = CardDefaults.cardColors(Color(0xfff623b6)),
                modifier = Modifier
                    .height(100.dp)
                    .width(200.dp)

            ) {

                Spacer(modifier = Modifier.height(5.dp))
                Image(
                    painter = painterResource
                        (id = R.drawable.sdr),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp),
                    alignment = Alignment.Center


                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "@ ksh. 450",fontSize=20.sp)

            }



        }



        }





    }





@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}

