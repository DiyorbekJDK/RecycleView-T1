package com.diyorbek.recycleviewtask.model

import androidx.annotation.DrawableRes

data class Item(
    @DrawableRes val itemImage: Int,
    val itemName: String,
    val backColor: Int
)