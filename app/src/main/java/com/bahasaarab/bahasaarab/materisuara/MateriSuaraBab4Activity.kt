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
import kotlinx.android.synthetic.main.activity_materi_suara_bab4.*

class MateriSuaraBab4Activity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var backToast : Toast? = null

    private var bab4sound1: MediaPlayer? = null
    private var bab4sound2: MediaPlayer? = null
    private var bab4sound3: MediaPlayer? = null
    private var bab4sound4: MediaPlayer? = null
    private var bab4sound5: MediaPlayer? = null
    private var bab4sound6: MediaPlayer? = null
    private var bab4sound7: MediaPlayer? = null
    private var bab4sound8: MediaPlayer? = null
    private var bab4sound9: MediaPlayer? = null
    private var bab4sound10: MediaPlayer? = null
    private var bab4sound11: MediaPlayer? = null
    private var bab4sound12: MediaPlayer? = null
    private var bab4sound13: MediaPlayer? = null
    private var bab4sound14: MediaPlayer? = null
    private var bab4sound15: MediaPlayer? = null
    private var bab4sound16: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_suara_bab4)

        back.setOnClickListener {
            val intent = Intent(this@MateriSuaraBab4Activity,
            Mp3WaraActivity::class.java)
            startActivity(intent)
            finish()
        }

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fkursi.png?alt=media&token=8c772982-b12a-42fc-a3ca-2ae895ebdec5")
            .into(mejabaru)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fpelayanan.png?alt=media&token=170f4143-163f-468a-8989-68b05c6b2d9d")
            .into(pelayansaya)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fmakanan.png?alt=media&token=324a056f-5461-4416-a7d2-41feff357887")
            .into(makanmakan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Feskrim.png?alt=media&token=8b21d1ee-6849-4fcc-97c3-bc078cf1cedb")
            .into(eskrim)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fnasi.png?alt=media&token=a053075a-40ed-4c59-ac27-767777ce642d")
            .into(nasi)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fikangoreng.png?alt=media&token=7f65f690-974e-4fcb-a01b-12c2798138a2")
            .into(ikangoreng)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fsayur.png?alt=media&token=d2bf172b-2b71-4ea1-aa78-bb3ba07afb43")
            .into(sayur)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fayamgoreng.png?alt=media&token=09bfa691-38d8-48c0-ab4d-feb4dee236dc")
            .into(ayamgoreng)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fkopi.png?alt=media&token=5b58dd9b-1d51-4a10-b4f6-efa9241b6f78")
            .into(kopi)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fteh.png?alt=media&token=0c94547e-d26a-4c70-b85a-7eb48fb9902c")
            .into(teh)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fsusu.png?alt=media&token=a62f15d2-f7b6-4fae-a403-fc047e9df792")
            .into(susu)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fjusbuah.png?alt=media&token=5ec60a78-afc4-4ace-8488-4f9cc83ba9d6")
            .into(jusbuah)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fkasir.png?alt=media&token=c14818b0-d266-4a7f-8393-fd0f6cf0bb4d")
            .into(kasir)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fduduk.png?alt=media&token=eaa8c588-f421-49cc-a4e2-96f79e36ea55")
            .into(duduk)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fminum.png?alt=media&token=cefe9e1c-de4f-4dcc-a95a-3b8d6b163050")
            .into(minum)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fbelanja.png?alt=media&token=e12348db-b466-461c-80b4-895b25b9d410")
            .into(kembalian)



    }

    fun bab4sound1(view: View) {
        if(bab4sound1 == null) {
            bab4sound1 = MediaPlayer.create(this,R.raw.bangku)
        }
        bab4sound1!!.start()
        Toast.makeText(this,"Bangku",Toast.LENGTH_LONG).show()
    }

    fun bab4sound2(view: View) {
        if(bab4sound2 == null) {
            bab4sound2 = MediaPlayer.create(this,R.raw.pelayan)
        }
        bab4sound2!!.start()
        Toast.makeText(this,"Pelayan",Toast.LENGTH_LONG).show()
    }

    fun bab4sound3(view: View) {
        if(bab4sound3 == null) {
            bab4sound3 = MediaPlayer.create(this,R.raw.makanan)
        }
        bab4sound3!!.start()
        Toast.makeText(this,"Makanan",Toast.LENGTH_LONG).show()
    }


    fun bab4sound4(view: View) {
        if(bab4sound4 == null) {
            bab4sound4 = MediaPlayer.create(this,R.raw.minuman)
        }
        bab4sound4!!.start()
        Toast.makeText(this,"Minuman",Toast.LENGTH_LONG).show()
    }

    fun bab4sound5(view: View) {
        if(bab4sound5 == null) {
            bab4sound5 = MediaPlayer.create(this,R.raw.nasi)
        }
        bab4sound5!!.start()
        Toast.makeText(this,"Nasi",Toast.LENGTH_LONG).show()
    }

    fun bab4sound6(view: View) {
        if(bab4sound6 == null) {
            bab4sound6 = MediaPlayer.create(this,R.raw.ikan)
        }
        bab4sound6!!.start()
        Toast.makeText(this,"Ikan",Toast.LENGTH_LONG).show()
    }

    fun bab4sound7(view: View) {
        if(bab4sound7 == null) {
            bab4sound7 = MediaPlayer.create(this,R.raw.sayuran)
        }
        bab4sound7!!.start()
        Toast.makeText(this,"Sayuran",Toast.LENGTH_LONG).show()
    }

    fun bab4sound8(view: View) {
        if(bab4sound8 == null) {
            bab4sound8 = MediaPlayer.create(this,R.raw.ayam)
        }
        bab4sound8!!.start()
        Toast.makeText(this,"Ayam",Toast.LENGTH_LONG).show()
    }

    fun bab4sound9(view: View) {
        if(bab4sound9 == null) {
            bab4sound9 = MediaPlayer.create(this,R.raw.kopi)
        }
        bab4sound9!!.start()
        Toast.makeText(this,"Kopi",Toast.LENGTH_LONG).show()
    }

    fun bab4sound10(view: View) {
        if(bab4sound10 == null) {
            bab4sound10 = MediaPlayer.create(this,R.raw.teh)
        }
        bab4sound10!!.start()
        Toast.makeText(this,"Teh",Toast.LENGTH_LONG).show()
    }

    fun bab4sound11(view: View) {
        if(bab4sound11 == null) {
            bab4sound11 = MediaPlayer.create(this,R.raw.susu)
        }
        bab4sound11!!.start()
        Toast.makeText(this,"Susu",Toast.LENGTH_LONG).show()
    }

    fun bab4sound12(view: View) {
        if(bab4sound12 == null) {
            bab4sound12 = MediaPlayer.create(this,R.raw.jus)
        }
        bab4sound12!!.start()
        Toast.makeText(this,"Jus",Toast.LENGTH_LONG).show()
    }

    fun bab4sound13(view: View) {
        if(bab4sound13 == null) {
            bab4sound13 = MediaPlayer.create(this,R.raw.kasir)
        }
        bab4sound13!!.start()
        Toast.makeText(this,"Kasir",Toast.LENGTH_LONG).show()
    }

    fun bab4sound14(view: View) {
        if(bab4sound14 == null) {
            bab4sound14 = MediaPlayer.create(this,R.raw.duduk)
        }
        bab4sound14!!.start()
        Toast.makeText(this,"Duduk",Toast.LENGTH_LONG).show()
    }

    fun bab4sound15(view: View) {
        if(bab4sound15 == null) {
            bab4sound15 = MediaPlayer.create(this,R.raw.meminum)
        }
        bab4sound15!!.start()
        Toast.makeText(this,"Meminum",Toast.LENGTH_LONG).show()
    }

    fun bab4sound16(view: View) {
        if(bab4sound16 == null) {
            bab4sound16 = MediaPlayer.create(this,R.raw.membayar)
        }
        bab4sound16!!.start()
        Toast.makeText(this,"Membayar",Toast.LENGTH_LONG).show()
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