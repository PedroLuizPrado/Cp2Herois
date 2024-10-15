package com.example.herois

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.herois.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private  lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFirstFragment.setOnClickListener{
            goToFragment(Fragment1())
        }
        binding.buttonSecondFragment.setOnClickListener{
            goToFragment(Fragment2())
        }

    }
     private  fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
         fragmentManager.beginTransaction().replace(R.id.FragmentContaneir, fragment).commit()

     }

}