package com.example.checkers.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.checkers.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu_newgame_btn.setOnClickListener { onNewGameClicked()}

    }


    fun onNewGameClicked(){
        val intent = Intent(this, SetNewGame::class.java)
        startActivity(intent)
    }

    fun onContinueClicked(){
        val intent = Intent(this, SetNewGame::class.java)
        startActivity(intent)
    }

    fun onOptionsClicked(){
        val intent = Intent(this, Options::class.java)
        startActivity(intent)
    }

}
