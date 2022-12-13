package com.example.marvelchampionstracker.network.card

import com.google.gson.annotations.SerializedName

data class CardsResponse(
    @SerializedName("type_code") val typeCode: String,
    @SerializedName("card_set_name") val cardSetName: String,
    @SerializedName("imagesrc") val imageSrc: String
)