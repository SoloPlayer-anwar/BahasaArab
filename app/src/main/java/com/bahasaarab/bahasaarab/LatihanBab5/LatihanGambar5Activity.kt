package com.bahasaarab.bahasaarab.LatihanBab5

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
import kotlinx.android.synthetic.main.activity_latihan_gambar5.*

class LatihanGambar5Activity : AppCompatActivity() {

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
        setContentView(R.layout.activity_latihan_gambar5)

        val belajar = findViewById<View>(R.id.belajar) as ImageView
        val ruangbelajar = findViewById<View>(R.id.ruangbelajar) as ImageView
        val pr = findViewById<View>(R.id.pr) as ImageView
        val kimia = findViewById<View>(R.id.kimia) as ImageView
        val matematika = findViewById<View>(R.id.matematika) as ImageView


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fbelajar.png?alt=media&token=a4ba9edd-db57-48a7-b102-62eaff2950d4")
            .into(belajar)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fruangbelajar.png?alt=media&token=c12eade0-d8db-4d65-b783-7c23ce9ea962")
            .into(ruangbelajar)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fpekerjaanrumah.png?alt=media&token=b97f204d-8669-4e6a-8069-fd0d89cb8b8a")
            .into(pr)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fkimia.png?alt=media&token=8fb51ab8-75d3-4e22-96e6-a3f8b6974644")
            .into(kimia)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar5%2Fmatematika.png?alt=media&token=505add1b-0f93-4c56-ba69-12283083081b")
            .into(matematika)


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
            if (value_no1!!.text.toString().toLowerCase() == "يُذَاكِرُ") {
                nilai = nilai + 20
            }
            if (value_no2!!.text.toString().toLowerCase() == "غُرْفَةُ الْمُذَاكَرَةِ") {
                nilai = nilai + 20
            }
            if (value_no3!!.text.toString().toLowerCase() == "الْوَاجِبُ الْمَنْزِلِيُّ") {
                nilai = nilai + 20
            }
            if (value_no4!!.text.toString().toLowerCase() == "الْكِيْمِيَاءُ") {
                nilai = nilai + 20
            }
            if (value_no5!!.text.toString().toLowerCase() == "الرِّيَاضِيَّاتُ") {
                nilai = nilai + 20
            }
            val i = Intent(this@LatihanGambar5Activity, ResultGambar5Activity::class.java)
            i.putExtra("nilai", nilai)
            startActivity(i)
            finish()
        })

        back.setOnClickListener {
            val intent = Intent(this@LatihanGambar5Activity,
            LatihanWaraActivity::class.java)
            startActivity(intent)
        }
    }
}