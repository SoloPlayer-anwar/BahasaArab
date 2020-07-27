package com.bahasaarab.bahasaarab.Home

import android.app.Dialog
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.bahasaarab.bahasaarab.R
import kotlinx.android.synthetic.main.activity_materi_teks_wara.*

class MateriTeksWaraActivity : AppCompatActivity() {

    private lateinit var btn: LinearLayout
    private lateinit var myDialog: Dialog
    private lateinit var txt: ImageView

    private lateinit var btn1: LinearLayout
    private lateinit var myDialog1: Dialog
    private lateinit var txt1: ImageView

    private lateinit var btn2: LinearLayout
    private lateinit var myDialog2: Dialog
    private lateinit var txt2: ImageView


    private lateinit var btn3: LinearLayout
    private lateinit var myDialog3: Dialog
    private lateinit var txt3: ImageView


    private lateinit var btn4: LinearLayout
    private lateinit var myDialog4: Dialog
    private lateinit var txt4: ImageView

    private lateinit var btn5:LinearLayout
    private lateinit var myDialog5: Dialog
    private lateinit var txt5: ImageView

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_teks_wara)

        val scale = AnimationUtils.loadAnimation(this,R.anim.scale)
        val trans = AnimationUtils.loadAnimation(this,R.anim.translate)

        val bab1teks = findViewById<View>(R.id.bab1teks) as LinearLayout
        val bab2teks = findViewById<View>(R.id.bab2teks) as LinearLayout
        val bab3teks = findViewById<View>(R.id.bab3teks) as LinearLayout
        val bab4teks = findViewById<View>(R.id.bab4teks) as LinearLayout
        val bab5teks = findViewById<View>(R.id.bab5teks) as LinearLayout
        val bab6teks = findViewById<View>(R.id.bab6teks) as LinearLayout

        val linerteks = findViewById<View>(R.id.linerteks) as LinearLayout

        bab1teks.startAnimation(trans)
        bab2teks.startAnimation(trans)
        bab3teks.startAnimation(trans)
        bab4teks.startAnimation(trans)
        bab5teks.startAnimation(trans)
        bab6teks.startAnimation(trans)

        linerteks.startAnimation(scale)

        back.setOnClickListener {
            val intent = Intent(this@MateriTeksWaraActivity,
            MenuAwalActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn = findViewById<View>(R.id.bab1teks) as LinearLayout
        btn.setOnClickListener {
            ShowDialog()
        }

        btn1 = findViewById<View>(R.id.bab2teks) as LinearLayout
        btn1.setOnClickListener {
            ShowDialog1()
        }

        btn2 = findViewById<View>(R.id.bab3teks) as LinearLayout
        btn2.setOnClickListener {
            ShowDialog2()
        }

        btn3 = findViewById<View>(R.id.bab4teks) as LinearLayout
        btn3.setOnClickListener {
            ShowDialog3()
        }

        btn4 = findViewById<View>(R.id.bab5teks) as LinearLayout
        btn4.setOnClickListener {
            ShowDialog4()
        }

        btn5 = findViewById<View>(R.id.bab6teks) as LinearLayout
        btn5.setOnClickListener {
            ShowDialog5()
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

    fun  ShowDialog() {

        myDialog = Dialog(this)
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog.setContentView(R.layout.bab1_teks_activity)
        myDialog.setTitle("Ok Selamat Belajar ")

        txt = myDialog.findViewById<View>(R.id.exit) as ImageView
        txt.isEnabled = true
        txt.setOnClickListener{
            myDialog.cancel()
        }

        myDialog.show()

    }

    fun  ShowDialog1() {
        myDialog1 = Dialog(this)
        myDialog1.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog1.setContentView(R.layout.bab2_teks_activity)
        myDialog1.setTitle("Ok Selamat Belajar ")

        txt1 = myDialog1.findViewById<View>(R.id.exit) as ImageView
        txt1.isEnabled = true
        txt1.setOnClickListener{
            myDialog1.cancel()
        }

        myDialog1.show()

    }

    fun  ShowDialog2() {
        myDialog2 = Dialog(this)
        myDialog2.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog2.setContentView(R.layout.bab3_teks_activity)
        myDialog2.setTitle("Ok Selamat Belajar ")

        txt2 = myDialog2.findViewById<View>(R.id.exit) as ImageView
        txt2.isEnabled = true
        txt2.setOnClickListener{
            myDialog2.cancel()
        }

        myDialog2.show()

    }

    fun  ShowDialog3() {
        myDialog3 = Dialog(this)
        myDialog3.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog3.setContentView(R.layout.bab4_teks_activity)
        myDialog3.setTitle("Ok Selamat Belajar ")

        txt3 = myDialog3.findViewById<View>(R.id.exit) as ImageView
        txt3.isEnabled = true
        txt3.setOnClickListener{
            myDialog3.cancel()
        }

        myDialog3.show()

    }

    fun  ShowDialog4() {
        myDialog4 = Dialog(this)
        myDialog4.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog4.setContentView(R.layout.bab5_teks_activity)
        myDialog4.setTitle("Ok Selamat Belajar ")

        txt4 = myDialog4.findViewById<View>(R.id.exit) as ImageView
        txt4.isEnabled = true
        txt4.setOnClickListener{
            myDialog4.cancel()
        }

        myDialog4.show()

    }

    fun  ShowDialog5() {
        myDialog5 = Dialog(this)
        myDialog5.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog5.setContentView(R.layout.bab6_teks_activity)
        myDialog5.setTitle("Ok Selamat Belajar ")

        txt5 = myDialog5.findViewById<View>(R.id.exit) as ImageView
        txt5.isEnabled = true
        txt5.setOnClickListener{
            myDialog5.cancel()
        }

        myDialog5.show()

    }


}