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
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        var diceImage by remember { mutableStateOf( R.drawable.dice_1 ) }
        var myDice = Dice(6)

        Image(painter = painterResource(id = diceImage), contentDescription = null)

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                diceImage= myDice.roll()
                Toast.makeText( context,"The Dice Rolled",Toast.LENGTH_SHORT).show()
                      },
            shape = CircleShape,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 135.dp, start = 135.dp)
        ) {
            Text(text = "Roll")
        }
    }

}