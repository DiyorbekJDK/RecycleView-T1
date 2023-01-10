package com.diyorbek.recycleviewtask.util

import com.diyorbek.recycleviewtask.R
import com.diyorbek.recycleviewtask.model.Image
import com.diyorbek.recycleviewtask.model.Pictures

object Constants {
    fun imageList(): MutableList<Image> {
        return mutableListOf(
            Image(R.drawable.picture_one),
            Image(R.drawable.picture_second),
            Image(R.drawable.picture_three),
            Image(R.drawable.picture_four)
        )

    }

    fun pictureList(): MutableList<Pictures> {
        return mutableListOf(
            Pictures(R.drawable.avenger_two, "Andorid"),
            Pictures(R.drawable.picture_four, "Kotlin"),
            Pictures(R.drawable.avengers_one, "Java"),
            Pictures(R.drawable.laptop_six, "Windows"),
        )

    }

}