package com.example.sporttechapp.screen

import androidx.compose.foundation.layout.Column
//import androidx.compose.material3.CircularProgressIndicator
//import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.getValue
//import com.example.sporttechapp.SkillUiState
//import com.example.sporttechapp.SkillViewModel
import com.example.sporttechapp.data.SampleData

/*
@Composable
fun SkillsScreen(viewModel: SkillViewModel) {
    val state by viewModel.uiState.collectAsState()

    when (state) {
        is SkillUiState.Loading -> {
            CircularProgressIndicator()
        }
        is SkillUiState.Error -> {
            Text(text = "Error: ${(state as SkillUiState.Error).message}")
        }
        is SkillUiState.Success -> {
            val skills = (state as SkillUiState.Success).skills
            val basicSkills = skills.filter { it.level == "Basic" }
            val intermediateSkills = skills.filter { it.level == "Intermediate" }
            val advancedSkills = skills.filter { it.level == "Advanced" }

            Column {
                SkillSection("Basic", basicSkills)
                SkillSection("Intermediate", intermediateSkills)
                SkillSection("Advanced", advancedSkills)
            }
        }
    }
}

*/






















@Composable
fun SkillsScreen() {
    val allSkills = SampleData.skills

    val basicSkills = allSkills.filter { it.level == "Basic" }
    val intermediateSkills = allSkills.filter { it.level == "Intermediate" }
    val advancedSkills = allSkills.filter { it.level == "Advanced" }

    Column {
        SkillSection("Basic", basicSkills)
        SkillSection("Intermediate", intermediateSkills)
        SkillSection("Advanced", advancedSkills)
    }
}
