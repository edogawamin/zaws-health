package com.example.zawshealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val medicineDatabase = MedicineDatabase(applicationContext)
        medicineDatabase.createTable()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(
                this@MainActivity,
                HomeActivity::class.java
            )
            startActivity(intent)
            finish()
        }, 2000)
    }
}