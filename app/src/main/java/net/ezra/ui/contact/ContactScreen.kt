package net.ezra.ui.contact


import android.content.res.Configuration
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme



@Composable
fun ContactScreen(navController: NavHostController) {
    Column {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                .padding(16.dp),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = AbsoluteAlignment.Left
        ) {

            Image(
                painter = painterResource(id = R.drawable.phone),
                contentDescription = "Contact Image",
                modifier = Modifier
                    .size(200.dp)
                    .padding(bottom = 3.dp)
            )

            // Add other contact information here
            Text(text = "contact us through the following")

            Text(text = "phone number- 07600600")
           
           Icon(imageVector = Icons.Default.Email, contentDescription =""


               )

            






            Text(
                modifier = Modifier
                    .clickable {
                        navController.navigate(ROUTE_HOME) {
                            popUpTo(ROUTE_CONTACT) { inclusive = true }
                        }
                    },
                text = "Contact"
            )

        }
    }
}





@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

