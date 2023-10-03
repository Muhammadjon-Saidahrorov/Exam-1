@file:Suppress("DEPRECATION")

package uz.gita.examfinal.ui.screens.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import kotlinx.coroutines.*
import uz.gita.examfinal.R
import uz.gita.examfinal.sourse.repository.AppRepository
import uz.gita.examfinal.ui.screens.main.MainActivity
import uz.gita.examfinal.ui.screens.BoardingScreen
import uz.gita.examfinal.utils.addFragmentActivity

class SplashActivity : AppCompatActivity() {
    private val appRepository: AppRepository? = AppRepository.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler(Looper.getMainLooper()).postDelayed({
            if (appRepository?.getFirst() == true) {
                addFragmentActivity(BoardingScreen())
            } else {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }
        }, 2000)

}
}