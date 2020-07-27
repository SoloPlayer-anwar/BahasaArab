package com.bahasaarab.bahasaarab.LatihanBab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.bahasaarab.bahasaarab.LatihanBab3.LatihanTanya3Activity
import com.bahasaarab.bahasaarab.LatihanBab3.LatihanTitik3Activity
import com.bahasaarab.bahasaarab.R
import kotlinx.android.synthetic.main.activity_result_gambar.*

class ResultTanya4Activity : AppCompatActivity() {

    var txt_nilai: TextView? = null
    var txt_comment: TextView? = null
    var cobalagi: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_tanya4)

        txt_nilai = findViewById(R.id.txt_nilai)
        txt_comment = findViewById(R.id.txt_comment)
        cobalagi = findViewById(R.id.btn_cobalagi)
        val nilai = intent.extras!!.getInt("nilai")

        txt_nilai!!.setText(nilai.toString())

        if (nilai >= 80) {
            notif.visibility = View.VISIBLE

            txt_comment!!.setText("Kamu lulus, dan mendapatkan Nilai Terbaik")
        } else if (nilai >= 60) {
            notif.visibility = View.VISIBLE

            txt_comment!!.setText("Selamat Kamu Lulus")
        } else {
            txt_comment!!.setText("Kamu harus belajar lagi")
        }
        cobalagi!!.setOnClickListener(View.OnClickListener {
            val i = Intent(this@ResultTanya4Activity, LatihanTanya4Activity::class.java)
            startActivity(i)
            finish()
        })

        notif.setOnClickListener {
            val intent = Intent(this@ResultTanya4Activity,
                LatihanTitik4Activity::class.java)
            startActivity(intent)
        }

    }
}