package mollah.yamin.androidmessenger.binding

import androidx.databinding.DataBindingComponent
import mollah.yamin.androidmessenger.binding.BindingAdapters

/**
 * A default binding component implementation for data binding adapters.
 */
class AppDataBindingComponent : DataBindingComponent {
    private val adapter = BindingAdapters()
    override fun getBindingAdapters() = adapter
}
