package mollah.yamin.androidmessenger.app

import android.app.Application
import androidx.databinding.DataBindingUtil
import mollah.yamin.androidmessenger.binding.AppDataBindingComponent

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DataBindingUtil.setDefaultComponent(AppDataBindingComponent())
    }
}