package com.example.finaltest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPageradapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val NUM_PAGES = 5

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MainFragment()
            1 -> WithFragment()
            2 -> GuestBookFragment()
            3 -> TrapFragment()
            else -> MyPageFragment()
        }
    }
}