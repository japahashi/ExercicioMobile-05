
package com.example.exerciciomobile_05.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exerciciomobile_05.R

@Composable
fun QuizScreen() {

    var respostaSelecionada by remember {
        mutableIntStateOf(-1)
    }

    val pergunta = "Qual é a capital da França?"

    val alternativas = listOf(
        "Londres",
        "Berlim",
        "Paris",
        "Madri"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE892E0))
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Logo do Quizatron",
            modifier = Modifier.size(80.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))


        Card(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .border(
                    2.dp,
                    Color.Black,
                    RoundedCornerShape(15.dp)
                ),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF6DCC94)


            )
        ) {
            Text(
                text = "Pergunta 1 de 3",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                fontSize = 25.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(20.dp))


        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {


                Text(
                    text = pergunta,
                    fontSize = 22.sp,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(4.dp))


                alternativas.forEachIndexed { index, alternativa ->

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                respostaSelecionada = index
                            }
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(12.dp)
                            ),
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(
                            containerColor =
                                if (respostaSelecionada == index) {
                                    Color.White
                                } else {
                                    Color.White
                                }
                        )
                    ) {
                        Text(
                            text = alternativa,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            fontSize = 17.sp,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}
