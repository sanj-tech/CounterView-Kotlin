package com.example.counterviewforshoppingcart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.counterviewforshoppingcart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main,)
        binding.simpleCounter.setListener { value ->

            Toast.makeText(this,"$value",Toast.LENGTH_SHORT).show()
        }
    }
}