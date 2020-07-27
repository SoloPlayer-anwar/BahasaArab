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
import kotlinx.android.synthetic.main.activity_on1.*

class On1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on1)


        val scale = AnimationUtils.loadAnimation(this,R.anim.scale)
        val trans = AnimationUtils.loadAnimation(this,R.anim.translate)

        val ob1 = findViewById<View>(R.id.ob1) as ImageView
        val title = findViewById<View>(R.id.title) as TextView
        val btn = findViewById<View>(R.id.mulai) as Button

        title.startAnimation(scale)
        ob1.startAnimation(trans)
        btn.startAnimation(scale)


        mulai.setOnClickListener {
            val intent = Intent(this@On1Activity,
            SignInActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
}