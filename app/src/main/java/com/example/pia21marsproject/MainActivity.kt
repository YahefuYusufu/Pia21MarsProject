package com.example.pia21marsproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pia21marsproject.ui.theme.Pia21MarsProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pia21MarsProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var favouriteActor: String? = "perguzat"
    println(favouriteActor)
    favouriteActor = null
    println(favouriteActor)


    Surface(
        modifier = Modifier
            .padding(24.dp),
        color = Color.Cyan
    ) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pia21MarsProjectTheme {
        Greeting("Android")
    }
}