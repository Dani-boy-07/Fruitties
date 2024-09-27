package com.example.fruitties.model

sealed class Screens {
     object HomeScreen : Screens()
     data class DetailScreen(val fruittie: Fruittie) : Screens()
}