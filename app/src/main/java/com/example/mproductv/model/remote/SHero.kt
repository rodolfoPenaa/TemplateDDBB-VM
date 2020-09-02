package com.example.mproductv.model.remote

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mproductv.model.Repository.SHbiography
import com.example.mproductv.model.SHimage

@Entity(tableName = "hereatable")
data class SHero (@PrimaryKey val id: Int,
             val name: String,
             val slug: String,
             @Embedded
             val biography: SHbiography,
             @Embedded
             val images: SHimage)
