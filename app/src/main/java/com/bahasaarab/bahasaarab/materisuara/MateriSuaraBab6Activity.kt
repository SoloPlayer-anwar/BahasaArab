package com.bahasaarab.bahasaarab.materisuara

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bahasaarab.bahasaarab.Home.Mp3WaraActivity
import com.bahasaarab.bahasaarab.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_materi_suara_bab6.*

class MateriSuaraBab6Activity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    private var bab6sound1: MediaPlayer? = null
    private var bab6sound2: MediaPlayer? = null
    private var bab6sound3: MediaPlayer? = null
    private var bab6sound4: MediaPlayer? = null
    private var bab6sound5: MediaPlayer? = null
    private var bab6sound6: MediaPlayer? = null
    private var bab6sound7: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_suara_bab6)

        cuk.setOnClickListener {
            val intent = Intent(this@MateriSuaraBab6Activity,
            Mp3WaraActivity::class.java)
            startActivity(intent)
            finish()
        }

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fbermainbola.png?alt=media&token=9b75e276-5617-45e0-b411-0884b119f731")
            .into(sepakbola)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Flapangan.png?alt=media&token=1ced4388-06af-4c1b-83bf-fc370499a96e")
            .into(lapanganbola)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fcuaca.png?alt=media&token=2e309972-08f8-4b49-94ce-bbfb3e4b4a3a")
            .into(cuaca)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fbermain.png?alt=media&token=ac55d796-b185-4c20-ab5c-bbcb0a675814")
            .into(sportolah)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Ftidur.png?alt=media&token=30808720-fab7-4c00-b189-e795c75e85b5")
            .into(tidur)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fberwudhu.png?alt=media&token=d3811c3d-d84f-4e57-b472-9caf798b47ab")
            .into(berwudhu)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fsholat.png?alt=media&token=be08f0d8-0e7a-4639-8fc9-6887f044ee53")
            .into(sholatan)

    }

    fun bab6sound1(view: View) {
        if (bab6sound1 == null) {
            bab6sound1 = MediaPlayer.create(this,R.raw.sepakbola)
        }
        bab6sound1!!.start()
        Toast.makeText(this,"Sepak Bola",Toast.LENGTH_LONG).show()
    }

    fun bab6sound2(view: View) {
        if (bab6sound2 == null) {
            bab6sound2 = MediaPlayer.create(this,R.raw.lapangan)
        }
        bab6sound2!!.start()
        Toast.makeText(this,"Lapangan",Toast.LENGTH_LONG).show()
    }

    fun bab6sound3(view: View) {
        if (bab6sound3 == null) {
            bab6sound3 = MediaPlayer.create(this,R.raw.udara)
        }
        bab6sound3!!.start()
        Toast.makeText(this,"Udara",Toast.LENGTH_LONG).show()
    }

    fun bab6sound4(view: View) {
        if (bab6sound4 == null) {
            bab6sound4 = MediaPlayer.create(this,R.raw.olahragasport)
        }
        bab6sound4!!.start()
        Toast.makeText(this,"Olahraga",Toast.LENGTH_LONG).show()
    }

    fun bab6sound5(view: View) {
        if (bab6sound5 == null) {
            bab6sound5 = MediaPlayer.create(this,R.raw.tidur)
        }
        bab6sound5!!.start()
        Toast.makeText(this,"Tidur",Toast.LENGTH_LONG).show()
    }

    fun bab6sound6(view: View) {
        if (bab6sound6 == null) {
            bab6sound6 = MediaPlayer.create(this,R.raw.berwudhu)
        }
        bab6sound6!!.start()
        Toast.makeText(this,"Berwudhu",Toast.LENGTH_LONG).show()
    }

    fun bab6sound7(view: View) {
        if (bab6sound7 == null) {
            bab6sound7 = MediaPlayer.create(this,R.raw.sholat)
        }
        bab6sound7!!.start()
        Toast.makeText(this,"Sholat",Toast.LENGTH_LONG).show()
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