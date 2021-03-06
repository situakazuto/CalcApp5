package jp.techacademy.toduka.atsushi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class CalcResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("RESULT", 0.0)

        Log.d("UI_PARTS", value1.toString())

        textView.text = "${value1.toString()}"
    }
}