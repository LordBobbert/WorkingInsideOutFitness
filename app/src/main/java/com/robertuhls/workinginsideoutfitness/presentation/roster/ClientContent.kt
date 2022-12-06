package com.robertuhls.workinginsideoutfitness.presentation.roster

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.robertuhls.workinginsideoutfitness.data.models.Customer


@Composable
fun LoadingIndicator() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        CircularProgressIndicator()
    }
}

@Composable
fun ClientCard(customer: Customer) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        content = {
            Row {
                Surface(
                    color = SnackbarDefaults
                        .color,
                    modifier = Modifier.size(80.dp)
                ) {}
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("ID : ${customer.id}")
                    Text(customer.firstName)
                }

            }
        }
    )
}



