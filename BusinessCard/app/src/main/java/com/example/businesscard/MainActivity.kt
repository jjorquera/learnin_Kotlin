package com.example.businesscard

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier
                        .background(
                            color = colorResource(id = R.color.blue_steel_70),
                        )
                        .padding(16.dp)
                        .fillMaxSize(),
                    color = colorResource(id = R.color.blue_steel_70)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                color = colorResource(id = R.color.blue_steel_50)
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(1F)
                                .fillMaxHeight(0.75F)

                                .background(
                                    color = colorResource(id = R.color.blue_steel_10)
                                ),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            ProfileImage(imageSize = 240, modifier = Modifier)
                            Text(text = stringResource(id = R.string.full_name), fontSize = 28.sp ,modifier = Modifier.padding(top = 16.dp))
                            Text(text = stringResource(id = R.string.title), fontSize = 16.sp, modifier = Modifier.padding(top = 4.dp ))

                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(1F)
                                .fillMaxHeight(1F)
                                .background(color = colorResource(id = R.color.blue_steel_20)),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Column(
                                modifier = Modifier
                                    .background(color = colorResource(id = R.color.blue_steel_20)),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Row(
                                    verticalAlignment = Alignment.Bottom
                                ) {
                                    ProfileImage(imageSize = 22, modifier = Modifier)
                                    ShowInfo(stringRes = R.string.phone_number)
                                }
                                Row(
                                    verticalAlignment = Alignment.Bottom
                                ) {
                                    ProfileImage(imageSize = 22, modifier = Modifier)
                                    ShowInfo(stringRes = R.string.instagram_handle)
                                }
                                Row(
                                    verticalAlignment = Alignment.Bottom
                                ) {
                                    ProfileImage(imageSize = 22, modifier = Modifier)
                                    ShowInfo(stringRes = R.string.email)
                                }
                            }

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ProfileImage(imageSize: Int, modifier: Modifier){
    Image(painter = painterResource(id = R.drawable.mexican_guts), contentDescription = null, modifier = Modifier
        .size(imageSize.dp)
        .clip(CircleShape))
}

@Composable
fun ShowInfo(stringRes: Int){
    Text(
        text = stringResource(id = stringRes),
        fontWeight = FontWeight(750),
        modifier = Modifier.padding(top = 16.dp, start = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {


        }
    }