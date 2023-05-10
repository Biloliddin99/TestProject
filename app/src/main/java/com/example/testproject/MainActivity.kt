package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.testproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.myBottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> binding.itemImg.setImageResource(R.drawable.ic_home)
                R.id.settings -> binding.itemImg.setImageResource(R.drawable.ic_settings)
                R.id.favourite -> binding.itemImg.setImageResource(R.drawable.ic_favourite)
                R.id.about -> binding.itemImg.setImageResource(R.drawable.ic_about)
            }
            true
        }

        binding.burgerBtn.setOnClickListener {
            binding.container.open()
        }

        binding.drawerLayout.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home-> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                R.id.settings-> Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                R.id.favourite-> Toast.makeText(this, "Favourite", Toast.LENGTH_SHORT).show()
                R.id.about-> Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}