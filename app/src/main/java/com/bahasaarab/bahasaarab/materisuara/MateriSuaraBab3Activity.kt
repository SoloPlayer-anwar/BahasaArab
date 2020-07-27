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
import kotlinx.android.synthetic.main.activity_materi_suara_bab3.*

class MateriSuaraBab3Activity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    private var sound1bab3: MediaPlayer? = null
    private var sound2bab3: MediaPlayer? = null
    private var sound3bab3: MediaPlayer? = null
    private var sound4bab3: MediaPlayer? = null
    private var sound5bab3: MediaPlayer? = null
    private var sound6bab3: MediaPlayer? = null
    private var sound7bab3: MediaPlayer? = null
    private var sound8bab3: MediaPlayer? = null
    private var sound9bab3: MediaPlayer? = null
    private var sound10bab3: MediaPlayer? = null
    private var sound11bab3: MediaPlayer? = null
    private var sound12bab3: MediaPlayer? = null
    private var sound13bab3: MediaPlayer? = null
    private var sound14bab3: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_suara_bab3)

        back.setOnClickListener {
            val intent = Intent(this@MateriSuaraBab3Activity,
            Mp3WaraActivity::class.java)
            startActivity(intent)
            finish()
        }

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fkantin.png?alt=media&token=c3d4fdb8-5215-4572-bef6-4a1e294128fc")
            .into(kantin)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fdosen.png?alt=media&token=19d2659d-4b1d-45ae-8767-c8bffbe568da")
            .into(kumpulandosen)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fsore.png?alt=media&token=64b2d53f-3d69-4ad4-b840-0e70a271370c")
            .into(subuh)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fmalam.png?alt=media&token=42b5a92a-85e8-4f68-800e-05c3214b37a3")
            .into(sore)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fmotor.png?alt=media&token=04061183-05cb-4276-a2be-415302462182")
            .into(motorsaya)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fperpustakaan.png?alt=media&token=2563a923-ef41-4c44-beb8-4311ac7e04aa")
            .into(perpussaya)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fbuku.png?alt=media&token=2fb54eff-27bd-4246-898b-5608eb29cde7")
            .into(bukusaya)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Frak%20buku.png?alt=media&token=515d6f6f-e9a9-4431-91ee-4cd4c067e75f")
            .into(rakbuku)



        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fmeja.png?alt=media&token=21fe5e12-385a-4403-ac60-dab18086ec67")
            .into(meja)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fkomputer.png?alt=media&token=e01c2d68-6c31-4015-a719-68f4b919fd0a")
            .into(kompi)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fkursi.png?alt=media&token=c2607812-a1c6-40b8-9c74-a207389b670a")
            .into(kursi)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fistirahat.png?alt=media&token=c07cea0a-e82c-4bb4-916a-4c349d5c51c2")
            .into(berkumpul)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fbelajar.png?alt=media&token=9a9599b8-eaf3-4226-9994-237982a02c84")
            .into(mengajar)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fberjalan.png?alt=media&token=38466bab-98ac-4dd3-abb2-50752239244f")
            .into(berjalan)

    }

    fun bab3sound1(view: View) {
        if(sound1bab3 == null) {
            sound1bab3 = MediaPlayer.create(this,R.raw.kantin)
        }
        sound1bab3!!.start()
        Toast.makeText(this,"Kantin",Toast.LENGTH_LONG).show()
    }


    fun bab3sound2(view: View) {
        if(sound2bab3 == null) {
            sound2bab3 = MediaPlayer.create(this,R.raw.fakultas)
        }
        sound2bab3!!.start()
        Toast.makeText(this,"Fakultas",Toast.LENGTH_LONG).show()
    }


    fun bab3sound3(view: View) {
        if(sound3bab3 == null) {
            sound3bab3 = MediaPlayer.create(this,R.raw.subuh)
        }
        sound3bab3!!.start()
        Toast.makeText(this,"Pagi - Subuh",Toast.LENGTH_LONG).show()
    }



    fun bab3sound4(view: View) {
        if(sound4bab3 == null) {
            sound4bab3 = MediaPlayer.create(this,R.raw.sore)
        }
        sound4bab3!!.start()
        Toast.makeText(this,"Sore",Toast.LENGTH_LONG).show()
    }


    fun bab3sound5(view: View) {
        if(sound5bab3 == null) {
            sound5bab3 = MediaPlayer.create(this,R.raw.motor)
        }
        sound5bab3!!.start()
        Toast.makeText(this,"Motor",Toast.LENGTH_LONG).show()
    }


    fun bab3sound6(view: View) {
        if(sound6bab3 == null) {
            sound6bab3 = MediaPlayer.create(this,R.raw.perpus)
        }
        sound6bab3!!.start()
        Toast.makeText(this,"Perpustakaan",Toast.LENGTH_LONG).show()
    }


    fun bab3sound7(view: View) {
        if(sound7bab3 == null) {
            sound7bab3 = MediaPlayer.create(this,R.raw.bukubuku)
        }
        sound7bab3!!.start()
        Toast.makeText(this,"Buku-Buku",Toast.LENGTH_LONG).show()
    }


    fun bab3sound8(view: View) {
        if(sound8bab3 == null) {
            sound8bab3 = MediaPlayer.create(this,R.raw.rakbuku)
        }
        sound8bab3!!.start()
        Toast.makeText(this,"Rak Buku",Toast.LENGTH_LONG).show()
    }


    fun bab3sound9(view: View) {
        if(sound9bab3 == null) {
            sound9bab3 = MediaPlayer.create(this,R.raw.meja)
        }
        sound9bab3!!.start()
        Toast.makeText(this,"Meja",Toast.LENGTH_LONG).show()
    }


    fun bab3sound10(view: View) {
        if(sound10bab3 == null) {
            sound10bab3 = MediaPlayer.create(this,R.raw.komputer)
        }
        sound10bab3!!.start()
        Toast.makeText(this,"Komputer",Toast.LENGTH_LONG).show()
    }

    fun bab3sound11(view: View) {
        if(sound11bab3 == null) {
            sound11bab3 = MediaPlayer.create(this,R.raw.kursi)
        }
        sound11bab3!!.start()
        Toast.makeText(this,"Kursi",Toast.LENGTH_LONG).show()
    }


    fun bab3sound12(view: View) {
        if(sound12bab3 == null) {
            sound12bab3 = MediaPlayer.create(this,R.raw.makanmakan)
        }
        sound12bab3!!.start()
        Toast.makeText(this,"Makan-Makan",Toast.LENGTH_LONG).show()
    }


    fun bab3sound13(view: View) {
        if(sound13bab3 == null) {
            sound13bab3 = MediaPlayer.create(this,R.raw.belajar)
        }
        sound13bab3!!.start()
        Toast.makeText(this,"Belajar",Toast.LENGTH_LONG).show()
    }


    fun bab3sound14(view: View) {
        if(sound14bab3 == null) {
            sound14bab3 = MediaPlayer.create(this,R.raw.pergi)
        }
        sound14bab3!!.start()
        Toast.makeText(this,"Pergi",Toast.LENGTH_LONG).show()
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