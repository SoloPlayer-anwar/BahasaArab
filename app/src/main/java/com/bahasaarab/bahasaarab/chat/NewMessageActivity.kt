package com.bahasaarab.bahasaarab.chat

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextWatcher
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.bahasaarab.bahasaarab.Home.MenuAwalActivity
import com.bahasaarab.bahasaarab.R
import com.bahasaarab.bahasaarab.SignIn.User
import com.bahasaarab.bahasaarab.Utils.Preferences
import com.bumptech.glide.Glide
import com.google.firebase.database.*
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_new_message.*
import kotlinx.android.synthetic.main.user_row_new_message.view.*

class NewMessageActivity : AppCompatActivity() {

    lateinit var preferences: Preferences
    lateinit var mDatabaseReference: DatabaseReference

    private var searchUser: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_message)

        mDatabaseReference = FirebaseDatabase.getInstance().getReference("User")
        preferences = Preferences(this)


        fetchUser()

        kembalilah.setOnClickListener {
            val intent = Intent(this@NewMessageActivity,
            MenuAwalActivity::class.java)
            startActivity(intent)
            finish()
        }

    }




    companion object {
        val USER_KEY = "USER_KEY"
    }

   private fun fetchUser() {
       val ref = FirebaseDatabase.getInstance().getReference("User")
       ref.addListenerForSingleValueEvent(object : ValueEventListener {

           override fun onDataChange(p0: DataSnapshot) {
               val adapter = GroupAdapter<ViewHolder>()

               p0.children.forEach {
                   Log.d("NewMessage",it.toString())
                   val user = it.getValue(User::class.java)
                   if (user != null) {
                       adapter.add(UserItem(user))

                   }
               }


               recyclerview_newmessage.adapter = adapter
           }

           override fun onCancelled(p0: DatabaseError) {
           }
       })
    }
}

class UserItem(val user : User): Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.username.text = user.nama
        viewHolder.itemView.gmail.text = user.email
        Glide.with(viewHolder.itemView)
            .load(user.url)
            .into(viewHolder.itemView.photo)
    }
    override fun getLayout(): Int {
        return R.layout.user_row_new_message
    }

}