package com.example.mproductv.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mproductv.model.Repository.remote.apis.SHbiography
import com.example.mproductv.model.Repository.remote.apis.SHimage

@Entity(tableName = "here_a_table")
class SHero (@PrimaryKey val id: Int,
                  val name: String,
                  val slug: String,
               //   @Embedded
               //   val biography: SHbiography,
                    @Embedded
                     val images: SHimage)
