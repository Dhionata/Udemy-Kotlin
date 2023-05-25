package com.example.udemykotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.buttonRandom
import kotlinx.android.synthetic.main.activity_main.textNumber
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        buttonRandom.setOnClickListener(this)
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    override fun onClick(v: View?) {
        if (v?.id == R.id.buttonRandom || v?.id == R.id.textNumber) {
            textNumber.text = randomNumber().toString()
        } else if (v?.id == R.id.textEditável)
            textNumber.text = "Dhionatã Carlos Vieira"
    }

    private fun randomNumber(): Int {
        return Random.nextInt(1000) + 1
    }
}
