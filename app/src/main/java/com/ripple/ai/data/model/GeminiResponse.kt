package com.ripple.ai.data.model

data class GeminiResponse(
    val canditates:List<Candidates>

)
data class Candidates(
    val contents:List<Content>
)
data class Contents(
    val parts:List<Parts>
)
data class Parts(
    val text:String
)
