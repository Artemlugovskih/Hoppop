package com.example.findexit20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NachaloAvtivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nachalo_avtivity2)
    }

    fun btnNachalo2(view: View) {
        val intent: Intent = Intent(this@NachaloAvtivity2,NachaloActivity4::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        when(view.id){
            R.id.button10->startActivity(intent)}
    }
    fun btnNachalo1(view: View) {
        val intent: Intent = Intent(this@NachaloAvtivity2,NachaloAvtivity3::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        when(view.id){
            R.id.button9->startActivity(intent)}
    }
}