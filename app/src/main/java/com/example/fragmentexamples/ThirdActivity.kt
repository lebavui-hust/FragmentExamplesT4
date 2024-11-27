package com.example.fragmentexamples

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val fragment1 = BlankFragment.newInstance("RED", "Hello")
        val fragment2 = BlankFragment.newInstance("GREEN", "World")

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView1, fragment1)
            .add(R.id.fragmentContainerView2, fragment2)
            .commit()

    }
}