package com.eyyuperdogan.flowers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eyyuperdogan.flowers.databinding.ActivityDetailsBinding
import com.eyyuperdogan.flowers.databinding.ActivityMainBinding

private lateinit var binding: ActivityDetailsBinding
class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val selectedLendmark=intent.getSerializableExtra("landmark") as landmark

        binding.textViewName.text=selectedLendmark.name
        binding.textViewExlanation.text=selectedLendmark.expectation
        binding.imageView.setImageResource(selectedLendmark.image)


    }
}