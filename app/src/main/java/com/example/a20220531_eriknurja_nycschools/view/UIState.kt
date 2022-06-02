package com.example.a20220531_eriknurja_nycschools.view

sealed class UIState {
    class Success<T>(val response: T): UIState()
    class Error(val exception: Exception): UIState()
    object Loading: UIState()
}
