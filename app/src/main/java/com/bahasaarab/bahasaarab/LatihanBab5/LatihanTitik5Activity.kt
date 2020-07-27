package com.bahasaarab.bahasaarab.LatihanBab5

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.*
import com.bahasaarab.bahasaarab.LatihanBab4.ResultTitik4Activity
import com.bahasaarab.bahasaarab.R

class LatihanTitik5Activity : AppCompatActivity() {

    internal lateinit var btn : ImageView
    internal lateinit var myDialog: Dialog
    internal lateinit var txt : ImageView

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
        setContentView(R.layout.activity_latihan_titik5)


        btn = findViewById<View>(R.id.bantuan) as ImageView

        btn.setOnClickListener{
            ShowDialog()
        }

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
            if (value_no1!!.text.toString().toLowerCase() == "الصَّبَاحِ") {
                nilai = nilai + 20
            }
            if (value_no2!!.text.toString().toLowerCase() == "مَادَّةَ الرِّيَاضِيَّاتِ") {
                nilai = nilai + 20
            }
            if (value_no3!!.text.toString().toLowerCase() == "تَكْتُبُ") {
                nilai = nilai + 20
            }
            if (value_no4!!.text.toString().toLowerCase() == "الطَّعَامِ") {
                nilai = nilai + 20
            }
            if (value_no5!!.text.toString().toLowerCase() == "طَالِبٌ") {
                nilai = nilai + 20
            }
            val i = Intent(this@LatihanTitik5Activity, ResultTitik5Activity::class.java)
            i.putExtra("nilai", nilai)
            startActivity(i)
            finish()
        })

    }

    fun ShowDialog() {

        myDialog = Dialog(this)
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        myDialog.setContentView(R.layout.bantuan_titik5_activity)
        myDialog.setTitle("Ok Selamat Belajar ")

        txt = myDialog.findViewById<View>(R.id.close) as ImageView
        txt.isEnabled = true
        txt.setOnClickListener{
            Toast.makeText(applicationContext, "Ok Selamat Belajar ", Toast.LENGTH_SHORT).show()
            myDialog.cancel()
        }

        myDialog.show()

    }
}