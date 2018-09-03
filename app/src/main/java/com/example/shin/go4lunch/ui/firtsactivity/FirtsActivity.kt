package com.example.shin.go4lunch.ui.firtsactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.shin.go4lunch.R
import com.example.shin.go4lunch.ui.firtsactivity.fragment.MyMapFragment


class FirtsActivity : AppCompatActivity() ,FirtsContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firts)
        val mapFragment = MyMapFragment()
               supportFragmentManager.beginTransaction().add(R.id.activity_firts_container,mapFragment).commit()

    }
}
