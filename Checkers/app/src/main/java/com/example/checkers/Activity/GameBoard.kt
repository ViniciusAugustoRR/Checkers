package com.example.checkers.Activity

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.get
import com.example.checkers.Model.Board
import com.example.checkers.R
import kotlinx.android.synthetic.main.activity_game__board.*

class GameBoard : AppCompatActivity(){

    private var cells: ArrayList<Drawable> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game__board)

        ingame_board.post{
            createBoard()
        }

    }


    fun load_resources(){
        cells.add(resources.getDrawable(R.drawable.white_empty_cell))
        cells.add(resources.getDrawable(R.drawable.black_empty_cell))
        cells.add(resources.getDrawable(R.drawable.black_red_piece))
        cells.add(resources.getDrawable(R.drawable.black_blue_piece))
    }

    fun createBoard() {

        load_resources()

        Board.board = Array(8){
            Array(8){
                ImageButton(baseContext)
            }
        }


        // Setting size of rows and cells to be added to the view
        val params_row: LinearLayout.LayoutParams = LinearLayout.LayoutParams(ingame_board.width, ingame_board.width / 8)
        val params_cell: LinearLayout.LayoutParams = LinearLayout.LayoutParams(ingame_board.width / 8, ingame_board.width / 8)


        //Rows
        repeat(8){ r -> r + 1
            //Row
            val row = LinearLayout(baseContext)
            //Columns
            repeat(8) { c -> c + 1

                //Creating cell item
                when ((c + r) % 2 == 0) {
                    true -> {
                        //WHITE CELLS
                        Board.board[r][c].background = cells[0]
                    }
                    else -> {
                        when( r in 0..2){
                            //BLUE PIECES
                            true -> Board.board[r][c].background = cells[2]

                            else -> {
                                when(r in 5..7){
                                    //RED PIECES
                                    true ->  Board.board[r][c].background = cells[3]

                                    //BLACK CELLS
                                    else ->  Board.board[r][c].background = cells[1]
                                }
                            }
                        }
                    }
                }

                row.addView(Board.board[r][c], params_cell)
            }
            //Adding to main view
            ingame_board.addView(row, params_row)
        }


    }




}
