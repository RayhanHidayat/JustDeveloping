package com.rayhan.infobuah.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rayhan.infobuah.data.FruitEntity
import com.rayhan.infobuah.databinding.ItemBuahBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class HomeAdapter(private val list: ArrayList<FruitEntity>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    lateinit var listener: HomeRecyclerViewClickListener

    inner class ViewHolder(private val binding: ItemBuahBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(fruitEntity: FruitEntity) {
            with(binding) {
                tvTitle.text = fruitEntity.namaBuah
                tvLatin.text = fruitEntity.namaLtnBuah

                Glide.with(itemView.context).load(fruitEntity.imgBuah)
                    .apply(RequestOptions.bitmapTransform(RoundedCornersTransformation(5, 0)))
                    .into(imgBuah)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemBuahBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])

        holder.itemView.setOnClickListener {
            listener.onItemClicked(list[position])
        }
    }

    override fun getItemCount(): Int = list.size

}