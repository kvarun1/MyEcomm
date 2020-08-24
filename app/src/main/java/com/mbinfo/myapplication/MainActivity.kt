package com.mbinfo.myapplication




import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener


class MainActivity : AppCompatActivity() {
    private var tabLayout: TabLayout? = null
    private var container: LinearLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Sign UP"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Login"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("ForgotPassword"))
        //replace default fragment

        //replace default fragment
        replaceFragment(SignUpFragment())
        //handling tab click event

        //handling tab click event
        tabLayout!!.setOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                if (tab.position == 0) {
                    replaceFragment(SignUpFragment())
                } else if (tab.position == 1) {
                    replaceFragment(Login())
                } else {
                    replaceFragment(Forgot())
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

    }


    private fun replaceFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()
        // Replace the fragment on container
        transaction.replace(R.id.fragment_container,fragment)
        transaction.addToBackStack(null)
        // Finishing the transition
        transaction.commit()
    }


}




