@file:Suppress("DEPRECATION")


package com.example.starfit.ui.Language

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.starfit.R
import com.example.starfit.ui.Language.LanguageViewModel

class LanguageFragment : Fragment() {

    private lateinit var languageViewModel: LanguageViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        languageViewModel =
            ViewModelProviders.of(this).get(LanguageViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_language, container, false)


        return root
    }
}