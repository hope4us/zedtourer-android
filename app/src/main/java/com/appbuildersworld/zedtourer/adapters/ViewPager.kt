package com.appbuildersworld.zedtourer.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.appbuildersworld.zedtourer.fragments.FirstFragment
import com.appbuildersworld.zedtourer.fragments.SecondFragment
import com.appbuildersworld.zedtourer.fragments.ThirdFragment

class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    private val COUNT = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> FirstFragment()
        }
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab " + (position + 1)
    }
}