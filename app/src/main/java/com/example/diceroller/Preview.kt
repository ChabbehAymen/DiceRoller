package com.example.diceroller

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diceroller.ui.theme.DiceRollerTheme
import com.example.diceroller.ui.theme.Shapes


@Composable
fun DefaultPreview(context:Context) = DiceRollerTheme {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        //variable that holds the value of the imges to display
        var diceImage by remember { mutableStateOf( R.drawable.dice_1 ) }
        var myDice = Dice()//Dice object

        Image(painter = painterResource(id = diceImage), contentDescription = null)//imageView that displays the dice images

        Spacer(modifier = Modifier.height(30.dp))//spacer to make space between the image and the button

        Button(
            onClick = {
                diceImage= myDice.roll()// the method roll() from dice object that pic random image to display
                Toast.makeText( context,"The Dice Rolled",Toast.LENGTH_SHORT).show()
                      },
            shape = CircleShape,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 135.dp, start = 135.dp)
        ) {
            Text(text = "Roll")//the text of the button
        }
    }

}