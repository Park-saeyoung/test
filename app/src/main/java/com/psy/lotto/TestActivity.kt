package com.psy.lotto

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test.*
import java.util.jar.Attributes

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        button5.setOnClickListener {
            val intent = Intent(this@TestActivity, MainActivity::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            var intent = Intent(this@TestActivity, NameActivity::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            var intent = Intent(this@TestActivity, ResultActivity::class.java)
            startActivity(intent)
        }
    }

    fun goConstellation(view: View) {
        val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
        startActivity(intent)
    }
}
