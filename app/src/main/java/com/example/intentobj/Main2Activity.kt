package com.example.intentobj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    lateinit var textView : TextView
    lateinit var textView2 : TextView
    lateinit var textView3 : TextView
    lateinit var textView4 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView = findViewById(R.id.total)
        textView2 = findViewById(R.id.firstname)
        textView3 = findViewById(R.id.lastname)
        textView4 = findViewById(R.id.address)

        val employee = intent.getSerializableExtra("employee") as Employees


        textView.text = employee.fisrtname +" " + employee.lastname + " "+  employee.address

        textView2.text = employee.fisrtname
        textView3.text = employee.lastname
        textView4.text = employee.address
    }
}
