package dev.tnavarro.app.data.datasource

interface AIChatRemoteDataSource {

    suspend fun sendPrompt(stack: String, question: String): String?
}