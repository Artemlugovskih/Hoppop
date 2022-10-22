package com.example.findexit20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
    }

    fun btnVibor1_4(view: View){ val intent: Intent = Intent(this@MainActivity6,MainActivity4::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        when(view.id){
            R.id.button->startActivity(intent)}}
    fun btnVibor1_5(view: View) { val intent: Intent = Intent(this@MainActivity6,MainActivity10::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        when(view.id){
            R.id.button3->startActivity(intent)}}
}