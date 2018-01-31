package com.example.cemil.intent_share_project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun textShare(view: View) {
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.putExtra(Intent.EXTRA_STREAM, messageText.text.toString())
        shareIntent.type = "text/plain"//intente ne türde veri göndereceğimizi beirtiyoruz.
        startActivity(Intent.createChooser(shareIntent,"Nasıl Paylaşmak İstersiniz?"))
    }
}
