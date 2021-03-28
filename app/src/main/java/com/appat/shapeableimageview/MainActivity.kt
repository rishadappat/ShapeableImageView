package com.appat.shapeableimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appat.shapeableimageview.databinding.ActivityMainBinding
import com.google.android.material.shape.CornerFamily

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.cornerSlider.addOnChangeListener { _, value, _ ->
            setCornerToImageView(value)
        }

        binding.cornerFamilyGroup.setOnCheckedChangeListener { _, _ ->
            setCornerToImageView(binding.cornerSlider.value)
        }

        binding.cornerGroup.setOnCheckedChangeListener { _, _ ->
            setCornerToImageView(binding.cornerSlider.value)
        }
    }

    private fun setCornerToImageView(value: Float)
    {
        var cornerFamily = CornerFamily.ROUNDED
        if(binding.cornerFamilyGroup.checkedRadioButtonId == R.id.cut)
        {
            cornerFamily = CornerFamily.CUT
        }
        when (binding.cornerGroup.checkedRadioButtonId) {
            R.id.all -> {
                binding.imageView.setAllCorners(cornerFamily, value)
            }
            R.id.topLeft -> {
                binding.imageView.setTopLeftCorner(cornerFamily, value)
            }
            R.id.topRight -> {
                binding.imageView.setTopRightCorner(cornerFamily, value)
            }
            R.id.bottomLeft -> {
                binding.imageView.setBottomLeftCorner(cornerFamily, value)
            }
            R.id.bottomRight -> {
                binding.imageView.setBottomRightCorner(cornerFamily, value)
            }
        }
    }
}