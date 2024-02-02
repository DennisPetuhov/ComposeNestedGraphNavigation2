package com.example.feature2.screens.todo_add

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature2.navigation.Screens

fun NavGraphBuilder.todoAddRoute(navController: NavController) {
    composable(
        route = Screens.TodoAdd.route,
        content = {
            TodoAddingDialogScreen(
                navController
            )
        },
    )
}

fun NavController.navigateToAddTodo() {
    navigate(Screens.TodoAdd.route)
}
