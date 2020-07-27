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
import kotlinx.android.synthetic.main.activity_latihan_gambar5.*
import kotlinx.android.synthetic.main.activity_latihan_wara.*
import kotlinx.android.synthetic.main.activity_materi_suara_bab5.*

class MateriSuaraBab5Activity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    private var bab5sound1: MediaPlayer? = null
    private var bab5sound2: MediaPlayer? = null
    private var bab5sound3: MediaPlayer? = null
    private var bab5sound4: MediaPlayer? = null
    private var bab5sound5: MediaPlayer? = null
    private var bab5sound6: MediaPlayer? = null
    private var bab5sound7: MediaPlayer? = null
    private var bab5sound8: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_suara_bab5)

        cuk.setOnClickListener {
            val intent = Intent(this@MateriSuaraBab5Activity,
            Mp3WaraActivity::class.java)
            startActivity(intent)
            finish()
        }

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fpekerjaanrumah.png?alt=media&token=b97f204d-8669-4e6a-8069-fd0d89cb8b8a")
            .into(prulun)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fmatematika.png?alt=media&token=505add1b-0f93-4c56-ba69-12283083081b")
            .into(matematikaulun)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fruangbelajar.png?alt=media&token=c12eade0-d8db-4d65-b783-7c23ce9ea962")
            .into(ruangbjlr)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fkimia.png?alt=media&token=8fb51ab8-75d3-4e22-96e6-a3f8b6974644")
            .into(kimiaulun)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Ffisika.png?alt=media&token=a724086c-7bb5-431b-ac8c-49781df1c732")
            .into(fisika)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fbelajar.png?alt=media&token=a4ba9edd-db57-48a7-b102-62eaff2950d4")
            .into(belajarulun)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Farahjalan.png?alt=media&token=cc3745f0-2444-47ed-bfdc-0e5357241f61")
            .into(arahjalan)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fberkumpul.png?alt=media&token=305e1c31-f55a-4da5-804d-1f99f187e64b")
            .into(berkumpulan)

    }

    fun bab5sound1(view: View) {
        if (bab5sound1 == null){
            bab5sound1 = MediaPlayer.create(this,R.raw.pr)
        }
        bab5sound1!!.start()
        Toast.makeText(this,"Pekerjaan Rumah",Toast.LENGTH_LONG).show()
    }

    fun bab5sound2(view: View) {
        if (bab5sound2 == null){
            bab5sound2 = MediaPlayer.create(this,R.raw.materimatematika)
        }
        bab5sound2!!.start()
        Toast.makeText(this,"Materi Matematika",Toast.LENGTH_LONG).show()
    }

    fun bab5sound3(view: View) {
        if (bab5sound3 == null){
            bab5sound3 = MediaPlayer.create(this,R.raw.ruangbelajar)
        }
        bab5sound3!!.start()
        Toast.makeText(this,"Ruang Belajar",Toast.LENGTH_LONG).show()
    }

    fun bab5sound4(view: View) {
        if (bab5sound4 == null){
            bab5sound4 = MediaPlayer.create(this,R.raw.kimia)
        }
        bab5sound4!!.start()
        Toast.makeText(this,"Kimia",Toast.LENGTH_LONG).show()
    }

    fun bab5sound5(view: View) {
        if (bab5sound5 == null){
            bab5sound5 = MediaPlayer.create(this,R.raw.fisika)
        }
        bab5sound5!!.start()
        Toast.makeText(this,"Fisika",Toast.LENGTH_LONG).show()
    }

    fun bab5sound6(view: View) {
        if (bab5sound6 == null){
            bab5sound6 = MediaPlayer.create(this,R.raw.mempelajari)
        }
        bab5sound6!!.start()
        Toast.makeText(this,"Mempelajari",Toast.LENGTH_LONG).show()
    }

    fun bab5sound7(view: View) {
        if (bab5sound7 == null){
            bab5sound7 = MediaPlayer.create(this,R.raw.istirahat)
        }
        bab5sound7!!.start()
        Toast.makeText(this,"Istirahat",Toast.LENGTH_LONG).show()
    }

    fun bab5sound8(view: View) {
        if (bab5sound8 == null){
            bab5sound8 = MediaPlayer.create(this,R.raw.berkumpul)
        }
        bab5sound8!!.start()
        Toast.makeText(this,"Berkumpul",Toast.LENGTH_LONG).show()
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