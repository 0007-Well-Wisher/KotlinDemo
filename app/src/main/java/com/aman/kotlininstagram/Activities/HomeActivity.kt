package com.aman.kotlininstagram.Activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.aman.kotlininstagram.Fragments.*
import com.aman.kotlininstagram.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    val homeFragment = HomeFragment()
    val searchFragment = SearchFragment()
    val addPostFragment = AddPostFragment()
    val notificationFragment = NotificationFragment()
    val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listeners()
        addFragment(
            homeFragment, R.id.fragmentContainerFrameLayout
        )
    }

    fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int) {
        supportFragmentManager.inTransaction { add(frameId, fragment) }
    }

    fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) {
        supportFragmentManager.inTransaction { replace(frameId, fragment) }
    }

    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().func().commit()
    }

    val clickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.homeTabLinearLayout -> replaceFragment(
                homeFragment,
                R.id.fragmentContainerFrameLayout
            )
            R.id.searchTabLinearLayout -> replaceFragment(
                searchFragment,
                R.id.fragmentContainerFrameLayout
            )
            R.id.addPostLinearLayout -> replaceFragment(
                addPostFragment,
                R.id.fragmentContainerFrameLayout
            )
            R.id.notificationTabLinearLayout -> replaceFragment(
                notificationFragment,
                R.id.fragmentContainerFrameLayout
            )
            R.id.profileTabLinearLayout -> replaceFragment(
                profileFragment,
                R.id.fragmentContainerFrameLayout
            )
        }
    }

    private fun listeners() {
        homeTabLinearLayout?.setOnClickListener(clickListener)
        searchTabLinearLayout?.setOnClickListener(clickListener)
        addPostLinearLayout?.setOnClickListener(clickListener)
        notificationTabLinearLayout?.setOnClickListener(clickListener)
        profileTabLinearLayout?.setOnClickListener(clickListener)
    }
}