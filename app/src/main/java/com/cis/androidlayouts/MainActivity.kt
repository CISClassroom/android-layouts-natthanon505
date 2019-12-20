package com.cis.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val i = Intent(this,LinearActivity::class.java)
            startActivity(i)}

        button2.setOnClickListener {
            val i = Intent(this,ReletiveActivity::class.java)
            startActivity(i)}

        button3.setOnClickListener {
            val i = Intent(this,ConstrantActivity::class.java)
            startActivity(i)}
    }
}
