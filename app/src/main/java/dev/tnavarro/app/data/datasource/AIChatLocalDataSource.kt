package dev.tnavarro.app.data.datasource

import dev.tnavarro.app.data.local.database.AIChatTextEntity
import kotlinx.coroutines.flow.Flow

interface AIChatLocalDataSource {

    val aiCurrentChatBySelectedStack: Flow<List<AIChatTextEntity>>

    suspend fun insertAIChatConversation(question: AIChatTextEntity, answer: String) {

    }
}