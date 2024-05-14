package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.Size
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import kotlin.io.path.fileVisitor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ){
                    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly){

                        Row(modifier = Modifier.fillMaxWidth()){
                            Column(
                                modifier = Modifier
                                    .background(colorResource(id = R.color.light_purple))
                                    .fillMaxWidth(0.5F)
                                    .fillMaxHeight(0.5F),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                Column(
                                    modifier = Modifier.padding(16.dp)
                                ){
                                    DisplayString(resString = R.string.text_composable, textAlign = TextAlign.Center,FontWeight(500), padSize = 16)
                                    DisplayString(resString = R.string.text_paragraph, textAlign = TextAlign.Justify,FontWeight(300), padSize = 0)
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .background(colorResource(id = R.color.less_light_purple))
                                    .fillMaxWidth(1F)
                                    .fillMaxHeight(0.5F),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                Column(
                                    modifier = Modifier.padding(16.dp)
                                ){
                                    DisplayString(resString = R.string.image_composable, textAlign = TextAlign.Center,FontWeight(500), padSize = 16)
                                    DisplayString(resString = R.string.image_paragraph, textAlign = TextAlign.Justify,FontWeight(300), padSize = 0)
                                }
                            }

                        }
                        Row(modifier = Modifier.fillMaxWidth()){
                            Column(
                                modifier = Modifier
                                    .background(colorResource(id = R.color.darkest_purple))
                                    .fillMaxWidth(0.5F)
                                    .fillMaxHeight(1F),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                Column(
                                    modifier = Modifier.padding(16.dp)
                                ){
                                    DisplayString(resString = R.string.row_composable, textAlign = TextAlign.Center,FontWeight(500), padSize = 16)
                                    DisplayString(resString = R.string.row_paragraph, textAlign = TextAlign.Justify,FontWeight(300), padSize = 0)
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .background(colorResource(id = R.color.more_white_than_purple))
                                    .fillMaxWidth(1F)
                                    .fillMaxHeight(1F),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                Column(
                                    modifier = Modifier.padding(16.dp)
                                ){
                                    DisplayString(resString = R.string.column_composable, textAlign = TextAlign.Center,FontWeight(500), padSize = 16)
                                    DisplayString(resString = R.string.column_paragraph, textAlign = TextAlign.Justify,FontWeight(300), padSize = 0)
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
fun DisplayString(resString: Int, textAlign: TextAlign, fontWeight: FontWeight, padSize: Int){
    Text(
        text = stringResource(id = resString),
        textAlign = textAlign,
        fontSize = 16.sp,
        fontWeight = fontWeight,
        modifier = Modifier.padding(padSize.dp)

    )
}

@Preview(showBackground = true)
@Composable
fun GradlePreview() {
    ComposeQuadrantTheme {


    }
}