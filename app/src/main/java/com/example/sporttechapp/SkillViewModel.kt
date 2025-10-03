package com.example.sporttechapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sporttechapp.data.RetrofitInstance
import com.example.sporttechapp.data.Skill
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

sealed class SkillUiState {
    object Loading : SkillUiState()
    data class Success(val skills: List<Skill>) : SkillUiState()
    data class Error(val message: String) : SkillUiState()
}

class SkillViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<SkillUiState>(SkillUiState.Loading)
    val uiState: StateFlow<SkillUiState> = _uiState

    init {
        fetchSkills()
    }

    private fun fetchSkills() {
        viewModelScope.launch {
            try {
                val skills = RetrofitInstance.api.getSkills()
                _uiState.value = SkillUiState.Success(skills)
            } catch (e: Exception) {
                _uiState.value = SkillUiState.Error(e.localizedMessage ?: "Unknown Error")
            }
        }
    }
}
