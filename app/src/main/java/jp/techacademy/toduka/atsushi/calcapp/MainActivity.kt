package jp.techacademy.toduka.atsushi.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import jp.techacademy.toduka.atsushi.calcapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //  button1.text = "ボタン"
        button1.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)/* button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)*/
    }
    /* override fun onClick(v: View) {
         when(v.id){
             R.id.button1 -> textView.text =
             R.id.button2 -> showAlertDialog()
             R.id.button3 -> showTimePickerDialog()
             R.id.button4 -> showDatePickerDialog()
         }
     }*/
}//
