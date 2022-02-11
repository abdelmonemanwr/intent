package dev.abdalmonem.testingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var go : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        go = findViewById(R.id.go_btn)

        go.setOnClickListener{
            var intent = Intent(this, destination::class.java)
            startActivity((intent))
            finish()
        }

    }
}