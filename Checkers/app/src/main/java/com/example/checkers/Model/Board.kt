package com.example.checkers.Model

import android.widget.ImageButton

object Board {

    val cols:List<Char> = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')
    val rows:List<Char> = listOf('1', '2', '3', '4', '5', '6', '7', '8')

    lateinit var board: Array<Array<ImageButton>>

    lateinit var Player_1: Player
    lateinit var Player_2: Player

    lateinit var Match: Match

}