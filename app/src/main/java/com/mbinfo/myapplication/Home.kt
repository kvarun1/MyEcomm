package com.mbinfo.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.home.*

class Home :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                   // setContent("Home")
                    true
                }
                R.id.navigation_sms -> {
                   // setContent("Notification")
                    true
                }
                R.id.navigation_notifications -> {
                   // setContent("Search")
                    true
                }
                R.id.navigation_more -> {
                   // setContent("Profile")
                    true
                }
                else -> false
            }

        }
    }
}