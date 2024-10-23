package com.example.fragment.UI

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fragment.R
import com.example.fragment.frgarments.examplo_one
import com.example.fragment.frgarments.examplo_two

class MainActivity : AppCompatActivity() {
    lateinit var btnFrg1: Button
    lateinit var btnFr2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnFrg1 = findViewById(R.id.btnFrag1)
        btnFr2 = findViewById(R.id.btnFrag2)

        supportFragmentManager.beginTransaction().add(R.id.fragment_conteiner, examplo_one()).commit()

        //eatdo buton
        btnFrg1.setOnClickListener {
            
            supportFragmentManager.beginTransaction().replace(R.id.fragment_conteiner, examplo_one()).commit()
        }

        btnFr2.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_conteiner, examplo_two()).commit()
        }

    }

}