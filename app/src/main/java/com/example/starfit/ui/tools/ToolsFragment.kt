@file:Suppress("DEPRECATION")

package com.example.starfit.ui.slideshow

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
import com.example.starfit.ui.slideshow.SlideshowViewModel
import com.example.starfit.ui.tools.ToolsViewModel

class ToolsFragment : Fragment() {

    private lateinit var toolsViewModel: ToolsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        toolsViewModel =
            ViewModelProviders.of(this).get(toolsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tools, container, false)


        return root
    }
}