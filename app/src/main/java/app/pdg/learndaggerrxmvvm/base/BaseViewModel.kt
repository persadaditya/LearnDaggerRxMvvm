package app.pdg.learndaggerrxmvvm.base

import androidx.lifecycle.ViewModel
import app.pdg.learndaggerrxmvvm.injection.component.DaggerViewModelInjector
import app.pdg.learndaggerrxmvvm.injection.component.ViewModelInjector
import app.pdg.learndaggerrxmvvm.injection.module.NetworkModule
import app.pdg.learndaggerrxmvvm.ui.PostListViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}