package com.ripple.ai.ui.chat

sealed class ChatUiState {

    object Idle : ChatUiState()

    object Loading : ChatUiState()

    data class Streaming(
        val response: String
    ) : ChatUiState()

    data class Error(
        val message: String
    ) : ChatUiState()
}