package com.delreal.pamela.prueba

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // mensaje de la tarea (puede ir en duro)
        findViewById<TextView>(R.id.message).text = "Del Real – Pamela – 21/08/2025"
    }
}
