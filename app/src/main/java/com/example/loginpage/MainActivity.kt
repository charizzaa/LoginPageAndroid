package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding

    companion object{
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            registerBtn.setOnClickListener{
                val intentSecond = Intent(this@MainActivity, activity_second::class.java)
                intentSecond.putExtra(EXTRA_USERNAME, username.text.toString().trim())
                intentSecond.putExtra(EXTRA_EMAIL, email.text.toString().trim())
                intentSecond.putExtra(EXTRA_PHONE, phone.text.toString().trim())
                intentSecond.putExtra(EXTRA_PASSWORD, password.text.toString().trim())
                startActivity(intentSecond)
            }
        }
    }





}