package com.example.mproductv.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hereatable")
class SHero (@PrimaryKey val id: String,
             val name: String,
             val slug: String,
             val urlsimg: String,
             val images: String){
    }