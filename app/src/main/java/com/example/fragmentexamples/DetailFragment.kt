package com.example.fragmentexamples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailFragment : Fragment() {

    lateinit var textContent: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        textContent = view.findViewById(R.id.text_content)

        val param1 = arguments?.getInt("param1", 0)
        val param2 = arguments?.getString("param2")

        textContent.text = "$param1 --- $param2"

        return view
    }

    fun UpdateContent(newContent: String) {
        textContent.text = newContent
    }
}