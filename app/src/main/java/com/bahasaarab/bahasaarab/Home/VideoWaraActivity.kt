package com.bahasaarab.bahasaarab.Home

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.accessibility.AccessibilityViewCommand
import com.bahasaarab.bahasaarab.R
import kotlinx.android.synthetic.main.activity_video_wara.*

class VideoWaraActivity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_wara)

        val scale = AnimationUtils.loadAnimation(this,R.anim.scale)
        val trans = AnimationUtils.loadAnimation(this,R.anim.translate)

        val bab1 = findViewById<View>(R.id.bab1video1) as LinearLayout
        val bab2 = findViewById<View>(R.id.bab2video2) as LinearLayout
        val bab3 = findViewById<View>(R.id.bab3video3) as LinearLayout
        val bab4 = findViewById<View>(R.id.bab4video4) as LinearLayout
        val bab5 = findViewById<View>(R.id.bab5video5) as LinearLayout
        val bab6 = findViewById<View>(R.id.bab6video6) as LinearLayout
        val bab7 = findViewById<View>(R.id.linervideo) as LinearLayout

        bab1.startAnimation(trans)
        bab2.startAnimation(trans)
        bab3.startAnimation(trans)
        bab4.startAnimation(trans)
        bab5.startAnimation(trans)
        bab6.startAnimation(trans)
        bab7.startAnimation(scale)

        back.setOnClickListener {
            val intent = Intent(this@VideoWaraActivity,
            MenuAwalActivity::class.java)
            startActivity(intent)
            finish()
        }

        bab1video1.setOnClickListener {
            val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=r7tS7mfcoeA"))
            startActivity(i)
        }

        bab2video2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1lBHObtc9Us"))
            startActivity(i)
        }

        bab3video3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=A9GNCqy6_wM&list=UU3Jn_xc2D6l_jXMjylzjg0Q&index=3"))
            startActivity(i)
        }

        bab4video4.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=F-rA1oXRpcE&list=UU3Jn_xc2D6l_jXMjylzjg0Q&index=2"))
            startActivity(i)
        }

        bab5video5.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NrOKrBwjxlw&list=UU3Jn_xc2D6l_jXMjylzjg0Q&index=1"))
            startActivity(i)
        }

        bab6video6.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=l6hzsxHbypQ&list=UU3Jn_xc2D6l_jXMjylzjg0Q&index=11"))
            startActivity(i)
        }
    }

    override fun onBackPressed() {
        if (backPressedTime + 4000 > System.currentTimeMillis()) {
            backToast!!.cancel()
            super.onBackPressed()
            return
        }

        else {
            backToast = Toast.makeText(baseContext,"tekan tombol back di atas",Toast.LENGTH_LONG)
            backToast!!.show()
        }

        backPressedTime = System.currentTimeMillis()
    }
}