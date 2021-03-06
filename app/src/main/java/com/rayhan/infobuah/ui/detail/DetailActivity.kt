package com.rayhan.infobuah.ui.detail

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.request.RequestOptions
import com.rayhan.infobuah.data.FruitEntity
import com.rayhan.infobuah.databinding.ActivityDetailBinding
import jp.wasabeef.glide.transformations.CropSquareTransformation
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_FRUIT = ""
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fruits = intent.getParcelableExtra<FruitEntity>(EXTRA_FRUIT)

        supportActionBar?.title = fruits?.namaBuah
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val multi = MultiTransformation<Bitmap>(
            CropSquareTransformation(), RoundedCornersTransformation(10, 0)
        )

        with(binding) {
            tvBuah.text = fruits?.namaBuah ?: notLoaded()
            tvLatin.text = fruits?.namaLtnBuah ?: notLoaded()
            tvDesc.text = fruits?.deskBuah ?: notLoaded()
            tvAir.text = fruits?.kdrAir ?: notLoaded()
            tvGula.text = fruits?.kdrGula ?: notLoaded()

            Glide.with(this@DetailActivity).load(fruits?.imgBuah)
                .apply(RequestOptions.bitmapTransform(multi))
                .into(imgBuah)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun notLoaded(): String = "Not Loaded"
}