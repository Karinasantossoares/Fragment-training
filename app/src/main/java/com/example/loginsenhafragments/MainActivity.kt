package com.example.loginsenhafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_login.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragmentTransition =supportFragmentManager.beginTransaction()
        val fragmentLogin = FragmentLogin.newInstance()
        fragmentTransition.replace(R.id.container,fragmentLogin)
        fragmentTransition.commit()
    }
}