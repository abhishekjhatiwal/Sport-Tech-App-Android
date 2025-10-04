package com.example.sporttechapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.sporttechapp.screen.SkillsScreen
import com.example.sporttechapp.ui.theme.SportTechAppTheme

class MainActivity : ComponentActivity() {
    private val skillViewModel: SkillViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportTechAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  //  SkillsScreen(skillViewModel)
                    SkillsScreen()
                }
            }
        }
    }
}

