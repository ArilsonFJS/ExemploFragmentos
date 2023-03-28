package com.example.exemplofragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.exemplofragmentos.databinding.ActivityDynamicBinding

class DynamicActivity : AppCompatActivity() {
    lateinit var binding: ActivityDynamicBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityDynamicBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonFrag01.setOnClickListener {
            val fragment = FragmentTest01()
            supportFragmentManager.beginTransaction().replace(R.id.fragContainer, fragment).commit()

        }
        binding.buttonFrag02.setOnClickListener {
            val fragment = FragmentTest02()
            supportFragmentManager.beginTransaction().replace(R.id.fragContainer,fragment).commit()
        }
    }
}