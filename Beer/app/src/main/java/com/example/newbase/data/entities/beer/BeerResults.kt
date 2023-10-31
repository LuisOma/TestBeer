package com.example.newbase.data.entities.beer

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Beers")
data class BeerResults(
    @PrimaryKey
    @SerializedName("id") var id: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("tagline") var tagline: String? = null,
    @SerializedName("first_brewed") var firstBrewed: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("image_url") var imageUrl: String? = null,
    @SerializedName("abv") var abv: Double? = null,
    @SerializedName("ibu") var ibu: Double? = null,
    @SerializedName("target_fg") var targetFg: Int? = null,
    @SerializedName("target_og") var targetOg: Double? = null,
    @SerializedName("ebc") var ebc: Int? = null,
    @SerializedName("srm") var srm: Double? = null,
    @SerializedName("ph") var ph: Double? = null,
    @SerializedName("attenuation_level") var attenuationLevel: Double? = null,
    @SerializedName("brewers_tips") var brewersTips: String? = null,
    @SerializedName("contributed_by") var contributedBy: String? = null
)
