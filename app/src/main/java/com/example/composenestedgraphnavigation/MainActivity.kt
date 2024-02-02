package com.example.composenestedgraphnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.composenestedgraphnavigation.navigation.MainNavHost
import com.example.composenestedgraphnavigation.navigation.MainScreens
import com.example.composenestedgraphnavigation.ui.theme.ComposeNestedGraphNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNestedGraphNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyMainScreen()
                }
            }
        }
    }

    @Composable
    private fun MyMainScreen() {
        val navController = rememberNavController()

        Column(modifier = Modifier) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(color = Color.Magenta)
            ) {
                Button(onClick = { navController.navigate(MainScreens.HabitsNavGraph.route) }) {
                    Text(text = "TO HABITS  GRAPH")

                }
                Button(onClick = { navController.navigate(MainScreens.TodosNavGraph.route) }) {
                    Text(text = "TO TODO GRAPH")

                }

            }
            Row( modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Green)) {
                MainNavHost(navController = navController)

            }
        }
    }
}

