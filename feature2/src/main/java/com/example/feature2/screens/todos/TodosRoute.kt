package com.example.feature2.screens.todos

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature2.navigation.Screens

fun NavGraphBuilder.todosRoute(navController: NavController) {
    composable(
        route = Screens.Todos.route,
        content = {
            TodosScreen(
                navController = navController,
            )
        }
    )
}
