package com.appbuildersworld.zedtourer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appbuildersworld.zedtourer.adapters.ViewPagerAdapter
import com.appbuildersworld.zedtourer.databinding.ActivityOnboardBinding

class OnboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupViewPager()
    }

    private fun setupViewPager() {
        val viewPager = binding.viewPager
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
    }
}