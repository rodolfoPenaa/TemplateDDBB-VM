package com.example.mproductv.model.Repository.remote.apis

import androidx.room.Embedded

class SHbiography(val fullName: String,
                  val alterEgos: String,
                  @Embedded
                  val aliases: ArrayList<String>,
                  val placeOfBirth: String,
                  val firstAppearance: String,
                  val publisher: String,
                  val alignment: String) {

}