package dev.abdalmonem.testingapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.util.*

class destination : AppCompatActivity() {

    private lateinit var goBack : Button
    var place : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        goBack = findViewById(R.id.back_btn)


        goBack.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var intent = Intent(place, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
}