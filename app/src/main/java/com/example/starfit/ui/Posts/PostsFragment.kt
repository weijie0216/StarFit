@file:Suppress("DEPRECATION")

package com.example.starfit.ui.Posts

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
import com.example.starfit.ui.Posts.PostsViewModel

class PostsFragment : Fragment() {

    private lateinit var postsViewModel: PostsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        postsViewModel =
            ViewModelProviders.of(this).get(postsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_posts, container, false)
        val textView: TextView = root.findViewById(R.id.text_send)
        postsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}