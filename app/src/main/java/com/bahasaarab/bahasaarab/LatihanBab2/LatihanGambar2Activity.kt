package com.bahasaarab.bahasaarab.LatihanBab2

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
import kotlinx.android.synthetic.main.activity_latihan_gambar.back

class LatihanGambar2Activity : AppCompatActivity() {

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
        setContentView(R.layout.activity_latihan_gambar2)

        val kakek = findViewById<View>(R.id.kakek) as ImageView
        val petani = findViewById<View>(R.id.petani_perempuan) as ImageView
        val sodaralaki = findViewById<View>(R.id.sodara_laki) as ImageView
        val sodaraperempuan = findViewById<View>(R.id.sodara_perempuan) as ImageView
        val keluarga = findViewById<View>(R.id.keluarga) as ImageView


        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fkakek.png?alt=media&token=e014db29-16b1-48c8-b443-57b7eff14a2b")
            .into(kakek)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fpetaniperempuan.png?alt=media&token=c4b25ade-4e62-481b-8f54-8cf014478eb1")
            .into(petani)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fsodaralakilaki.png?alt=media&token=35021fd8-11a5-4cf0-a51b-737b58ae04ff")
            .into(sodaralaki)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fsodaraperempuan.png?alt=media&token=006ef42e-46e6-42dd-9a2a-ec742fb70d8a")
            .into(sodaraperempuan)

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/bahasaarab-7f6d5.appspot.com/o/latihangambar2%2Fkeluarga.png?alt=media&token=56cf346a-5ae6-4637-903d-07085acba4a0")
            .into(keluarga)


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
            if (value_no1!!.text.toString().toLowerCase() == "جَدٌّ") {
                nilai = nilai + 20
            }
            if (value_no2!!.text.toString().toLowerCase() == "فَلاَّحَةٌ") {
                nilai = nilai + 20
            }
            if (value_no3!!.text.toString().toLowerCase() == "أَخٌ") {
                nilai = nilai + 20
            }
            if (value_no4!!.text.toString().toLowerCase() == "أُخْتٌ") {
                nilai = nilai + 20
            }
            if (value_no5!!.text.toString().toLowerCase() == "أُسْرَةٌ") {
                nilai = nilai + 20
            }
            val i = Intent(this@LatihanGambar2Activity, ResultGambar2Activity::class.java)
            i.putExtra("nilai", nilai)
            startActivity(i)
            finish()
        })

        back.setOnClickListener {
            val intent = Intent(this@LatihanGambar2Activity,
                LatihanWaraActivity::class.java)
            startActivity(intent)
        }

    }
}