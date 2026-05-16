package com.ripple.ai.data.remote

interface GeminiApiService {

    @POST("YOUR_ENDPOINT")
    suspend fun generateContent(
        @Body request: GeminiRequest
    ): GeminiResponse
}