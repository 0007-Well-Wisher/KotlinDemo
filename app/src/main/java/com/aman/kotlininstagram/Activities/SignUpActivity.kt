package com.aman.kotlininstagram.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aman.kotlininstagram.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        listeners()
    }

    private fun listeners() {
        signInButton.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }

    }
}
