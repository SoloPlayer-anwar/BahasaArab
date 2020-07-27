package com.bahasaarab.bahasaarab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bahasaarab.bahasaarab.SignIn.SignInActivity
import com.bahasaarab.bahasaarab.Utils.Preferences
import kotlinx.android.synthetic.main.activity_ob3.*

class Ob3Activity : AppCompatActivity() {

    lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ob3)

        preferences = Preferences(this)

        val scale = AnimationUtils.loadAnimation(this,R.anim.scale)
        val trans = AnimationUtils.loadAnimation(this,R.anim.translate)

        val ob1 = findViewById<View>(R.id.ob3) as ImageView
        val title = findViewById<View>(R.id.title) as TextView
        val btn1 = findViewById<View>(R.id.next) as Button


        title.startAnimation(scale)
        ob1.startAnimation(trans)
        btn1.startAnimation(scale)

        next.setOnClickListener {
            val intent = Intent(this@Ob3Activity,
            On1Activity::class.java)
            startActivity(intent)
            finishAffinity()
        }

        if (preferences.getValues("onboarding").equals("1")) {
            finishAffinity()

            val intent = Intent(this@Ob3Activity,
                SignInActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }

        lewati.setOnClickListener {
            preferences.setValues("onboarding", "1")
            finishAffinity()

            val intent = Intent(this@Ob3Activity,
                SignInActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }

    }
}