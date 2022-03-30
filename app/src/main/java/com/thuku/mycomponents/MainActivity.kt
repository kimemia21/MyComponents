package com.thuku.mycomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePicker:DatePicker=findViewById(R.id.my_datepicker)
        val choosenDate=Calendar.getInstance()
        datePicker.init(choosenDate.get(Calendar.YEAR),choosenDate.get(Calendar.MONTH),choosenDate.get(Calendar.DAY_OF_MONTH)){
            view,year,month,day ->
            val month =month +1
            val msg ="you selected $day/$month/$year"
            Toast.makeText(this ,msg,Toast.LENGTH_SHORT).show()
        }
    }
}