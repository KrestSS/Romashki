package com.example.baza

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import kotlinx.android.synthetic.main.activity_kolvo.*
import kotlinx.android.synthetic.main.activity_vvod.*
import com.example.baza.ActivityVvod as ComExampleBazaActivityVvod


open class ActivityVvod : AppCompatActivity(), View.OnClickListener {

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
                    var romahki = ActivityKolvo().DBHelper(this)
                    val db = romahki!!.writableDatabase
                    val cv = ContentValues()
                    val c: Cursor = db.query("romashki", null, null, null, null, null, null)
                    if (c.moveToLast()) {
                        val idColIndex = c.getColumnIndex("id")
                        val nameColIndex = c.getColumnIndex("COD")
                        val emailColIndex = c.getColumnIndex("DATE")
                        //   Log.d(LOG_TAG, "row inserted, ID =  + c.getInt(idColIndex)")
                        cv.put("COD", c.getString(nameColIndex))
                        cv.put("DATE", c.getString(emailColIndex))
                        var kolv = kollvo!!.text.toString()
                        var kvl = kolv.toInt()
                        var n = kvl
                        repeat(n - 1) {
                            var put = db.insert("romashki", null, cv)
                            c.close()
                        }
                            val intent = Intent(this, ActivityKolvo::class.java)
                            startActivity(intent)
                            finish()
                        }

                    }
                }
            }

        }

    }



