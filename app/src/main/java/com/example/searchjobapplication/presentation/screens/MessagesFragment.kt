package com.example.searchjobapplication.presentation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.searchjobapplication.R
import com.example.searchjobapplication.databinding.FragmentMessagesBinding

class MessagesFragment: Fragment(R.layout.fragment_messages) {
    private lateinit var binding: FragmentMessagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return FragmentMessagesBinding.inflate(inflater, container, false).let {
            binding = it
            it.root
        }
    }
}