package com.example.ui_darktheme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondark= findViewById<Button>(R.id.btnDark)
        val buttondefault=findViewById<Button>(R.id.btndefault)
        val layout=findViewById<LinearLayout>(R.id.linearLayout)

        buttondefault.setOnClickListener{
            // Change to default color
            layout.setBackgroundResource(R.color.yellow)
        }

        buttondark.setOnClickListener{
            // Change to default color
            layout.setBackgroundResource(R.color.black)
        }
    }
}