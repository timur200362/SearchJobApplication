package com.example.searchjobapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.navigation.NavController

import com.example.searchjobapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var controller: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        controller = (
                supportFragmentManager.findFragmentById(R.id.host_fragment) as NavHostFragment
                ).navController
        binding.run {
            bnvMain.setupWithNavController(controller)
        }
    }
}