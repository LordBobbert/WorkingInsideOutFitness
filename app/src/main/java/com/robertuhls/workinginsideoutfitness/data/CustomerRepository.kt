package com.robertuhls.workinginsideoutfitness.data

import com.robertuhls.workinginsideoutfitness.data.models.Customer

interface CustomerRepository {
    suspend fun getCustomers(): Resource<List<Customer>>
}