package dev.tnavarro.app.data.api

interface AiApiService {
    suspend fun sendPropmt(stack: String, question: String): String?
}