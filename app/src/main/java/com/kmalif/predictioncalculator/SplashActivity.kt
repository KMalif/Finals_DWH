package com.kmalif.predictioncalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        showSplash()
    }

    private fun showSplash(){
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java)).also { finish() }
        }, 2000)
    }
}