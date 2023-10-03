package uz.gita.examfinal.ui.screens.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import uz.gita.examfinal.*
import uz.gita.examfinal.databinding.ActivityMainBinding
import uz.gita.examfinal.Account

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragmentMain(Home())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.home -> replaceFragmentMain(Home())
                R.id.discover -> replaceFragmentMain(Discover())
                R.id.browse -> replaceFragmentMain(Browse())
                R.id.account -> replaceFragmentMain(Account())

                else ->{

                }

            }

            true

        }


    }

    private fun replaceFragmentMain(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }

}