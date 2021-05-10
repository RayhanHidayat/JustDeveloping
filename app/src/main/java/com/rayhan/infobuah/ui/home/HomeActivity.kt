package com.rayhan.infobuah.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rayhan.infobuah.data.FruitEntity
import com.rayhan.infobuah.databinding.ActivityHomeBinding
import com.rayhan.infobuah.ui.detail.DetailActivity
import com.rayhan.infobuah.utils.DataDummy

class HomeActivity : AppCompatActivity(), HomeRecyclerViewClickListener {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val homeAdapter = HomeAdapter(DataDummy.generateDummyFruits())
            rvHome.setHasFixedSize(true)
            rvHome.apply {
                layoutManager = LinearLayoutManager(this@HomeActivity)
                adapter = homeAdapter
            }

            homeAdapter.listener = this@HomeActivity
        }
    }

    private fun showSelectedFruit(fruitEntity: FruitEntity) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_FRUIT, fruitEntity)
        startActivity(intent)
    }

    override fun onItemClicked(fruitEntity: FruitEntity) {
        showSelectedFruit(fruitEntity)
    }
}