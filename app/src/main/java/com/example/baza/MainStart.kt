package com.example.baza

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainStart : AppCompatActivity(), View.OnClickListener {
    var start: Button? = null
    var clear: Button? = null
    var kolVo: Button? = null
    var del : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)
        start = findViewById<View>(R.id.start) as Button
        start!!.setOnClickListener(this)
        clear = findViewById<View>(R.id.clear) as Button
        clear!!.setOnClickListener(this)
        kolVo = findViewById<View>(R.id.KolVo) as Button
        kolVo!!.setOnClickListener(this)
        del = findViewById<View>(R.id.del) as Button
        del!!.setOnClickListener(this)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.start -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.clear -> {
                    deleteDatabase("romashki")
                    val mycount = Toast.makeText(this, "Информация удалена!!!", Toast.LENGTH_LONG)
                    mycount.setGravity(Gravity.CENTER, 0, 0)
                    mycount.show()
                }
                R.id.KolVo -> {
                    val intent = Intent(this, ActivityKolvo::class.java)
                    startActivity(intent)

                }
                R.id.del -> {
                    val intent = Intent(this, Activity::class.java)
                    startActivity(intent)
                }
                else -> {
                    // else condition
                }


            }
        }


    }
}




