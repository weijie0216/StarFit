@file:Suppress("DEPRECATION")

package com.example.starfit.ui.reminder

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
import com.example.starfit.ui.reminder.ReminderViewModel

class ReminderFragment : Fragment() {

    private lateinit var reminderViewModel: ReminderViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        reminderViewModel =
            ViewModelProviders.of(this).get(ReminderViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_reminder, container, false)

        return root
    }
}