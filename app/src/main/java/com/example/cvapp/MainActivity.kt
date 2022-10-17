package com.example.cvapp

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.FragmentManager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_contact.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myPageAdapter = MyPageAdapter(this)
        vpager.adapter = myPageAdapter
        tlayout.tabGravity = TabLayout.GRAVITY_FILL

        TabLayoutMediator(tlayout, vpager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Home"
                }
                1 -> {
                    tab.text = "Detail"
                }
                2 -> {
                    tab.text = "Contact"
                }
            }
        }.attach()
    }

}