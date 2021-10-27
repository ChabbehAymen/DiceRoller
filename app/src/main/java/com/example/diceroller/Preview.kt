package com.example.diceroller

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diceroller.ui.theme.DiceRollerTheme
import com.example.diceroller.ui.theme.Shapes

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() = DiceRollerTheme {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var text by remember { mutableStateOf(2) }
        var myDice = Dice(6)

        Text(
            text = text.toString(),
            fontSize = 35.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { text = myDice.roll() },
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth().padding(end =135.dp ,start = 135.dp)
        ) {
            Text(text = "Roll")
        }
    }

}