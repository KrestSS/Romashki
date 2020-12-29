package com.example.baza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

@Suppress("UNREACHABLE_CODE")
class ActivityVvod : AppCompatActivity(), View.OnClickListener {

    var Vvod: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vvod)
        Vvod = findViewById<View>(R.id.Vvod) as Button
        Vvod!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.Vvod -> {
                    val intent = Intent(this, ActivityKolvo::class.java)
                    startActivity(intent)
                }

            }
        }
    }
}