package com.bahasaarab.bahasaarab.LatihanBab3

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
import kotlinx.android.synthetic.main.activity_latihan_gambar3.*

class LatihanGambar3Activity : AppCompatActivity() {

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
        setContentView(R.layout.activity_latihan_gambar3)

        val perpus = findViewById<View>(R.id.perpus) as ImageView
        val motor = findViewById<View>(R.id.motor) as ImageView
        val buku = findViewById<View>(R.id.buku) as ImageView
        val meja = findViewById<View>(R.id.meja) as ImageView
        val komputer = findViewById<View>(R.id.komputer) as ImageView



        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fperpustakaan.png?alt=media&token=2563a923-ef41-4c44-beb8-4311ac7e04aa")
            .into(perpus)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fmotor.png?alt=media&token=04061183-05cb-4276-a2be-415302462182")
            .into(motor)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fbuku.png?alt=media&token=2fb54eff-27bd-4246-898b-5608eb29cde7")
            .into(buku)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fmeja.png?alt=media&token=21fe5e12-385a-4403-ac60-dab18086ec67")
            .into(meja)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar3%2Fkomputer.png?alt=media&token=e01c2d68-6c31-4015-a719-68f4b919fd0a")
            .into(komputer)


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
            if (value_no1!!.text.toString().toLowerCase() == "مَكْتَبَةٌ") {
                nilai = nilai + 20
            }
            if (value_no2!!.text.toString().toLowerCase() == "جَوَّالَةٌ") {
                nilai = nilai + 20
            }
            if (value_no3!!.text.toString().toLowerCase() == "كُتُبٌ") {
                nilai = nilai + 20
            }
            if (value_no4!!.text.toString().toLowerCase() == "مَكْتَبٌ") {
                nilai = nilai + 20
            }
            if (value_no5!!.text.toString().toLowerCase() == "حَاسُوْبٌ") {
                nilai = nilai + 20
            }
            val i = Intent(this@LatihanGambar3Activity, ResultGambar3Activity::class.java)
            i.putExtra("nilai", nilai)
            startActivity(i)
            finish()
        })

        back.setOnClickListener {
            val intent = Intent(this@LatihanGambar3Activity,
            LatihanWaraActivity::class.java)
            startActivity(intent)
        }

    }
}