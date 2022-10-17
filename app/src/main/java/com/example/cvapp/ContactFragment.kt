package com.example.cvapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.fragment_contact.view.*

class ContactFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        view.btnSend.setOnClickListener {
            makeEmail()
        }
        view.btnCall.setOnClickListener {
            makeCall()
        }

        return view
    }

    private fun makeEmail() {
        val to = getString(R.string.email_to)
        val sub = etSubject.text.toString()
        val mes = etMessage.text.toString()
        val intent = Intent(
            Intent.ACTION_SENDTO, Uri.parse("mailto:$to?&subject=$sub&body=$mes"
            )
        )
        startActivity(intent)
    }

    private fun makeCall() {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:+6413333333"))
        startActivity(intent)
    }

}