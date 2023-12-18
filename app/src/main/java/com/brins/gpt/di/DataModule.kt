package com.brins.gpt.di

import com.brins.gpt.repository.GPTChannelRepositoryImpl
import com.brins.gpt.repository.GPTMessageRepositoryImpl
import com.brins.gpt.repository.IGPTChannelRepository
import com.brins.gpt.repository.IGPTMessageRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindGPTChatMessageRepository(gptChatMessageRepository: GPTMessageRepositoryImpl): IGPTMessageRepository


    @Binds
    fun bindGPTChannelRepository(gptChannelRepositoryImpl: GPTChannelRepositoryImpl): IGPTChannelRepository
}