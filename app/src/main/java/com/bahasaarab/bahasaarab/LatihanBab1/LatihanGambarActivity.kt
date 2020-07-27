package com.bahasaarab.bahasaarab.LatihanBab1

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
import kotlinx.android.synthetic.main.activity_latihan_gambar.*

class LatihanGambarActivity : AppCompatActivity() {

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
        setContentView(R.layout.activity_latihan_gambar)


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fperempuan.png?alt=media&token=a3afcb31-9645-4c40-b5c8-d85af5798344")
            .into(perempuan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fbaju.png?alt=media&token=397772bb-e27a-4f2f-a941-fc1dee8ae727")
            .into(baju)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Frumahsakit.png?alt=media&token=96b91a6c-2e8d-49fc-a941-b013cb31ddeb")
            .into(rumahsakit)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fkampus.png?alt=media&token=ea3b7921-aed9-4de7-8153-fca0b866dc29")
            .into(kampus)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar1%2Fmahasiswa.png?alt=media&token=5275454a-68f2-49e8-a855-81069c38b8c3")
            .into(mahasiswa)

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
            if (value_no1!!.text.toString().toLowerCase() == "صَدِيْقَةٌ") {
                nilai = nilai + 20
            }
            if (value_no2!!.text.toString().toLowerCase() == "مَلاَبِسُ") {
                nilai = nilai + 20
            }
            if (value_no3!!.text.toString().toLowerCase() == "مُسسْتَشْفَى") {
                nilai = nilai + 20
            }
            if (value_no4!!.text.toString().toLowerCase() == "جَامِعَةٌ") {
                nilai = nilai + 20
            }
            if (value_no5!!.text.toString().toLowerCase() == "طَالِبٌ") {
                nilai = nilai + 20
            }
            val i = Intent(this@LatihanGambarActivity, ResultGambarActivity::class.java)
            i.putExtra("nilai", nilai)
            startActivity(i)
            finish()
        })

        back.setOnClickListener {
            val intent = Intent(this@LatihanGambarActivity,
            LatihanWaraActivity::class.java)
            startActivity(intent)
        }

    }
}