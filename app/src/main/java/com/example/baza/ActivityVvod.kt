package com.example.baza

import android.content.ContentValues
import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlinx.android.synthetic.main.activity_vvod.*


class ActivityVvod : AppCompatActivity(), View.OnClickListener {

   var Vvod: Button? = null
   var kollvo: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vvod)
        kollvo = findViewById<View>(R.id.kollvo) as EditText
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


