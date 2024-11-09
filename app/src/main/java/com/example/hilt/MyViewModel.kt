package com.example.hilt

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    repository: MyRepository,
) : ViewModel() {
    val message = repository.getWelcomeMessage()
}
