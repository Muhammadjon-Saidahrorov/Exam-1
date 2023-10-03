package uz.gita.examfinal.sourse.local

import android.content.Context
import android.content.SharedPreferences

class LocalStorage(context: Context) {

    private var preferences: SharedPreferences? = null
    private var editor: SharedPreferences.Editor? = null

    init {
        preferences = context.getSharedPreferences("EXAMFINAL", Context.MODE_PRIVATE)
        editor = preferences?.edit()
    }


    companion object {
        private var localStorge: LocalStorage? = null

        fun getInstance(): LocalStorage? {
            return localStorge
        }

        fun init(context: Context) {
            if (localStorge == null) localStorge = LocalStorage(context)
        }

    }

    fun saveEmail() {
        editor?.putString("EMAIL", "user22")?.apply()
    }

    fun getEmail(): String? {
        return preferences?.getString("EMAIL", "")
    }

    fun savePassword() {
        editor?.putString("PASSWORD", "12345")?.apply()
    }

    fun getPassword(): String? {
        return preferences?.getString("PASSWORD", "")
    }

    fun saveFirst(b: Boolean) {
        editor?.putBoolean("FIRST", b)?.apply()
    }

    fun getFirst(): Boolean? {
        return preferences?.getBoolean("FIRST", true)
    }

}