package com.bahasaarab.bahasaarab.LatihanBab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import com.bahasaarab.bahasaarab.Home.LatihanWaraActivity
import com.bahasaarab.bahasaarab.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_latihan_gambar4.*

class LatihanGambar4Activity : AppCompatActivity() {

    var radiogr1: RadioGroup? = null
    var radiogr2: RadioGroup? = null
    var radiogr3: RadioGroup? = null
    var radiogr4: RadioGroup? = null
    var radiogr5: RadioGroup? = null

    private var proses: Button? = null
    private var value_no1: RadioButton? = null
    private var value_no2: RadioButton? = null
    private var value_no3: RadioButton? = null
    private var value_no4: RadioButton? = null
    private var value_no5: RadioButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_gambar4)

        val makanan = findViewById<View>(R.id.makanan) as ImageView
        val pelayan = findViewById<View>(R.id.pelayan) as ImageView
        val ayam = findViewById<View>(R.id.ayam_goreng) as ImageView
        val sayur = findViewById<View>(R.id.sayur) as ImageView
        val susu = findViewById<View>(R.id.susu) as ImageView


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fmakanan.png?alt=media&token=324a056f-5461-4416-a7d2-41feff357887")
            .into(makanan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fpelayanan.png?alt=media&token=170f4143-163f-468a-8989-68b05c6b2d9d")
            .into(pelayan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fayamgoreng.png?alt=media&token=09bfa691-38d8-48c0-ab4d-feb4dee236dc")
            .into(ayam)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fsayur.png?alt=media&token=d2bf172b-2b71-4ea1-aa78-bb3ba07afb43")
            .into(sayur)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar4%2Fsusu.png?alt=media&token=a62f15d2-f7b6-4fae-a403-fc047e9df792")
            .into(susu)


        radiogr1 = findViewById(R.id.radiogroup1)
        radiogr2 = findViewById(R.id.radiogroup2)
        radiogr3 = findViewById(R.id.radiogroup3)
        radiogr4 = findViewById(R.id.radiogroup4)
        radiogr5 = findViewById(R.id.radiogroup5)
        proses = findViewById(R.id.button_proses)
        proses!!.setOnClickListener(View.OnClickListener {

            val pointa = radiogr1!!.getCheckedRadioButtonId()
            value_no1 = findViewById<View>(pointa) as RadioButton
            val pointb = radiogr2!!.getCheckedRadioButtonId()
            value_no2 = findViewById<View>(pointb) as RadioButton
            val pointc = radiogr3!!.getCheckedRadioButtonId()
            value_no3 = findViewById<View>(pointc) as RadioButton
            val pointd = radiogr4!!.getCheckedRadioButtonId()
            value_no4 = findViewById<View>(pointd) as RadioButton
            val pointe = radiogr5!!.getCheckedRadioButtonId()
            value_no5 = findViewById<View>(pointe) as RadioButton
            var nilai = 0 // variabel untuk menampung nilai
            if (value_no1!!.text.toString().toLowerCase() == "طَعَامٌ") {
                nilai = nilai + 20
            }
            if (value_no2!!.text.toString().toLowerCase() == "عَامِلٌ") {
                nilai = nilai + 20
            }
            if (value_no3!!.text.toString().toLowerCase() == "دَجَاجَةٌ") {
                nilai = nilai + 20
            }
            if (value_no4!!.text.toString().toLowerCase() == "خُضَارٌ") {
                nilai = nilai + 20
            }
            if (value_no5!!.text.toString().toLowerCase() == "لَبَنٌ") {
                nilai = nilai + 20
            }
            val i = Intent(this@LatihanGambar4Activity, ResultGambar4Activity::class.java)
            i.putExtra("nilai", nilai)
            startActivity(i)
            finish()
        })

        back.setOnClickListener {
            val intent = Intent(this@LatihanGambar4Activity,
            LatihanWaraActivity::class.java)
            startActivity(intent)
        }

    }
}