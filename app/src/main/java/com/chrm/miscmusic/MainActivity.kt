package com.chrm.miscmusic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrm.miscmusic.ui.theme.MiscmusicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiscmusicTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                    )
                    input_field()
                }
            }
        }
    }
}


//fun SongFeedLoadResult() {
//    for (layout in layouts) {
//        val en_title: String = layout.title?.getString("en-GB") ?: "?"
//        val ja_title: String = layout.title?.getString("ja-JP") ?: "?"
//
//        println("Layout $en_title / $ja_title has ${layout.items.size} items")
//    }
//} SongFeedLoadResult()
@Composable
fun Greeting(name: String) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {}
        ) {
            Text(text = "klik")
        }
    }
    Row (
        modifier = Modifier
            .background(colorScheme.background)
            .fillMaxSize()
    ) {
        for (i in 1..5) {
            Column(
                modifier = Modifier
                    //.size(width = 300.dp)
                    .padding(5.dp)
                    .background(colorScheme.primary)
            ) {
                for (i in 1..5) {
                    Text(
                        text = "$i. Hello $name!",
                    )
                }
            }
        }
    }



}

@Composable
fun input_field() {

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    ){

    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiscmusicTheme {
        Greeting("Android")
    }
}