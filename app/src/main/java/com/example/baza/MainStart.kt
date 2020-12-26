package com.example.baza

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainStart : AppCompatActivity(), View.OnClickListener {
    var begin: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)
        begin = findViewById<View>(R.id.start) as Button
        begin!!.setOnClickListener(this)

    }


    override fun onClick(v: View?) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}
