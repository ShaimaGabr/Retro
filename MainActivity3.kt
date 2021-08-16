package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btn=findViewById(R.id.btn)
        btn.setOnClickListener {
            MyCustomDialog().show(supportFragmentManager, "MyCustomFragment")
        }
    }
}