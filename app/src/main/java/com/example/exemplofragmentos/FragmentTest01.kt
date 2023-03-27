package com.example.exemplofragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.exemplofragmentos.databinding.FragmentTest01Binding


class FragmentTest01 : Fragment() {

    lateinit var binding: FragmentTest01Binding

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {

        binding = FragmentTest01Binding.inflate(inflater)

        binding.button.setOnClickListener {

        }

         return binding.root
    }
}