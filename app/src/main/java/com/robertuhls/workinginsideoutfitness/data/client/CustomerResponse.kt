package com.robertuhls.workinginsideoutfitness.data.client

import kotlinx.serialization.Serializable

@Serializable
data class CustomerResponse(
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
