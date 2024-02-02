package com.example.feature2.navigation

sealed class Screens(val route: String) {
    object Todos : Screens("todos")
    object TodoAdd : Screens("add_todo")

}
