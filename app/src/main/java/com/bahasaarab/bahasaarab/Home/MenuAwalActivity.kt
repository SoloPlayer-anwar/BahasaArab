package com.bahasaarab.bahasaarab.Home

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bahasaarab.bahasaarab.R
import com.bahasaarab.bahasaarab.R.drawable
import com.bahasaarab.bahasaarab.Utils.Preferences
import com.bahasaarab.bahasaarab.chat.NewMessageActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_menu_awal.*

class MenuAwalActivity : AppCompatActivity() {

    private lateinit var btn: ImageView
    private lateinit var myDialog: Dialog
    private lateinit var txt: ImageView

    lateinit var preferences: Preferences

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_awal)

        btn = findViewById(R.id.info)

        btn.setOnClickListener {
            showDialogDesc()
        }

        val scale = AnimationUtils.loadAnimation(this,R.anim.scale)
        val trans = AnimationUtils.loadAnimation(this,R.anim.translate)

        val linear4 = findViewById<View>(R.id.linearLayout4) as LinearLayout
        val sepeda = findViewById<View>(R.id.sepeda) as ImageView
        val btnmenu = findViewById<View>(R.id.btn_menu) as TextView


        linear4.startAnimation(trans)
        sepeda.startAnimation(trans)
        btnmenu.startAnimation(scale)

        preferences = Preferences(this)

       et_nama.text = preferences.getValues("nama")
        et_email.text = preferences.getValues("email")


        btn_menu.setOnClickListener {
            val intent = Intent(this@MenuAwalActivity,
            NewMessageActivity::class.java)
            startActivity(intent)
            finish()
        }

        Glide.with(this)
            .load(preferences.getValues("url"))
            .into(iv_profile)

        Log.v("tamvan", "url "+preferences.getValues("url"))


        sound.setOnClickListener {
            val intent = Intent(this@MenuAwalActivity,
            Mp3WaraActivity::class.java)
            startActivity(intent)
            finish()

        }

        teks.setOnClickListener {
            val intent = Intent(this@MenuAwalActivity,
                MateriTeksWaraActivity::class.java)
            startActivity(intent)
            finish()

        }

        video.setOnClickListener {
            val intent = Intent(this@MenuAwalActivity,
                VideoWaraActivity::class.java)
            startActivity(intent)
            finish()

        }

        latihan.setOnClickListener {
            val intent = Intent(this@MenuAwalActivity,
                LatihanWaraActivity::class.java)
            startActivity(intent)
            finish()

        }

    }

    private fun showDialogDesc() {


        myDialog = Dialog(this)
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog.setContentView(R.layout.desc_activity)
        myDialog.setTitle("Deskripsi ")

        txt = myDialog.findViewById<View>(R.id.ending) as ImageView
        txt.isEnabled = true
        txt.setOnClickListener{
            myDialog.cancel()
        }

        myDialog.show()
    }

    override fun onBackPressed() {
        if (backPressedTime + 4000 > System.currentTimeMillis()) {
            backToast!!.cancel()
            super.onBackPressed()
            return
        }

        else {
            backToast = Toast.makeText(baseContext,"tekan 2x untuk Keluar",Toast.LENGTH_LONG)
            backToast!!.show()
        }

        backPressedTime = System.currentTimeMillis()
    }
}