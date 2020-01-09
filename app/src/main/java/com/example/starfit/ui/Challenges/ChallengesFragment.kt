@file:Suppress("DEPRECATION")

package com.example.starfit.ui.Challenges

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
import com.example.starfit.ui.Challenges.ChallengesViewModel

class ChallengesFragment : Fragment() {

    private lateinit var challengesViewModel: ChallengesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        challengesViewModel =
            ViewModelProviders.of(this).get(challengesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_challenges, container, false)


        return root
    }
}