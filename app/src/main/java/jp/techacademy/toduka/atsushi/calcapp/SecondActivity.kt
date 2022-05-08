package jp.techacademy.toduka.atsushi.calcapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getFloatExtra("VALUE1", 0f)
        val value2 = intent.getFloatExtra("VALUE2", 0f)

        textView.text = "${value1 + value2}"
    }
}