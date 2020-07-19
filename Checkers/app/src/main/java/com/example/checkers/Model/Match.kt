package com.example.checkers.Model

import android.widget.Button

class Match (
    var player1: Player,
    var player2: Player,
    var movelist: MutableList<String>?,
    var winner: Boolean?
) {

    fun endMatch(play_winner: Boolean){
        when(play_winner){
            winner -> player1.color

            else -> {
                winner = player2.color
            }
        }
    }

    fun addNewMove(las_pos: String, newPos: String){
        this.movelist?.add("$las_pos -> $newPos")
    }

    fun newPoint(pl_piece_dead: Player, pl_piece_point: Player){


    }

}