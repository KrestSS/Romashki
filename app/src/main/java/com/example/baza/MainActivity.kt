package com.example.baza

import android.app.Activity
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_start.*
import java.nio.file.Paths.get
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter


class MainActivity() : Activity(), View.OnClickListener {
    val LOG_TAG = "myLogs1"
    var COD: EditText? = null
    var DATE: EditText? = null
    internal var romahki: DBHelper? = null
    var data1: Button? = null
    var data2: Button? = null
    var data3: Button? = null
    var data4: Button? = null
    var data5: Button? = null
    var data6: Button? = null
    var data7: Button? = null
    var data8: Button? = null
    var data9: Button? = null
    var data10: Button? = null
    var data11: Button? = null
    var data12: Button? = null


    /** Called when the activity is first created.  */
    @RequiresApi(Build.VERSION_CODES.O)
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        COD = findViewById<View>(R.id.COD) as EditText
        DATE = findViewById<View>(R.id.DATE) as EditText
        data1 = findViewById<View>(R.id.data1) as Button
        data1!!.setOnClickListener(this)
        data2 = findViewById<View>(R.id.data2) as Button
        data2!!.setOnClickListener(this)
        data3 = findViewById<View>(R.id.data3) as Button
        data3!!.setOnClickListener(this)
        data4 = findViewById<View>(R.id.data4) as Button
        data4!!.setOnClickListener(this)
        data5 = findViewById<View>(R.id.data5) as Button
        data5!!.setOnClickListener(this)
        data6 = findViewById<View>(R.id.data6) as Button
        data6!!.setOnClickListener(this)
        data7 = findViewById<View>(R.id.data7) as Button
        data7!!.setOnClickListener(this)
        data8 = findViewById<View>(R.id.data8) as Button
        data8!!.setOnClickListener(this)
        data9 = findViewById<View>(R.id.data9) as Button
        data9!!.setOnClickListener(this)
        data10 = findViewById<View>(R.id.data10) as Button
        data10!!.setOnClickListener(this)
        data11 = findViewById<View>(R.id.data11) as Button
        data11!!.setOnClickListener(this)
        data12 = findViewById<View>(R.id.data12) as Button
        data12!!.setOnClickListener(this)

        val date = LocalDate.now()
        val formatter = DateTimeFormatter.ofPattern("MM-yyyy")
        val formatted = date.format(formatter)
        val period = Period.of(0, 1, 0)
        val Date2 = date.plus(period)
        val Date3 = Date2.plus(period)
        val Date4 = Date3.plus(period)
        val Date5 = Date4.plus(period)
        val Date6 = Date5.plus(period)
        val Date7 = Date6.plus(period)
        val Date8 = Date7.plus(period)
        val Date9 = Date8.plus(period)
        val Date10 = Date9.plus(period)
        val Date11 = Date10.plus(period)
        val Date12 = Date11.plus(period)

        val formatted1 = Date2.format(formatter)
        val formatted2 = Date3.format(formatter)
        val formatted3 = Date4.format(formatter)
        val formatted4 = Date5.format(formatter)
        val formatted5 = Date6.format(formatter)
        val formatted6 = Date7.format(formatter)
        val formatted7 = Date8.format(formatter)
        val formatted8 = Date9.format(formatter)
        val formatted9 = Date10.format(formatter)
        val formatted10 = Date11.format(formatter)
        val formatted11 = Date12.format(formatter)

        data1?.text = formatted.toString()
        data2?.text = formatted1.toString()
        data3?.text = formatted2.toString()
        data4?.text = formatted3.toString()
        data5?.text = formatted4.toString()
        data6?.text = formatted5.toString()
        data7?.text = formatted6.toString()
        data8?.text = formatted7.toString()
        data9?.text = formatted8.toString()
        data10?.text = formatted9.toString()
        data11?.text = formatted10.toString()
        data12?.text = formatted11.toString()



        // создаем объект для создания и управления версиями БД
        romahki = DBHelper(this)
    }

    @Suppress("UNUSED_VARIABLE")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onClick(v: View) {

        // создаем объект для данных
        val cv = ContentValues()

        // получаем данные из полей ввода
        val cod = COD!!.text.toString()


        // подключаемся к БД
        val db = romahki!!.writableDatabase
        when (v.id) {
            R.id.data1 -> {
                val data1 = data1!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data1)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data2 -> {
                val data2 = data2!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data2)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data3 -> {
                val data3 = data3!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data3)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data4 -> {
                val data4 = data4!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data4)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data5 -> {
                val data5 = data5!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data5)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data6 -> {
                val data6 = data6!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data6)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data7 -> {
                val data7 = data7!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data7)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data8 -> {
                val data8 = data8!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data8)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data9 -> {
                val data9 = data9!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data9)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data10 -> {
                val data10 = data10!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data10)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data11 -> {
                val data11 = data11!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data11)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }
            R.id.data12 -> {
                val data12 = data12!!.text.toString()
                Log.d(LOG_TAG, "--- Insert in romaski: ---")
                cv.put("COD", cod)
                cv.put("DATE", data12)
                val rowID = db.insert("romashki", null, cv)
                Log.d(LOG_TAG, "row inserted, ID = $rowID")
                COD!!.text.clear()
                DATE!!.text.clear()
            }

        }
        // закрываем подключение к БД
        romahki!!.close()
    }

    internal inner class DBHelper(context: Context?) : SQLiteOpenHelper(context, "romashki", null, 1) {
        override fun onCreate(db: SQLiteDatabase) {
            Log.d(LOG_TAG, "--- onCreate database ---")
            // создаем таблицу с полями
            db.execSQL(("create table romashki ("
                    + "id integer primary key autoincrement,"
                    + "COD text,"
                    + "DATE text" + ");"))

        }

        override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}
    }

}

private operator fun Int.rangeTo(kvl: EditText?) { 1..100

}




