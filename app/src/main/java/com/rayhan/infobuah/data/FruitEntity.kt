package com.rayhan.infobuah.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class FruitEntity(
    val namaBuah: String,
    val imgBuah: Int,
    val namaLtnBuah: String,
    val deskBuah: String,
    val kdrAir: String,
    val kdrGula: String
): Parcelable
