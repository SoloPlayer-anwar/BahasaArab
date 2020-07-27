package com.bahasaarab.bahasaarab.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.Toast
import com.bahasaarab.bahasaarab.LatihanBab1.LatihanGambarActivity
import com.bahasaarab.bahasaarab.LatihanBab2.LatihanGambar2Activity
import com.bahasaarab.bahasaarab.LatihanBab3.LatihanGambar3Activity
import com.bahasaarab.bahasaarab.LatihanBab4.LatihanGambar4Activity
import com.bahasaarab.bahasaarab.LatihanBab5.LatihanGambar5Activity
import com.bahasaarab.bahasaarab.LatihanBab6.LatihanGambar6Activity
import com.bahasaarab.bahasaarab.R
import kotlinx.android.synthetic.main.activity_latihan_wara.*

class LatihanWaraActivity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_wara)

        val scale = AnimationUtils.loadAnimation(this,R.anim.scale)
        val trans = AnimationUtils.loadAnimation(this,R.anim.translate)

        val bab1 = findViewById<View>(R.id.bab1) as LinearLayout
        val bab2 = findViewById<View>(R.id.bab2) as LinearLayout
        val bab3 = findViewById<View>(R.id.bab3) as LinearLayout
        val bab4 = findViewById<View>(R.id.bab4) as LinearLayout
        val bab5 = findViewById<View>(R.id.bab5) as LinearLayout
        val bab6 = findViewById<View>(R.id.bab6) as LinearLayout

        val linerlatihan = findViewById<View>(R.id.linerlatihan) as LinearLayout

        bab1.startAnimation(trans)
        bab2.startAnimation(trans)
        bab3.startAnimation(trans)
        bab4.startAnimation(trans)
        bab5.startAnimation(trans)
        bab6.startAnimation(trans)
        linerlatihan.startAnimation(scale)

        back.setOnClickListener {
            val intent = Intent(this@LatihanWaraActivity,
            MenuAwalActivity::class.java)
            startActivity(intent)
            finish()
        }

        bab1.setOnClickListener {
            val intent = Intent(this@LatihanWaraActivity,
            LatihanGambarActivity::class.java)
            startActivity(intent)
            finish()
        }

        bab2.setOnClickListener {
            val intent = Intent(this@LatihanWaraActivity,
                LatihanGambar2Activity::class.java)
            startActivity(intent)
            finish()
        }


        bab3.setOnClickListener {
            val intent = Intent(this@LatihanWaraActivity,
                LatihanGambar3Activity::class.java)
            startActivity(intent)
            finish()
        }

        bab4.setOnClickListener {
            val intent = Intent(this@LatihanWaraActivity,
                LatihanGambar4Activity::class.java)
            startActivity(intent)
            finish()
        }


        bab5.setOnClickListener {
            val intent = Intent(this@LatihanWaraActivity,
                LatihanGambar5Activity::class.java)
            startActivity(intent)
            finish()
        }

        bab6.setOnClickListener {
            val intent = Intent(this@LatihanWaraActivity,
                LatihanGambar6Activity::class.java)
            startActivity(intent)
            finish()
        }

    }

    override fun onBackPressed() {
        if (backPressedTime + 4000 > System.currentTimeMillis()) {
            backToast!!.cancel()
            super.onBackPressed()
            return
        }

        else {
            backToast = Toast.makeText(baseContext,"tekan tombol back diatas",Toast.LENGTH_LONG)
            backToast!!.show()
        }

        backPressedTime = System.currentTimeMillis()
    }
}