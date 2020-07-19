package com.example.checkers.Model

data class Piece (
    var id: Int,
    var color: Boolean,
    var col_row: String?,
    var is_defeated: Boolean,
    var is_queen: Boolean
){

    fun becomeQueen(){
        this.is_queen = true
    }

    fun becomeDeafeated(){
        this.is_defeated = true
    }

    fun newPosition(col: Char, row: Int){
        this.col_row = "$col:$row"
    }

}