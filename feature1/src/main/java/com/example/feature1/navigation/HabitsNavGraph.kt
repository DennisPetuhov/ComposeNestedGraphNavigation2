package com.example.feature1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.feature1.screens.habits.habitsRoute
import com.example.feature1.screens.habit_add.habitAddRoute

@Composable
fun HabitsNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Habits.route
    ) {
        habitsRoute(navController = navController)
        habitAddRoute(navController = navController)

    }
}
