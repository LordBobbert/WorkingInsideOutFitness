package com.robertuhls.workinginsideoutfitness.presentation.login.auth

data class AuthState(
    val isLoading: Boolean = false,
    val signUpName: String = "",
    val signUpPhone: String = "",
    val signUpUsername: String = "",
    val signUpPassword: String = "",
    val signUpConfirmPassword: String = "",
    val signInUsername: String = "",
    val signInPassword: String = ""
)
