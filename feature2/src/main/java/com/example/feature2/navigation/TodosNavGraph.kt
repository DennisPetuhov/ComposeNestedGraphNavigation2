package com.example.feature2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.feature2.screens.todos.todosRoute
import com.example.feature2.screens.todo_add.todoAddRoute

@Composable
fun TodosNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Todos.route
    ) {
        todosRoute(navController = navController)
        todoAddRoute(navController = navController)

    }
}
