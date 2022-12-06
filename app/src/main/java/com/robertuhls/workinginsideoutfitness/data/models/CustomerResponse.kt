package com.robertuhls.workinginsideoutfitness.data.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CustomerResponse(
    @SerialName("address")
    val address: String,
    @SerialName("birthday")
    val birthday: String,
    @SerialName("email")
    val email: String,
    @SerialName("firstName")
    val firstName: String,
    @SerialName("gender")
    val gender: String,
    @SerialName("_id")
    val id: Int,
    @SerialName("lastName")
    val lastName: String,
    @SerialName("phone")
    val phone: String,
    @SerialName("results")
    val username: String
)