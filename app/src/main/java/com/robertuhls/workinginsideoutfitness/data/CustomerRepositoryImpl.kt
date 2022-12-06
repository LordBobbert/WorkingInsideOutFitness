package com.robertuhls.workinginsideoutfitness.data

import com.robertuhls.workinginsideoutfitness.data.models.Customer
import com.robertuhls.workinginsideoutfitness.data.models.CustomerResponse
import com.robertuhls.workinginsideoutfitness.data.network.BASE_URL
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*

private const val CUSTOMERS = "${BASE_URL}/customer"

class CustomerRepositoryImpl(
    private val httpClient: HttpClient
) : CustomerRepository {
    override suspend fun getCustomers(): Resource<List<Customer>> {
        return try{
            Resource.Success(
                httpClient.get("http://0.0.0.0:8080/customer"){


                }

                        //httpClient.get{url(CUSTOMERS) }

            )
        } catch(e: Exception){
            e.printStackTrace()
            Resource.Failure(e)
        }



    }
}