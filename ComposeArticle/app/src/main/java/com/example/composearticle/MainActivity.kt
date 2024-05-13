package com.example.composearticle

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.example.composearticle.ui.theme.ComposeArticleTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.TitledBorderJustification

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top
                    ){
                        BackGroundImage()
                        TextDisplay(fSize = 24, padSize = 16, resString = R.string.title)
                        TextDisplay(padSize = 16, resString = R.string.jetpack_compose_explanation)
                        TextDisplay(padSize = 16, resString = R.string.tutorial_explanation)
                    }
                }
            }
        }
    }
}

@Composable
fun BackGroundImage(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.fillMaxWidth(),
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
        )

}

@Composable
fun TextDisplay(fSize: Int = 18, padSize: Int, resString: Int, modifier: Modifier = Modifier) {
    val text = stringResource(id = resString)
    Text(
        text = text,
        fontSize = fSize.sp,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(
            top = padSize.dp,
            start = padSize.dp,
            end = padSize.dp
        )
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ){
        BackGroundImage()
        TextDisplay(fSize = 24, padSize = 16, resString = R.string.title)
        TextDisplay(padSize = 16, resString = R.string.jetpack_compose_explanation)
        TextDisplay(padSize = 16, resString = R.string.tutorial_explanation)
    }
}