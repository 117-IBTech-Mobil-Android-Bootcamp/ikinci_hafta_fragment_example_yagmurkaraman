package com.example.homework2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class InitialTestFragment : Fragment(R.layout.fragment_initial_test) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonStart = getView()?.findViewById<CardView>(R.id.button_start)

        buttonStart?.setOnClickListener {

            val intent = Intent(activity, MainQuestionActivity::class.java)
            // put question word
            intent.putExtra("string", "Visualize")
            // put answers
            intent.putExtra("string", arrayOf("Görselleştirmek", "Altında", "Bağış", "Ensülin"))
            // call extension function for start activity
            activity?.startActivity(intent)
        }
    }
}