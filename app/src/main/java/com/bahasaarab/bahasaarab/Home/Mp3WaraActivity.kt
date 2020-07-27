package com.bahasaarab.bahasaarab.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.Toast
import com.bahasaarab.bahasaarab.R
import com.bahasaarab.bahasaarab.materisuara.*
import kotlinx.android.synthetic.main.activity_mp3_wara.*

class Mp3WaraActivity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mp3_wara)

        val scale = AnimationUtils.loadAnimation(this,R.anim.scale)
        val trans = AnimationUtils.loadAnimation(this,R.anim.translate)

        val bab1 = findViewById<View>(R.id.bab1Mp3) as LinearLayout
        val bab2 = findViewById<View>(R.id.bab2mp3) as LinearLayout
        val bab3 = findViewById<View>(R.id.bab3mp3) as LinearLayout
        val bab4 = findViewById<View>(R.id.bab4mp3) as LinearLayout
        val bab5 = findViewById<View>(R.id.bab5mp3) as LinearLayout
        val bab6 = findViewById<View>(R.id.bab6mp3) as LinearLayout
        val bab7 = findViewById<View>(R.id.linear4) as LinearLayout

        bab1.startAnimation(trans)
        bab2.startAnimation(trans)
        bab3.startAnimation(trans)
        bab4.startAnimation(trans)
        bab5.startAnimation(trans)
        bab6.startAnimation(trans)
        bab7.startAnimation(scale)


        back.setOnClickListener {
            val intent = Intent(this@Mp3WaraActivity,
            MenuAwalActivity::class.java)
            startActivity(intent)
            finish()
        }

        bab1Mp3.setOnClickListener {
            val intent = Intent(this@Mp3WaraActivity,
            MateriSuaraBab1Activity::class.java)
            startActivity(intent)
            finish()
        }

        bab2mp3.setOnClickListener {
            val intent = Intent(this@Mp3WaraActivity,
            MateriSuaraBab2Activity::class.java)
            startActivity(intent)
            finish()
        }

        bab3mp3.setOnClickListener {
            val intent = Intent(this@Mp3WaraActivity,
            MateriSuaraBab3Activity::class.java)
            startActivity(intent)
            finish()
        }

        bab4mp3.setOnClickListener {
            val intent = Intent(this@Mp3WaraActivity,
            MateriSuaraBab4Activity::class.java)
            startActivity(intent)
            finish()
        }

        bab5mp3.setOnClickListener {
            val intent = Intent(this@Mp3WaraActivity,
            MateriSuaraBab5Activity::class.java)
            startActivity(intent)
            finish()
        }

        bab6mp3.setOnClickListener {
            val intent = Intent(this@Mp3WaraActivity,
            MateriSuaraBab6Activity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        if (backPressedTime + 6000 > System.currentTimeMillis()) {
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