package com.example.myspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myspace.fragments.Home
import com.example.myspace.fragments.Quiz
import com.example.myspace.fragments.Space
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottom_navigation = findViewById(R.id.bottom_navigation) as BottomNavigationView
        val editText = findViewById(R.id.bottom_navigation) as BottomNavigationView

        val home= Home()
        val quiz= Quiz()
        val space= Space()

        var bundle :Bundle ?=intent.extras
        var message = bundle!!.getString("value")
        var email: String? = intent.getStringExtra("value")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        setCurrentFragment(home)


        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> setCurrentFragment(home)
                R.id.nav_quiz -> setCurrentFragment(quiz)
                R.id.nav_space -> setCurrentFragment(space)
            }
            true
        }

    }


    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}