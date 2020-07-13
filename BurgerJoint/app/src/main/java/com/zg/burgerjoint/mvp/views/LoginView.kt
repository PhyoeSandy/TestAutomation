package com.zg.burgerjoint.mvp.views

/**
 * Created by Phyoe Sandy Soe Tun
 * on 7/13/2020.
 */
interface LoginView : BaseView {
    fun navigateToMainScreen()
    fun showErrorMessage(message : String)
}