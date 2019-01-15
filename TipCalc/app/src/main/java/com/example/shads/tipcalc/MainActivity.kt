package com.example.shads.tipcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipPercentage = tipEditText.text.toString().toDouble() / 100

            val tip = bill * tipPercentage
            val billTotal = bill + tip

            infoTextView.visibility = View.VISIBLE

            infoTextView.text = "Tip: ${doubleToDollar(tip)} Total: ${doubleToDollar(billTotal)}"
        }
    }

    private fun doubleToDollar(number: Double): String {
        return "$" + String.format("%.2f", number)
    }

}
