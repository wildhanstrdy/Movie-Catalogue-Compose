package com.example.movie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movie.ui.theme.EducatorAppsColor
import com.example.movie.ui.theme.EducatorColors
import com.example.movie.ui.theme.MovieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Card()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MovieTheme {
        Card()
    }
}

@Composable
fun Card(
    modifier: Modifier = Modifier,
    colors: EducatorAppsColor = EducatorColors.colors
) {
    LazyColumn {
        items(count = 50, key = { it }) { index ->
            Box(
                Modifier
                    .padding(16.dp, 6.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(colors.appHomeRecyclerViewItemColor)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier
                        .clickable { }
                        .padding(horizontal = 16.dp, vertical = 32.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("12:1$index PM", color = colors.appHomeRecyclerViewTextColor)
                }

                Divider(color = colors.appHomeRecyclerViewDividerColor)
            }
        }
    }
}