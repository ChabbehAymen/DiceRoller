package com.example.diceroller

class Dice (){

    /**
     * Roll the dice and update the screen with the result.
     */
    fun roll():Int{
        val dices:IntArray= intArrayOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
        )
        return dices.random()
    }

}