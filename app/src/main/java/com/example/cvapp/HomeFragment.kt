package com.example.cvapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.fabLink.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com"))
            startActivity(intent)
        }
        view.fabGit.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com"))
            startActivity(intent)
        }
        view.fabStack.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://stackoverflow.com"))
            startActivity(intent)
        }
        view.fabTwit.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"))
            startActivity(intent)
        }
        return view
    }

}