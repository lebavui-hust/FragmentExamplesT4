package com.example.fragmentexamples

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FourthActivity : AppCompatActivity(), ItemClickListener {

    val listFragment = ListFragment()
    val detailFragment = DetailFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        supportFragmentManager.beginTransaction()
            .add(R.id.layout_list, listFragment)
            .add(R.id.layout_detail, detailFragment)
            .commit()
    }

    override fun OnItemClicked(item: String) {
        detailFragment.UpdateContent(item)
    }
}