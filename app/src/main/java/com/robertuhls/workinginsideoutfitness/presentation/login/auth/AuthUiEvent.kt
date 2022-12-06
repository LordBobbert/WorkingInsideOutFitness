package com.robertuhls.workinginsideoutfitness.presentation.login.auth

sealed class AuthUiEvent {
    data class SignUpNameChanged(val value: String): AuthUiEvent()
    data class SignUpPhoneChanged(val value: String): AuthUiEvent()
    data class SignUpUsernameChanged(val value: String): AuthUiEvent()
    data class SignUpPasswordChanged(val value: String): AuthUiEvent()
    data class SignUpConfirmPasswordChanged(val value: String): AuthUiEvent()
    object SignUp: AuthUiEvent()

    data class SignInUsernameChanged(val value: String): AuthUiEvent()
    data class SignInPasswordChanged(val value: String): AuthUiEvent()
    object SignIn: AuthUiEvent()
}
