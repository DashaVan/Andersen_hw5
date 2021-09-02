package spacekotlin.vaniukova.fragmentscontactlist

import androidx.fragment.app.Fragment

interface Navigator {
    fun navigateTo(fragment: Fragment, name: String)
    fun navigateToTabletDetail(fragment: Fragment, name: String)
}