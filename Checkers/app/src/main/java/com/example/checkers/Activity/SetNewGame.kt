package com.example.checkers.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.checkers.Model.Board
import com.example.checkers.Model.Match
import com.example.checkers.Model.Piece
import com.example.checkers.Model.Player
import com.example.checkers.R
import kotlinx.android.synthetic.main.activity_set__new_game.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.launch


class SetNewGame : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set__new_game)

        newgame_select_group_1.setOnCheckedChangeListener{ _ , checked -> onColorSelected(checked) }
        newgame_start_button.setOnClickListener{ createMatch() }

    }


    private fun onColorSelected( checked: Int){

        when(checked){
            white_1.id -> newgame_p2_choice.text = getString(R.string.black_pieces)
            black_1.id -> newgame_p2_choice.text = getString(R.string.white_pieces)
        }

    }

    private fun createMatch() {

        startNewGame()

    }

    fun startNewGame(){
        val intent = Intent(this, GameBoard::class.java)
        startActivity(intent)
    }
















}
