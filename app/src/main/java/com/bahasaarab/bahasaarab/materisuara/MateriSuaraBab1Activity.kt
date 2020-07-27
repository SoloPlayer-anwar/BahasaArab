package com.bahasaarab.bahasaarab.materisuara

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bahasaarab.bahasaarab.Home.Mp3WaraActivity
import com.bahasaarab.bahasaarab.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_materi_suara_bab1.*

class MateriSuaraBab1Activity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    private var player: MediaPlayer? = null
    private var player2: MediaPlayer? = null
    private var player3: MediaPlayer? = null
    private var player4: MediaPlayer? = null
    private var player5: MediaPlayer? = null
    private var player6: MediaPlayer? = null
    private var player7: MediaPlayer? = null
    private var player8: MediaPlayer? = null
    private var player9: MediaPlayer? = null
    private var player10: MediaPlayer? = null
    private var player11: MediaPlayer? = null
    private var player12: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_suara_bab1)


        back.setOnClickListener {
            val intent = Intent(this@MateriSuaraBab1Activity,
            Mp3WaraActivity::class.java)
            startActivity(intent)
            finish()
        }

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fmahasiswa.png?alt=media&token=5275454a-68f2-49e8-a855-81069c38b8c3")
            .into(mahasiswa)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fdokter_laki.png?alt=media&token=f5c39593-db10-4556-b7ca-098cc8a60cf9")
            .into(dokterlaki)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fdokterperempuan.png?alt=media&token=e2ab341b-4b36-4fc1-887f-8ce9eb8059a6")
            .into(dokterperempuan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fmahasiswi.png?alt=media&token=ac02f5fa-ab05-442e-8ca3-95667a4c8c26")
            .into(mahasiswi)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fsodara_laki.png?alt=media&token=07fdf4c8-e66a-45a3-bdd2-08b8c07ec8ba")
            .into(sodaralakilaki)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fperempuan.png?alt=media&token=a3afcb31-9645-4c40-b5c8-d85af5798344")
            .into(temanperempuan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fpedagang_laki.png?alt=media&token=acb589ff-aa10-4c01-b7eb-45184ada39be")
            .into(pedanglaki)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fpedang_perempuan.png?alt=media&token=84792e64-77ab-42c9-992e-909323c00abe")
            .into(pedangperempuan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fkampus.png?alt=media&token=ea3b7921-aed9-4de7-8153-fca0b866dc29")
            .into(kampussaya)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Frumahsakit.png?alt=media&token=96b91a6c-2e8d-49fc-a941-b013cb31ddeb")
            .into(rumahsakitsaya)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fpasar.png?alt=media&token=aab3ac3b-0cca-4743-bbe3-fca0aedc9546")
            .into(pasar)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fbaju.png?alt=media&token=397772bb-e27a-4f2f-a941-fc1dee8ae727")
            .into(baju)
    }


    fun play(view: View) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.dokterlaki)
        }
        player!!.start()
        Toast.makeText(this, "Dokter Laki Laki", Toast.LENGTH_LONG).show()
    }

    fun play2(view: View) {
        if (player2 == null) {
            player2 = MediaPlayer.create(this, R.raw.dokterperempuan)
        }
        player2!!.start()
        Toast.makeText(this, "Dokter Perempuan", Toast.LENGTH_LONG).show()
    }

    fun play3(view: View) {
        if (player3 == null) {
            player3 = MediaPlayer.create(this, R.raw.mahasiswa)
        }
        player3!!.start()
        Toast.makeText(this, "Mahasiswa", Toast.LENGTH_LONG).show()
    }

    fun play4(view: View) {
        if (player4 == null) {
            player4 = MediaPlayer.create(this,R.raw.mahasiswi)
        }
        player4!!.start()
        Toast.makeText(this, "Mahasiswi", Toast.LENGTH_LONG).show()
    }

    fun play5(view: View) {
        if (player5 == null) {
            player5 = MediaPlayer.create(this,R.raw.temanlaki)
        }
        player5!!.start()
        Toast.makeText(this, "Teman Laki-Laki", Toast.LENGTH_LONG).show()
    }

    fun play6(view: View) {
        if (player6 == null) {
            player6 = MediaPlayer.create(this,R.raw.temanperempuan)
        }
        player6!!.start()
        Toast.makeText(this, "Teman Perempuan", Toast.LENGTH_LONG).show()
    }

    fun play7(view: View) {
        if (player7 == null) {
            player7 = MediaPlayer.create(this,R.raw.pedaganglaki)
        }
        player7!!.start()
        Toast.makeText(this, "Pedagang Laki-Laki", Toast.LENGTH_LONG).show()
    }
    fun play8(view: View) {
        if (player8 == null) {
            player8 = MediaPlayer.create(this,R.raw.pedagangperempuan)
        }
        player8!!.start()
        Toast.makeText(this, "Pedagang Perempuan", Toast.LENGTH_LONG).show()
    }

    fun play9(view: View) {
        if (player9 == null) {
            player9 = MediaPlayer.create(this,R.raw.kampus)
        }
        player9!!.start()
        Toast.makeText(this, "Kampus", Toast.LENGTH_LONG).show()
    }
    fun play10(view: View) {
        if (player10 == null) {
            player10 = MediaPlayer.create(this,R.raw.rumahsakit)
        }
        player10!!.start()
        Toast.makeText(this, "Rumah Sakit", Toast.LENGTH_LONG).show()
    }
    fun play11(view: View) {
        if (player11 == null) {
            player11 = MediaPlayer.create(this,R.raw.pasar)
        }
        player11!!.start()
        Toast.makeText(this, "Pasar", Toast.LENGTH_LONG).show()
    }
    fun play12(view: View) {
        if (player12 == null) {
            player12 = MediaPlayer.create(this,R.raw.baju)
        }
        player12!!.start()
        Toast.makeText(this, "Baju", Toast.LENGTH_LONG).show()
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


