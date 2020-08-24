package com.mbinfo.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*

class Login : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Get the custom view for this fragment layout
        val view = inflater!!.inflate(R.layout.login,container,false)
        view.sign.setOnClickListener {
            val i = Intent(activity, Home::class.java)
            startActivity(i)
        }
        return view
    }
}