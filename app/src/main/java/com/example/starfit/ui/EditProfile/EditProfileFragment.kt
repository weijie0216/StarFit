@file:Suppress("DEPRECATION")

package com.example.starfit.ui.EditProfile

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
import com.example.starfit.ui.EditProfile.EditProfileViewModel

class EditProfileFragment : Fragment() {

    private lateinit var viewModel: EditProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProviders.of(this).get(EditProfileViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_editprofile, container, false)


        return root
    }
}