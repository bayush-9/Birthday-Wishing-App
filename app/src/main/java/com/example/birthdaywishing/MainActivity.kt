package com.example.birthdaywishing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            }

    fun createBirthdayCard(view: View) {
        val name = inputNameTextBox.editableText.toString()
        var intent = Intent(this, BirthdayCard::class.java)
        intent.putExtra( BirthdayCard.EXTRA_NAME ,name)
        startActivity(intent)
    }
}