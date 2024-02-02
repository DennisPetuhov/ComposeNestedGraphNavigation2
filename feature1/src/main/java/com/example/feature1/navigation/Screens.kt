package com.example.feature1.navigation

sealed class Screens(val route: String) {
    object Habits : Screens("habits")
    object HabitAdd : Screens("add_habit")

}
