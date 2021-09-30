package net.contriverssoft.activitystate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterTextView: TextView
    private var countValue = 0
    companion object {
        const val SCORE_KEY = "score_key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterTextView = findViewById(R.id.tv_count);
        displayCounter()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(SCORE_KEY,countValue)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        countValue = savedInstanceState.getInt(SCORE_KEY,0)
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