package com.ripple.ai.data.repository

import com.ripple.ai.data.model.Content
import com.ripple.ai.data.model.GeminiRequest
import com.ripple.ai.data.model.Part
import com.ripple.ai.data.remote.GeminiApiService

class ChatRepository(private val apiService: GeminiApiService) {
    suspend fun sendMessage(message: String, apiKey: String): String {
        val request = GeminiRequest(
            contents = listOf(
                Content(
                    parts = listOf(Part(text = message))
                )
            )
        )
        val response = apiService.generateContent(apiKey, request)
        return response.canditates.firstOrNull()
            ?.contents?.firstOrNull()
            ?.parts?.firstOrNull()
            ?.text
            ?: ""
    }
}
