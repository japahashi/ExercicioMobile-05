package com.example.exerciciomobile_05.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exerciciomobile_05.R

@Composable
fun StartScreen(
    onStartClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF17DBFF)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.quiz),
            contentDescription = "Logo do Quizatron 3000",
            modifier = Modifier.size(120.dp)
        )

        Spacer(modifier = Modifier.height(80.dp))

        Text(
            text = "QUIZATRON 3000",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(45.dp))

        Button(
            onClick = onStartClick,
            modifier = Modifier
                .size(width = 250.dp, height = 50.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(40.dp)
                ),
            shape = RoundedCornerShape(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFDD00),
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "COMEÇAR!",
                fontSize = 20.sp
            )
        }
    }
}
