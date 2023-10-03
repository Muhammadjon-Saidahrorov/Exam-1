package uz.gita.examfinal.app

import android.app.Application
import uz.gita.examfinal.sourse.database.AppDataBase
import uz.gita.examfinal.sourse.local.LocalStorage
import uz.gita.examfinal.sourse.repository.AppRepository

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        LocalStorage.init(this)
        AppRepository.init()
        AppDataBase.init(this)
    }

}