package uz.gita.examfinal.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.gita.examfinal.fragments.CategoryFragment
import uz.gita.examfinal.fragments.ChannelFragment

class MyViewPagerAdapter(fmActivity: FragmentActivity) : FragmentStateAdapter(fmActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CategoryFragment()
            1 -> ChannelFragment()
            else -> CategoryFragment()
        }
    }
}