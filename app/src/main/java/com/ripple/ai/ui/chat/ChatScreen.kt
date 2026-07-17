package com.ripple.ai.ui.chat

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ChatScreen(apiKey: String, viewModel: ChatViewModel = viewModel()) {
    var message by remember { mutableStateOf("") }
    val response by viewModel.response.collectAsState()

    Column {
        OutlinedTextField(
            value = message,
            onValueChange = { message = it },
            label = { Text("Ask Ripple") }
        )
        Button(onClick = { viewModel.sendMessage(message, apiKey) }) {
            Text("Send")
        }
        Text(response)
    }
}