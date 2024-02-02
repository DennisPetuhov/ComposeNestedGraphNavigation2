package com.example.feature1.screens.habits

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature1.navigation.Screens


fun NavGraphBuilder.habitsRoute(navController: NavController) {
    composable(
        route = Screens.Habits.route,
        content = {
            HabitsScreen(
                navController = navController,
            )
        }
    )
}
