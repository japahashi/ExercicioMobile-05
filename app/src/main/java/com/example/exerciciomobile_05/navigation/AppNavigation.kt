
package com.example.exerciciomobile_05.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.exerciciomobile_05.screens.StartScreen
import com.example.exerciciomobile_05.screens.QuizScreen

object Routes {
    const val START = "start"
    const val QUIZ = "quiz"
}

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.START,
        modifier = modifier
    ) {
        composable(Routes.START) {
            StartScreen(
                onStartClick = {
                    navController.navigate(Routes.QUIZ)
                }
            )
        }

        composable(Routes.QUIZ) {
            QuizScreen()
        }
    }
}


