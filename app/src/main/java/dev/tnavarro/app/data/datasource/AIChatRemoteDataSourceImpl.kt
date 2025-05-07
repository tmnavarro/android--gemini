package dev.tnavarro.app.data.datasource

import dev.tnavarro.app.data.api.AiApiService

class AIChatRemoteDataSourceImpl(
    private val aiApiService: AiApiService
): AIChatRemoteDataSource {

    override suspend fun sendPrompt(stack: String, question: String): String? =
        aiApiService.sendPropmt(stack, question)

}