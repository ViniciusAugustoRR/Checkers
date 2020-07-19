package com.example.checkers.Model

data class Player (

    var color: Boolean,
    var points: Int,
    var pieces: MutableList<Piece>,
    var timeLeft: Int?

){



}