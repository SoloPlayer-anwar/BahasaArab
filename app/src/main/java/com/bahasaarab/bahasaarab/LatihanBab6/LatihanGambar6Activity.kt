package com.bahasaarab.bahasaarab.LatihanBab6

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
import kotlinx.android.synthetic.main.activity_latihan_gambar6.*

class LatihanGambar6Activity : AppCompatActivity() {

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
        setContentView(R.layout.activity_latihan_gambar6)

        val lapangan = findViewById<View>(R.id.lapangan) as ImageView
        val mainbola = findViewById<View>(R.id.mainbola) as ImageView
        val wudhu = findViewById<View>(R.id.wudhu) as ImageView
        val sholat = findViewById<View>(R.id.sholat) as ImageView
        val sport = findViewById<View>(R.id.sport) as ImageView


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Flapangan.png?alt=media&token=1ced4388-06af-4c1b-83bf-fc370499a96e")
            .into(lapangan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fbermainbola.png?alt=media&token=9b75e276-5617-45e0-b411-0884b119f731")
            .into(mainbola)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fberwudhu.png?alt=media&token=d3811c3d-d84f-4e57-b472-9caf798b47ab")
            .into(wudhu)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fsholat.png?alt=media&token=be08f0d8-0e7a-4639-8fc9-6887f044ee53")
            .into(sholat)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar6%2Fbermain.png?alt=media&token=ac55d796-b185-4c20-ab5c-bbcb0a675814")
            .into(sport)


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
            if (value_no1!!.text.toString().toLowerCase() == "مَلْعَبٌ") {
                nilai = nilai + 20
            }
            if (value_no2!!.text.toString().toLowerCase() == "كُرَةُ الْقَدَمِ") {
                nilai = nilai + 20
            }
            if (value_no3!!.text.toString().toLowerCase() == "يَتَوَضَّأُ") {
                nilai = nilai + 20
            }
            if (value_no4!!.text.toString().toLowerCase() == "يُصَلِّى") {
                nilai = nilai + 20
            }
            if (value_no5!!.text.toString().toLowerCase() == "رِيَاضَةٌ") {
                nilai = nilai + 20
            }
            val i = Intent(this@LatihanGambar6Activity, ResultGambar6Activity::class.java)
            i.putExtra("nilai", nilai)
            startActivity(i)
            finish()
        })


        back.setOnClickListener {
            val intent = Intent(this@LatihanGambar6Activity,
            LatihanWaraActivity::class.java)
            startActivity(intent)
        }

    }
}