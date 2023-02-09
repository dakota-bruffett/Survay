package com.example.survay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.survay.R.id.Yes_button

class MainActivity : AppCompatActivity() {
    lateinit var Yes_button: Button
    lateinit var no_button: Button
    lateinit var yes_textbox: TextView
    lateinit var No_text: TextView
    lateinit var Question_text: EditText
    lateinit var Reset_button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        Yes_button = findViewById(R.id.Yes_button)
        no_button = findViewById(R.id.no_button)
        yes_textbox = findViewById(R.id.yes_box)
        No_text = findViewById(R.id.No_text)
        Question_text = findViewById(R.id.Question_text)
        Reset_button = findViewById(R.id.Reset_button)

        Reset_button.setOnClickListener {
            ResetViewModel.clearSurvay()
            updateSurvay()

        }

            val savedResult = savedInstanceState.getString(Reset_button)
        survayListAdded = savedResult
        updateSurvay()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}