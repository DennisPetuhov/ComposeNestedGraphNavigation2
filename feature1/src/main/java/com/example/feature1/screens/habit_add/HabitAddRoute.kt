package com.example.feature1.screens.habit_add

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature1.navigation.Screens

fun NavGraphBuilder.habitAddRoute(navController: NavController) {
    composable(
        route = Screens.HabitAdd.route,
        content = {
            HabitAddingScreen( navController

            )
        }
    )
}

fun NavController.navigateToAddHabit() {
    navigate(Screens.HabitAdd.route)
}
