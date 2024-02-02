package com.example.composenestedgraphnavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature1.navigation.HabitsNavGraph
import com.example.feature2.navigation.TodosNavGraph

fun NavGraphBuilder.todosNavRoute() {
    composable(
        route = MainScreens.TodosNavGraph.route,
        content = {
            TodosNavGraph()
        }
    )
}

fun NavGraphBuilder.habitsNavRoute() {
    composable(
        route = MainScreens.HabitsNavGraph.route,
        content = {
            HabitsNavGraph()
        }
    )
}

