package com.example.fragmentexamples

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        findViewById<Button>(R.id.button_add).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, BlankFragment(), "TAG")
                .addToBackStack("TAG")
                .commit()
        }

        findViewById<Button>(R.id.button_replace).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment(), "TAG")
                .addToBackStack("TAG")
                .commit()
        }

        findViewById<Button>(R.id.button_remove).setOnClickListener {
            val fragment = supportFragmentManager.findFragmentByTag("TAG")
            if (fragment != null)
                supportFragmentManager.beginTransaction()
                    .remove(fragment)
                    .commit()
        }

        findViewById<Button>(R.id.button_pop).setOnClickListener {
            supportFragmentManager.popBackStack()
        }
    }
}