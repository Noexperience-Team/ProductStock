package com.example.testkotlin

import Product
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatViewInflater
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun Add(view: View) {
        val id=findViewById<EditText>(R.id.id)
        val labelle=findViewById<EditText>(R.id.labelle)
        val qte=findViewById<EditText>(R.id.qte)
        val price=findViewById<EditText>(R.id.price)


        val pro =   Product(id.text.toString().toInt(),labelle.text.toString(),qte.text.toString().toInt(),price.text.toString().toFloat())
        id.setText("")
        labelle.setText("")
        qte.setText("")
        price.setText("")
        Log.i("1","${pro.id}${pro.labelle}${pro.price}${pro.qte}")
    }
}