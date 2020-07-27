package com.bahasaarab.bahasaarab.LatihanBab6

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.app.NotificationCompat
import com.bahasaarab.bahasaarab.Home.MenuAwalActivity
import com.bahasaarab.bahasaarab.R
import kotlinx.android.synthetic.main.activity_result_titik6.*

class ResultTitik6Activity : AppCompatActivity() {

    var txt_nilai: TextView? = null
    var txt_comment: TextView? = null
    var cobalagi: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_titik6)

        txt_nilai = findViewById(R.id.txt_nilai)
        txt_comment = findViewById(R.id.txt_comment)
        cobalagi = findViewById(R.id.btn_cobalagi)
        val nilai = intent.extras!!.getInt("nilai")

        txt_nilai!!.setText(nilai.toString())

        if (nilai >= 80) {
            notif6.visibility = View.VISIBLE

            txt_comment!!.setText("Kamu lulus, dan mendapatkan Nilai Terbaik")
        } else if (nilai >= 60) {
            notif6.visibility = View.VISIBLE

            txt_comment!!.setText("Selamat Kamu Lulus")
        } else {
            txt_comment!!.setText("Kamu harus belajar lagi")
        }
        cobalagi!!.setOnClickListener(View.OnClickListener {
            val i = Intent(this@ResultTitik6Activity, LatihanTitik6Activity::class.java)
            startActivity(i)
            finish()
        })

        notif6.setOnClickListener {
            showNotif6()
        }

    }

    private fun showNotif6() {
        val NOTIFICATION_CHANNEL_ID = "channel_Belajar Bahasa Arab UPB UIN ANTASARI BANJARMASIN"
        val context = this.applicationContext
        var notificationManager =
            context.getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            val channelName = "Belajar Bahasa Arab UPB UIN ANTASARI BANJARMASIN notif"
            val importance = NotificationManager.IMPORTANCE_HIGH

            val mChannel = NotificationChannel(NOTIFICATION_CHANNEL_ID, channelName, importance)
            notificationManager.createNotificationChannel(mChannel)
        }

//        val mIntent = Intent(this, CheckoutSuccessActivity::class.java)
//        val bundle = Bundle()
//        bundle.putString("id", "id_film")
//        mIntent.putExtras(bundle)

        val mIntent = Intent(this, MenuAwalActivity::class.java)
        val bundle = Bundle()
        mIntent.putExtras(bundle)


        val pendingIntent =
            PendingIntent.getActivity(this, 0, mIntent, PendingIntent.FLAG_UPDATE_CURRENT)

        val builder = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
        builder.setContentIntent(pendingIntent)
            .setSmallIcon(R.mipmap.ic_launcher_foreground)
            .setLargeIcon(
                BitmapFactory.decodeResource(
                    this.resources,
                    R.mipmap.ic_launcher_foreground
                )
            )
            .setTicker("notif Belajar Bahasa Arab UPB UIN ANTASARI BANJARMASIN")
            .setAutoCancel(true)
            .setVibrate(longArrayOf(1000, 1000, 1000, 1000, 1000))
            .setLights(Color.RED, 3000, 3000)
            .setDefaults(Notification.DEFAULT_SOUND)
            .setContentTitle("Selamat Latihan Bab6 Clear")
            .setContentText("Silahkan klik disini jika anda mau melanjutkan materi bab6!")

        notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(115, builder.build())

    }

}