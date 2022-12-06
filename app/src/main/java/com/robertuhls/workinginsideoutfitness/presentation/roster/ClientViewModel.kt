package com.robertuhls.workinginsideoutfitness.presentation.roster

import androidx.lifecycle.ViewModel
import com.robertuhls.workinginsideoutfitness.data.models.Customer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class ClientViewModel : ViewModel() {


    private val uiState = MutableStateFlow(ClientListViewState())
    fun consumableState() = uiState.asStateFlow()

    init {
        //fetchClientListData()
    }

    fun handleViewEvent(viewEvent: ClientListViewEvent) {
        when (viewEvent) {
            is ClientListViewEvent.AddItem -> {

            }
            is ClientListViewEvent.RemoveItem -> {

            }
        }
    }
    /* private fun fetchClientListData(){
        viewModelScope.launch {
            delay(2000)

            val customers = listOf(Customer)
            uiState.value = uiState.value.copy(isLoading = false, customers = customers)
        }
    }
}*/

    data class ClientListViewState(
        val isLoading: Boolean = true,
        val customers: List<Customer> = emptyList(),
        val errorMessage: String? = null
    )

    sealed class ClientListViewEvent {
        data class AddItem(val customer: Customer) : ClientListViewEvent()
        data class RemoveItem(val customer: Customer) : ClientListViewEvent()
    }
}