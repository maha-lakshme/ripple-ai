package com.ripple.ai.ui.chat

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ripple.ai.data.remote.RetrofitClient
import com.ripple.ai.data.repository.ChatRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ChatViewModel : ViewModel() {
    private val repo = ChatRepository(RetrofitClient.api)
    private val _response = MutableStateFlow("")
    val response: StateFlow<String> = _response

    fun sendMessage(message: String, apiKey: String) {
        viewModelScope.launch {
            val res = repo.sendMessage(message, apiKey)
            _response.value = res
        }
    }
}
