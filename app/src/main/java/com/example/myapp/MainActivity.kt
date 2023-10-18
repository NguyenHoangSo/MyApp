 package com.example.myapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapp.R.id.button_AM
import com.example.myapp.R.id.txtView

 class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button_AM)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

     private fun rollDice() {
//         TODO("Not yet implemented")
         val dice = Dice(6)
         val diceRoll = dice.roll()
         val resultTextView: TextView = findViewById(R.id.txtView)
         resultTextView.text = diceRoll.toString()
     }

     class Dice(val numSide: Int){
        fun roll(): Int{
            return (1..numSide).random()
        }
    }

}