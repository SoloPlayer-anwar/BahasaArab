package com.bahasaarab.bahasaarab.materivideo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.bahasaarab.bahasaarab.Ob3Activity
import com.bahasaarab.bahasaarab.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_bab1)

        val rotate = AnimationUtils.loadAnimation(this,R.anim.rotate)
        val splash = findViewById<View>(R.id.splash) as ImageView

        splash.startAnimation(rotate)

        var handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashScreenActivity,
                Ob3Activity::class.java)
            startActivity(intent)
            finish()
        }, 4000)

    }
}