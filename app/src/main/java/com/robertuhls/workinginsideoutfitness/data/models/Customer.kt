package com.robertuhls.workinginsideoutfitness.data.models

@kotlinx.serialization.Serializable
data class Customer(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val username: String,
    val birthday: String,
    val phone: String,
    val email: String,
    val address: String,
    val gender: String,
)
