package uz.gita.examfinal.utils

import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.screens.main.MainActivity

fun FragmentActivity.addFragmentActivity(fm: Fragment) {
    supportFragmentManager.beginTransaction()
        .add(R.id.contanir, fm)
        .commit()
}

fun FragmentActivity.replaceFragmentSaveStackActivity(fm: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(R.id.contanir, fm)
        .addToBackStack(fm::class.java.name)
        .commit()
}

fun FragmentActivity.replaceFragmentActivity(fm: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(R.id.contanir, fm)
        .commit()
}


fun FragmentActivity.closeFragmentActivity() {
    supportFragmentManager.popBackStack()
}

fun FragmentActivity.myIntentActivity() {
    startActivity(Intent(this, MainActivity::class.java))
    finish()
}

////////////

fun Fragment.addFragment(fm: Fragment) {
    requireActivity().addFragmentActivity(fm)
}

fun Fragment.replaceFragmentSaveStack(fm: Fragment) {
    requireActivity().replaceFragmentSaveStackActivity(fm)
}

fun Fragment.replaceFragment(fm: Fragment) {
    requireActivity().replaceFragmentActivity(fm)
}

fun Fragment.closeFragment() {
    requireActivity().closeFragmentActivity()
}

fun Fragment.myIntent() {
    requireActivity().myIntentActivity()
}