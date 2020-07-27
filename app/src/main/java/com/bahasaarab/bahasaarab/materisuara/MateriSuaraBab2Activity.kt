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
import kotlinx.android.synthetic.main.activity_materi_suara_bab2.*

class MateriSuaraBab2Activity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    private var sound1 : MediaPlayer? = null
    private var sound2 : MediaPlayer? = null
    private var sound3 : MediaPlayer? = null
    private var sound4 : MediaPlayer? = null
    private var sound5 : MediaPlayer? = null
    private var sound6 : MediaPlayer? = null
    private var sound7 : MediaPlayer? = null
    private var sound8 : MediaPlayer? = null
    private var sound9 : MediaPlayer? = null
    private var sound10 : MediaPlayer? = null
    private var sound11 : MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_suara_bab2)

        back.setOnClickListener {
            val intent = Intent(this@MateriSuaraBab2Activity,
            Mp3WaraActivity::class.java)
            startActivity(intent)
            finish()
        }

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fkeluarga.png?alt=media&token=56cf346a-5ae6-4637-903d-07085acba4a0")
            .into(keluargasaya)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fayah.png?alt=media&token=52352a65-ce3c-4dbf-bfc7-050de9f2a7bf")
            .into(ayah)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fibu.png?alt=media&token=3b64c378-ca17-4749-9b3b-0065602d1966")
            .into(ibu)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fsodaralakilaki.png?alt=media&token=35021fd8-11a5-4cf0-a51b-737b58ae04ff")
            .into(sodarlaki)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fsodaraperempuan.png?alt=media&token=006ef42e-46e6-42dd-9a2a-ec742fb70d8a")
            .into(sodaraperem)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fkakek.png?alt=media&token=e014db29-16b1-48c8-b443-57b7eff14a2b")
            .into(kakek)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fnenek.png?alt=media&token=3b22d7da-3aec-4b32-ae70-0c822ec6b786")
            .into(nenek)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fgurulaki.png?alt=media&token=f3ced354-16a7-4ac6-8fc0-e5ae8f13dea7")
            .into(dosen)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fguruperempuan.png?alt=media&token=cb44e12c-f03a-4e82-9b91-45bb95732d66")
            .into(guruwanita)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fperawat.png?alt=media&token=da2c8922-4e3a-4bb7-b4da-bdfdbdf9f189")
            .into(suster)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fpetaniperempuan.png?alt=media&token=c4b25ade-4e62-481b-8f54-8cf014478eb1")
            .into(petaniperempuan)


    }

    fun bab2sound1(view: View) {
        if (sound1 == null) {
            sound1 = MediaPlayer.create(this,R.raw.keluarga)
        }
        sound1!!.start()
        Toast.makeText(this,"Keluarga",Toast.LENGTH_LONG).show()
    }
    fun bab2sound2(view: View) {
        if (sound2 == null) {
            sound2 = MediaPlayer.create(this,R.raw.ayah)
        }
        sound2!!.start()
        Toast.makeText(this,"Ayah",Toast.LENGTH_LONG).show()
    }
    fun bab2sound3(view: View) {
        if (sound3 == null) {
            sound3 = MediaPlayer.create(this,R.raw.ibu)
        }
        sound3!!.start()
        Toast.makeText(this,"Ibu",Toast.LENGTH_LONG).show()
    }
    fun bab2sound4(view: View) {
        if (sound4 == null) {
            sound4 = MediaPlayer.create(this,R.raw.saudaralaki)
        }
        sound4!!.start()
        Toast.makeText(this,"Saudara Laki Laki",Toast.LENGTH_LONG).show()
    }
    fun bab2sound5(view: View) {
        if (sound5 == null) {
            sound5 = MediaPlayer.create(this,R.raw.saudaraperem)
        }
        sound5!!.start()
        Toast.makeText(this,"Saudara Perempuan",Toast.LENGTH_LONG).show()
    }
    fun bab2sound6(view: View) {
        if (sound6 == null) {
            sound6 = MediaPlayer.create(this,R.raw.kakek)
        }
        sound6!!.start()
        Toast.makeText(this,"Kakek",Toast.LENGTH_LONG).show()
    }
    fun bab2sound7(view: View) {
        if (sound7 == null) {
            sound7 = MediaPlayer.create(this,R.raw.nenek)
        }
        sound7!!.start()
        Toast.makeText(this,"Nenek",Toast.LENGTH_LONG).show()
    }
    fun bab2sound8(view: View) {
        if (sound8 == null) {
            sound8 = MediaPlayer.create(this,R.raw.dosenlaki)
        }
        sound8!!.start()
        Toast.makeText(this,"Dosen Laki Laki",Toast.LENGTH_LONG).show()
    }
    fun bab2sound9(view: View) {
        if (sound9 == null) {
            sound9 = MediaPlayer.create(this,R.raw.guruperempuan)
        }
        sound9!!.start()
        Toast.makeText(this,"Guru Perempuan",Toast.LENGTH_LONG).show()
    }
    fun bab2sound10(view: View) {
        if (sound10 == null) {
            sound10 = MediaPlayer.create(this,R.raw.perawatperempuan)
        }
        sound10!!.start()
        Toast.makeText(this,"Perawat Perempuan",Toast.LENGTH_LONG).show()
    }
    fun bab2sound11(view: View) {
        if (sound11 == null) {
            sound11 = MediaPlayer.create(this,R.raw.petaniperempuan)
        }
        sound11!!.start()
        Toast.makeText(this,"Petani Perempuan",Toast.LENGTH_LONG).show()
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