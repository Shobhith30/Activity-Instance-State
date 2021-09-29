package net.contriverssoft.activitystate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterTextView: TextView
    private var countValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterTextView = findViewById(R.id.tv_count);
        displayCounter()
    }

    fun incrementCounter(view: View) {
        countValue+=1
        displayCounter()
    }


    fun decrementCounter(view: View) {
        countValue-=1
        displayCounter()
    }
    private fun displayCounter() {
       counterTextView.text = countValue.toString()
    }
}