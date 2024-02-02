package com.example.feature2.screens.todo_add

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.feature2.navigation.Screens

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun TodoAddingDialogScreen(    navController: NavController) {
    Column(modifier = Modifier) {
        Row(
            modifier = Modifier
                .fillMaxSize().background(color= Color.Red)

        ) {
            Button(onClick = { navController.navigate(Screens.Todos.route) }) {
                Text(text = "TO TODOS SCREEN")

            }


        }
    }

}