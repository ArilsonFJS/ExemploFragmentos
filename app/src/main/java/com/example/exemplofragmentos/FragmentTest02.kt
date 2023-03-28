package com.example.exemplofragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alert
import com.example.exemplofragmentos.R
import com.example.exemplofragmentos.databinding.FragmentTest01Binding
import com.example.exemplofragmentos.databinding.FragmentTest02Binding

class FragmentTest02 : Fragment() {
        lateinit var binding: FragmentTest02Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentTest02Binding.inflate(inflater)

        binding.button.setOnClickListener {
            alert("Olá", "Olá do fragmento 02", requireContext())
        }

        return binding.root

    }


            }
