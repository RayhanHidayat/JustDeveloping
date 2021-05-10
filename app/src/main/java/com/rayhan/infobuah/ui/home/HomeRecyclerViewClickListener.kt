package com.rayhan.infobuah.ui.home

import com.rayhan.infobuah.data.FruitEntity

interface HomeRecyclerViewClickListener {
    fun onItemClicked(fruitEntity: FruitEntity)
}