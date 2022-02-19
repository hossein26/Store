package com.hossein.nikestore.feature.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hossein.nikestore.data.Banner

class BannerSliderAdapter(fragment: Fragment, val banners: List<Banner>) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return banners.size
    }

    override fun createFragment(position: Int): Fragment =
        BannerFragment.newInstance(banners[position])
}