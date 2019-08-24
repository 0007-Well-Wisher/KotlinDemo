package com.aman.kotlininstagram.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aman.kotlininstagram.R
import kotlinx.android.synthetic.main.activity_account_settings.*

class AccountSettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_settings)
        listeners()
    }

    private fun listeners() {
        closeProfileImageView?.setOnClickListener {
            finish()
        }
    }
}
