package uz.gita.examfinal.sourse.repository

import uz.gita.examfinal.sourse.local.LocalStorage

class AppRepository private constructor() {

    private var localStorage: LocalStorage? = LocalStorage.getInstance()
    init {
        localStorage?.saveEmail()
        localStorage?.savePassword()
    }

    companion object {
        private var appRepository: AppRepository? = null

        fun init() {
            if (appRepository == null) appRepository = AppRepository()
        }

        fun getInstance(): AppRepository? {
            return appRepository
        }
    }

    fun getEmail(): String?{
        return localStorage?.getEmail()
    }

    fun getPassword():String?{
        return localStorage?.getPassword()
    }

    fun saveFirst(b: Boolean) {
        localStorage?.saveFirst(b)
    }

    fun getFirst(): Boolean? {
        return localStorage?.getFirst()
    }
}